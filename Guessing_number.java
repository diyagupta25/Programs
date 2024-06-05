import java.util.Scanner;
import java.util.Random;

public class Guessing_number {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String action = "yes";

        //while loop to determine if we are going to play the game again
        while (action.equals("yes")) {
            Random rand = new Random();
            int randNum = rand.nextInt(50);
            int predict = -1;
            int trials = 0;

            //while loop to check if the game is over
            while (predict != randNum) {
                System.out.println("Guess a number between 1 and 50: ");
                predict = reader.nextInt();
                trials++;
                if (predict == randNum) {
                    System.out.println("Great! You guess the correct number.");
                    System.out.println("You took only " + trials + " guesses!");
                    System.out.println("Do you want to play the game again?");
                    System.out.print("Yes or No: ");
                    action = reader.next().toLowerCase();
                } else if (predict > randNum) {
                    System.out.println(" Your guessed number is higher than the original number, Please try again.");
                } else {
                    System.out.println("Your guessed number is lower than the original number, Please try again.");
                }
            }
        }
    }
}
