import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        String[] moves = { "Rock", "Paper", "Scissors" };
        Random rand = new Random();
        int rounds;
        int wins, losses, draws;

        try (Scanner sc = new Scanner(System.in)) {
            rounds = 5;
            wins = 0;
            losses = 0;
            draws = 0;
            System.out.println("Round | Player Move | Computer Move | Result");
            for (int i = 0; i < rounds; i++) {
                String playerMove = "";
                while (true) {
                    System.out.print("Round " + (i + 1) + " - Enter your move (Rock/Paper/Scissors): ");
                    String input = sc.nextLine().trim();
                    playerMove = capitalize(input);

                    if (playerMove.equals("Rock") || playerMove.equals("Paper") || playerMove.equals("Scissors")) {
                        break;
                    }
                    System.out.println("Invalid move. Please type Rock, Paper, or Scissors.");
                }

                String computerMove = moves[rand.nextInt(3)];
                String result = playRound(playerMove, computerMove);

                switch (result) {
                    case "Player Wins" -> wins++;
                    case "Computer Wins" -> losses++;
                    default -> draws++;
                }

                System.out.println((i + 1) + " | " + playerMove + " | " + computerMove + " | " + result);
            }
        }

        double winPercentage = (wins * 100.0) / rounds;
        System.out.println("\nFinal Summary");
        System.out.println("Wins: " + wins + " | Losses: " + losses + " | Draws: " + draws +
                " | Win % = " + winPercentage + "%");
    }

    static String capitalize(String input) {
        if (input.isEmpty())
            return input;
        return input.substring(0, 1).toUpperCase() + input.substring(1).toLowerCase();
    }

    static String playRound(String playerMove, String computerMove) {
        if (playerMove.equals(computerMove))
            return "Draw";

        if ((playerMove.equals("Rock") && computerMove.equals("Scissors")) ||
                (playerMove.equals("Paper") && computerMove.equals("Rock")) ||
                (playerMove.equals("Scissors") && computerMove.equals("Paper"))) {
            return "Player Wins";
        }

        return "Computer Wins";
    }
}