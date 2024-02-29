import java.util.Scanner;

public class Digit_histogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive number:");
        int number = input.nextInt();

        // Convert the number to a string
        String numberStr = Integer.toString(number);

        // Draw the histogram for each digit
        for (int i = 0; i < numberStr.length(); i++) {
            char digitChar = numberStr.charAt(i);
            int digit = Character.getNumericValue(digitChar);

            // Use "+" sign to represent the digit
            for (int j = 0; j < digit; j++) {
                System.out.print("+");
            }
            System.out.println(); // Move to a new line for each digit
        }
    }
}

    

