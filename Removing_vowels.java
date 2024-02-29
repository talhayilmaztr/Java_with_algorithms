import java.util.Scanner;

public class Removing_vowels {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the sentence : ");
        String str = input.nextLine();
        str = str.toLowerCase();
        
        String result = "", vowels = "";
        char c;
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowels += Character.toString(c);
            } else {
                result += Character.toString(c);
            }
        }
        System.out.println(result);
    }
}

