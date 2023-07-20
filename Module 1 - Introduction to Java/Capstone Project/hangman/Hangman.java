import java.util.Scanner;

public class Hangman {
  // DONE 1. write function that will return random word from words array using Math.random + index
  // DONE 2. display 1 '_' for each character in the selected word
  // DONE 3. write function that will check if user's guess matches character in the random word.
  // DONE 4. write function that will update the placeholders with the correctly guessed character.
  // 5. write function that will print user's missed guesses – an empty char[6] array

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


      for (int i = 0; i < 6; i++) {
        System.out.println(gallows[0]);
        String randomWord = randomWord(words);
        System.out.print("Word:\t");
        printPlaceholders(randomWord);
        System.out.print("\n\nMisses: ");
        System.out.print("\n\nGuess: ");
        String guess = scan.nextLine();

        if (checkGuess(randomWord, guess)) {
          System.out.println(gallows[i]);
          System.out.print("Word:\t");
          updatePlaceholders(randomWord, guess);
          System.out.print("\n\nMisses: ");
          System.out.print("\n\nGuess: ");
          guess = scan.nextLine();
        }
      }

      System.out.println();
      scan.close();
    }

    public static String randomWord(String[] words) {
      int randomNumber = (int) (Math.random() * words.length);
      return words[randomNumber];
    }

    public static void printPlaceholders(String word) {
      char[] characters = word.toCharArray();
      for (int i = 0; i < characters.length; i++) {
        System.out.print("_ ");
      }
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

    public static void updatePlaceholders(String word, String guess) {
      for (int i = 0; i < word.length(); i++) {
        char ch = word.charAt(i);
        if (ch == guess.charAt(0)) {
          System.out.print(ch + " ");
        } else {
          System.out.print("_ ");
        }
      }
    }

    // public static char[] placeholders(String word) {
    //   char[] characters = new char[word.length()];
    //   for (int i = 0; i < characters.length; i++) {
    //     characters[i] = '_';
    //   }
    //   return characters;
    // }

}
