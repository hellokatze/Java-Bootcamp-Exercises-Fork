import java.util.Scanner;

public class Hangman {
  // DONE 1. write function that will return random word from words array using Math.random + index
  // DONE 2. display 1 '_' for each character in the selected word
  //

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
      char[] characters = randomWord.toCharArray();
      System.out.println(gallows[0]);
      System.out.print("Word:\t");
      for (int i = 0; i < characters.length; i++) {
        System.out.print("_ ");
      }
      System.out.print("\n\nMisses: ");
      System.out.print("\n\nGuess: ");
      String guess = scan.nextLine();

      System.out.println();
      scan.close();
    }

    public static String randomWord(String[] words) {
      int randomNumber = (int) (Math.random() * words.length);
      return words[randomNumber];
    }

    // public static char[] placeholders(String word) {
    //   char[] characters = new char[word.length()];
    //   for (int i = 0; i < characters.length; i++) {
    //     characters[i] = '_';
    //   }
    //   return characters;
    // }

}
