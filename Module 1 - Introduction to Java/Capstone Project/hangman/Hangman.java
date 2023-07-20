import java.util.Scanner;
import java.util.Arrays;

public class Hangman {
  // DONE 1. write function that will return random word from words array using Math.random + index
  // DONE 2. display 1 '_' for each character in the selected word
  // DONE 3. write function that will check if user's guess matches character in the random word.
  // DONE 4. write function that will update the placeholders with the correctly guessed character.
  // DONE 5. write function that will print user's missed guesses – an empty char[6] array
  // DONE 6. make the hangman counter work:
    // DONE if the user guesses correctly, gallows should stay the same.
    // DONE if the user guesses incorrectly, gallows should index + 1.
  // 7. implement win-lose logic
    // DONE if user guesses incorrectly 6x, game over.
    // if user guess word = randomWord, user wins.


    public static String[] words = {"ant", "baboon", "badger", "bat", "bear", "beaver", "camel",
    "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer",
    "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat",
    "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose",
    "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon",
    "python", "rabbit", "ram", "rat", "raven","rhino", "salmon", "seal",
    "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan",
    "tiger", "toad", "trout", "turkey", "turtle", "weasel", "whale", "wolf",
    "wombat", "zebra"};

    public static String[] gallows = {"+---+\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|   |\n" +
    "     |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" + //if you were wondering, the only way to print '\' is with a trailing escape character, which also happens to be '\'
    "     |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" +
    "/    |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" +
    "/ \\  |\n" +
    "     |\n" +
    " =========\n"};

    public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);

      String randomWord = randomWord(words);
      char[] placeholders = placeholders(randomWord);
      String missedGuesses = "";
      int gallowsIndex = 0;
      int missCounter = 0;

      while (!(Arrays.equals(randomWord.toCharArray(), placeholders))) {
        System.out.println(gallows[gallowsIndex]);
        System.out.print("Word:\t");
        printPlaceholders(placeholders);
        System.out.print("\n\nMisses:\t");
        System.out.println(missedGuesses);
        System.out.print("\nGuess: ");
        String guess = scan.nextLine();

        if (checkGuess(randomWord, guess)) {
          updatePlaceholders(randomWord, placeholders, guess);;
        } else {
          missedGuesses+= guess;
          gallowsIndex++;
          missCounter++;
        }

        if (missCounter == 6) {
          System.out.println(gallows[6]);
          System.out.println("You lose!");
          System.out.println("\nThe word was: " + randomWord);
          System.exit(0);
        }
      }

      System.out.print("\nWord:\t");
      printPlaceholders(placeholders);
      System.out.println("\n\nWell done! You win!");

      System.out.println();
      scan.close();
    }

    public static String randomWord(String[] words) {
      int randomNumber = (int) (Math.random() * words.length);
      return words[randomNumber];
    }

    public static boolean checkGuess(String word, String guess) {
      for (int i = 0; i < word.length(); i++) {
        char ch = word.charAt(i);
        if (ch == guess.charAt(0)) {
          return true;
        } else {
        }
      }
      return false;
    }

    public static char[] placeholders(String word) {
      char[] characters = new char[word.length()];
      for (int i = 0; i < characters.length; i++) {
        characters[i] = '_';
      }
      return characters;
    }

    public static void printPlaceholders(char[] placeholders) {
      for (int i = 0; i < placeholders.length; i++) {
        System.out.print(placeholders[i] + " ");
      }
    }

    public static char[] updatePlaceholders(String word, char[] placeholders, String guess) {
      for (int i = 0; i < word.length(); i++) {
        char ch = word.charAt(i);
        char guessPlaceholder = guess.charAt(0);
        if (ch == guessPlaceholder) {
          placeholders[i] = guessPlaceholder;
        }
      }
      return placeholders;
    }
}
