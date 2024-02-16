/* 
This Java program, named Student_grade, allows users to input an answer key
and assess the grades of three students based on their answers.
The program iterates through each student, comparing their answers 
with the provided answer key. The grades are calculated by awarding 
20 points for each correct answer. The program also identifies the 
student with the highest grade and displays their ID.

To use the program, the user needs to input a 5-character answer key 
and the individual answers of each student. The program then outputs 
the grades for each student, the maximum grade achieved, and the 
corresponding student ID.

Example Usage:
1. Enter the answer key (5 characters): ABCDE
2. Enter the answers for Student 1 (5 characters): ABCDE
   Student 1 Grade: 100
3. Enter the answers for Student 2 (5 characters): BCDEA
   Student 2 Grade: 0
4. Enter the answers for Student 3 (5 characters): ABCDE
   Student 3 Grade: 100
Max Grade: 100
ID with the highest grade: 1
*/
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
