import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    }

    public static boolean isNullOrBlank(String input) {
      return (input == null || input.isBlank());
    }

    public static boolean incorrectIssueNumber(int issueNumber) {
      return issueNumber <= 0;
    }

    public static boolean incorrectPublicationYear(int year) {
      return year <= 0;
    }

    public static String promptForTitle(Scanner scanner) {
      while (true) {
        System.out.print("\nPlease enter a valid title: ");
        String title = scanner.nextLine();
        if (isNullOrBlank(title)) {
          System.out.println("Sorry, invlaid title");
          title = scanner.nextLine();
        } else {
          return title;
        }
      }
    }

    public static String promptForPublisher(Scanner scanner) {
      while (true) {
        System.out.print("\nPlease enter a valid publisher: ");
        String publisher = scanner.nextLine();
        if (isNullOrBlank(publisher)) {
          System.out.println("Sorry, invalid publisher");
          publisher = scanner.nextLine();
        } else {
          return publisher;
        }
      }
    }

    public static int promptForIssueNumber(Scanner scanner) {
      while (true) {
          System.out.print("\nPlease enter a valid issue number (greater than 0): ");
          // First check if the next input is not an integer
                // scanner.next();
                // continue;

          int issueNumber = scanner.nextInt();
          // TODO
      }
  }

}
