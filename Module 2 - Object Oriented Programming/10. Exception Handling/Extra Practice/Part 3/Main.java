import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String title = promptForTitle(scanner);
    String publisher = promptForPublisher(scanner);
    int issueNumber = promptForIssueNumber(scanner);
    int publicationYear = promptForPublicationYear(scanner);

    Magazine newMagazine = new Magazine(title, publisher, issueNumber, publicationYear);

    MagazineLibrary library = new MagazineLibrary();
    library.addMagazine(newMagazine);

    System.out.println("Magazine added to the library: " + newMagazine.getTitle());
    System.out.println(library.getMagazine(0).getTitle());
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
        scanner.nextLine();
        continue;
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
      if (!scanner.hasNextInt()) {
        scanner.next();
        continue;
      }

      int issueNumber = scanner.nextInt();
      // TODO
      if ((incorrectIssueNumber(issueNumber)))
        continue;
      else
        return issueNumber;
    }
  }

  public static int promptForPublicationYear(Scanner scanner) {
    while (true) {
      System.out.print("\nPlease enter a valid publication year (greater than 0): ");
      if (!scanner.hasNextInt()) {
        scanner.next();
        continue;
      }

      int publicationYear = scanner.nextInt();
      if (incorrectPublicationYear(publicationYear)) continue;
      else return publicationYear;
    }
  }

}
