import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int playerScore = 0;
        int computerScore = 0;
        // Quick Intro to our game
        System.out.println("Welcome to Lynn's Rock Paper Scissors Game! Now let's try the Game Loop version!");
        System.out.println("If you want to quit the game at anytime, enter 'q' to quit.");

        while (true) {
            System.out.println("\nPlayer Score: " + playerScore + "\tComputer Score: " + computerScore);
            // The Scoreboard kind of thing
            // Keeps track of which player is winning as the game goes on
            System.out.println("Enter your choice (rock, paper, scissors): ");
            String playerChoice = scan.next().toLowerCase();
            // This is where the user can input whatever they want to play.
            if (playerChoice.equals("q")) {
                System.out.println("Aw, it's quite unfortunate that you quit, but thanks for playing!");
                break;
            }
            // So if the user inputs 'q' the game quits/ends basically
            int computerChoiceInt = rand.nextInt(3);
            // 1 for rock, 2 for paper, 3 for scissors
            String computerChoice = "";
            if (computerChoiceInt == 0) {
                computerChoice = "rock";
            } else if (computerChoiceInt == 1) {
                computerChoice = "paper";
            } else {
                computerChoice = "scissors";
            }
            // Waits for the input
            System.out.println("Computer chose: " + computerChoice);
            // These are all the responses given depending on the game
            if (playerChoice.equals(computerChoice)) {
                System.out.println("It's a tie! Try Again.>:(");
            } else if (playerChoice.equals("rock") && computerChoice.equals("scissors") ||
                    playerChoice.equals("paper") && computerChoice.equals("rock") ||
                    playerChoice.equals("scissors") && computerChoice.equals("paper")) {
                System.out.println("You win this round! Congratulations you're so good!");
                playerScore++;
            } else {
                System.out.println("Computer wins this round! Keep playing til you win!");
                computerScore++;
            }
        }

        scan.close();
    }
}

