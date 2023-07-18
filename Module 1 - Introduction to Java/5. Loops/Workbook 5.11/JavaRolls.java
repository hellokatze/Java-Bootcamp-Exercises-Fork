import java.util.Scanner;

public class JavaRolls {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // See Learn the Part for detailed instructions.
        System.out.println("Let's play Rolling Java. Type anything to start.");
        String userInput = scan.nextLine();
        System.out.println("\nGreat, here are the rules:");
        System.out.println("\n- If you roll a 6, the game stops");
        System.out.println("- If you roll a 4, nothing happens");
        System.out.println("- Otherwise, you get 1 point");
        System.out.println("\nYou must collect at least 3 points to win. Enter anything to roll");

        int diceRoll;
        int score = 0;

        while (true) {
          userInput = scan.nextLine();
          diceRoll = rollDice();
          System.out.print("You rolled a " + diceRoll + ". ");
          if (diceRoll == 6) {
            System.out.println("End of game. ");
            break;
          } else if (diceRoll == 4) {
            System.out.println("Zero points. Keep rolling!");
          } else {
            score++;
            System.out.println("One point. Keep rolling!");
          }
        }

        System.out.println("\nYour score is: " + score);

        if (score >= 3) {
          System.out.println("Wow that's lucky. You win!");
        } else {
          System.out.println("Tough luck, you lose :(((");
        }

        scan.close();
    }

    public static int rollDice() {
      return (int) (Math.random() * 6) + 1;
    }
}
