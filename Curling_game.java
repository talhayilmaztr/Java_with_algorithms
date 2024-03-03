/*
  @file CurlingGame
  @description: 
  This Java program simulates a curling game where the player throws stones towards a target. 
  The goal is to score points based on the proximity of the thrown stones to the target. 
  The player enters the x and y coordinates for each throw, and the program calculates 
  the score according to the distance from the target. The total score is displayed 
  at the end of three rounds.
*/

import java.util.Scanner;

public class Curling_game {
    public static void main(String[] args) {
        int h = 0;
        int k = 0;
        int operation = 0;
        int result = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x and y coordinates: ");

        for (int i = 0; i < 3; i++) {
            int x = input.nextInt();
            int y = input.nextInt();

            //√((x - h)² + (y - k)²)
            operation = (int) Math.sqrt((Math.pow(x - h, 2)) + Math.pow(y - k, 2));
            if (operation <= 2) {
                result += 20;
                System.out.println("You scored 20 points");
            } else if (operation <= 8) {
                result += 10;
                System.out.println("You scored 10 points");
            } else if (operation <= 15) {
                result += 5;
                System.out.println("You scored 5 points");
            } else {
                result += 0;
                System.out.println("You scored 0 points");
            }
        }
        System.out.println("Total score: " + result + " points");
    }
}

    

