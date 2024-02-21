import java.util.Scanner;

public class Dec2hex {
  /** Main method */
  public static void main(String[] args) {
    // Create a Scanner
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter a decimal integer
    System.out.print("Enter a decimal number: ");
    int decimal = input.nextInt();

    // Convert decimal to hex
    String hex = "";
    
    while (decimal != 0) {
      // Get the remainder when dividing by 16
      int hexValue = decimal % 16; 
      
      // Convert a decimal value to a hex digit 
      char hexDigit = (hexValue <= 9 && hexValue >= 0) ?
        (char)(hexValue + '0') : (char)(hexValue - 10 + 'A');
      
      // Prepend the hex digit to the hex string
      hex = hexDigit + hex;
      
      // Update decimal by dividing it by 16
      decimal = decimal / 16;
    }
    // Display the result
    System.out.println("The hex number is " + hex);
  }
}

    

