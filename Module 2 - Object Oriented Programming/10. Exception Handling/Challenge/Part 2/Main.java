import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    static Store store = new Store();

    public static void main(String[] args) {

        try {
            loadMovies("movies.txt");
            printStore();
            userInput();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void userInput() {
        Scanner scanner = new Scanner(System.in);
        String status = "continue";

        while (status.equals("continue")) {
            int choice = (promptForChoice(scanner));
            Movie movie = store.getMovie(choice);
            double rating = promptForRating(scanner, movie.getName());

            movie.setRating(rating);
            store.setMovie(choice, movie);
            printStore();
            System.out.print("To edit another rating, type: 'continue': ");
            status = scanner.next();
        }
        scanner.close();
    }

    public static int promptForChoice(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease choose an integer between 0 - 9: ");

            // 1. Anticipate the user not entering an integer.
            if (!scanner.hasNextInt()) {
                scanner.next();
                continue;
            }

            int choice = scanner.nextInt();

            // 2. Anticipate the choice being incorrect.
            if (incorrectChoice(choice)) {
                System.out.println("Sorry, choice invalid.");
            }
            return choice;
        }
    }

    public static boolean incorrectChoice(int choice) {
        // TODO
        return choice < 0 || choice > 9;
    }

    public static double promptForRating(Scanner scanner, String name) {
        while (true) {
            System.out.print("\nSet a new rating for " + name + ": ");

            // 1. Anticipate the user not entering a double.
            if (!scanner.hasNextDouble()) {
                throw new IllegalArgumentException("Please enter a double.");
            }
            double rating = scanner.nextDouble();

            // 2. Anticipate the rating being incorrect.
            if (incorrectRating(rating)) {
              System.out.println("Sorry, invalid choice.");
            }
            return rating;
         }
    }

    public static boolean incorrectRating(double rating) {
        // TODO
        return rating < 0 || rating > 10;
    }

    public static void loadMovies(String fileName) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        Scanner scanFile = new Scanner(fis);

        while (scanFile.hasNextLine()) {
            String line = scanFile.nextLine();
            String[] words = line.split("--");
            store.addMovie(new Movie(words[0], words[1], Double.parseDouble(words[2])));
        }
        scanFile.close();
   }

    public static void printStore() {
        System.out.println("********************************MOVIE STORE*******************************");
        System.out.println(store);
    }

}
