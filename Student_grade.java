import java.util.Scanner;
public class Student_grade { 
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the answer key(5 character):");
        String answer_key = input.next();
        String student_answer = "";
        int student_grade = 0;
        int max_grade = 0, max_id = 0;
        for (int student_no = 1; student_no <= 3; student_no++) {
            System.out.print("Student " + student_no + " answer(5 character): ");
            student_answer = input.next();
            for (int idx = 0; idx < answer_key.length(); idx++) {
                if (answer_key.charAt(idx) == student_answer.charAt(idx)) {
                    student_grade += 20;
                }
            }
            System.out.println("Student " + student_no + " Grade:" + student_grade);
            if (student_grade > max_grade) {
                max_grade = student_grade;
                max_id = student_no;
            }
            student_grade = 0;
        }
        System.out.println("Max Grade: " + max_grade);
        System.out.println("ID with the highest grade :" + max_id);
    }
}
