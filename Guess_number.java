import java.util.Scanner;

public class Guess_number {
     public static void main(String[] args) {
    // Generate a random number to be guessed
    int number = (int)(Math.random() * 101);
    Scanner input = new Scanner(System.in);
    System.out.println("Guess a magic number between 0 and 100");
    
    int guess = -1;
    int tries = 0;
    while (guess != number) {
      // Prompt the user to guess the number
      System.out.print("\nEnter your guess: ");
      guess = input.nextInt();
      tries++;
      
      if (guess == number){
        System.out.println("Yes, the number is " + number + ". You guessed it in " + tries + " tries!");
      }else if (guess > number){
        System.out.println("Your guess is too high");
      }else
        System.out.println("Your guess is too low");
    } // End of loop
  }
}
    

