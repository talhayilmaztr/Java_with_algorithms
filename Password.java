
import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Password: ");
        String your_password = input.nextLine();

        String result = password(your_password);
        System.out.println(result);

    }
    public static String password(String password) {
        int digitCount = 0;
        int upper = 0;

        if (password.length() < 6){
            return "Invalid password: Password length should be at least 6 characters.";
        }
        for (int i = 0; i < password.length(); i++) {
            char currentChar = password.charAt(i);
            
            if (Character.isDigit(currentChar)) {
                digitCount++;
            } else if (Character.isUpperCase(currentChar)) {
                upper++;
            } else if (!(currentChar == '!' || currentChar == '&' || currentChar == '%')) {
                return "Invalid password: Password should contain only digits, uppercase letters, and special characters '!&%'.";
            }
        }
        if (digitCount < 2){
            return "Invalid password: Password should contain at least 2 digits.";
        }
        if (upper < 1){
            return "Invalid password: Password should contain at least 1 uppercase letter.";
        }
        return "Valid password";
    }

    }

    

