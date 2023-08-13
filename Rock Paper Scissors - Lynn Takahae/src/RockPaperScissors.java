import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println(" ");
        //Added that extra space of text so you can see the introduction better when its not right below the D:\Games\bin\java.exe thing
        System.out.println("Welcome to Lynn's game of Rock,Paper,Scissors!");
        System.out.println("Type in what you're going to play:");
        System.out.println("1. Rock");
        System.out.println("2. Paper");
        System.out.println("3. Scissors");
        // The User is given a choice between the three and they can choose whichever hand they want to play
        // Used numbers instead of letters like: r, p , or s because of the parse ints

        System.out.print("Enter one of the numbers of your choice: ");
        int playerChoice = Integer.parseInt(scanner.nextLine());

        // The Computer then checks for a valid input
        // If the users input is invalid...
        if (playerChoice < 1 || playerChoice > 3) {
            System.out.println("What you typed in was invalid. Please read the rules and try again. Please choose a number between 1 and 3.");
            scanner.close();
            return;
        }

        // This then maps the computers choice.
        int computerChoice = random.nextInt(3) + 1;
        // As we know  1 for rock, 2 for paper, and 3 for scissors

        // Now the computer will determine the winner depending on what the user input.
        // If the users choice and computers choice is the same, it will obviously be a tie.
        if (playerChoice == computerChoice) {
            System.out.println("And...It's a Tie! Boring...");
        } else if ((playerChoice == 1 && computerChoice == 3)
                || (playerChoice == 2 && computerChoice == 1)
                || (playerChoice == 3 && computerChoice == 2)) {
            System.out.println("And...You Win! Congratulations!");
        } else {
            System.out.println("And...Computer wins! Unlucky!");
        }

        scanner.close();
    }
}