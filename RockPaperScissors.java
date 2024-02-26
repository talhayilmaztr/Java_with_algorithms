import java.util.Scanner;
public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomNum = (int) (Math.random() * 3);

        System.out.println("For scissors, enter = 0");
        System.out.println("For rock, enter = 1");
        System.out.println("For paper, enter = 2");
        
        int userChoice = scanner.nextInt();
        switch (userChoice) {
            case 0:
                System.out.println("You chose scissors.");
                break;
            case 1:
                System.out.println("You chose rock.");
                break;
            case 2:
                System.out.println("You chose paper.");
                break;
            default:
                break;
        }
        switch (randomNum) {
            case 0:
                System.out.println("Computer chose scissors.");
                break;
            case 1:
                System.out.println("Computer chose rock.");
                break;
            case 2:
                System.out.println("Computer chose paper.");
                break;
            default:
                break;
        }
        if (userChoice > randomNum) {
            System.out.println("You won.");
        } else if (userChoice == randomNum) {
            System.out.println("It's a tie.");
        } else
            System.out.println("You lost.");
    }
}
