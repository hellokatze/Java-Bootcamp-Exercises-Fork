import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {

        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).

        Scanner scan = new Scanner(System.in);
        System.out.println("\n****ROYAL BANK OF JAVA****");
        System.out.println("Are you here to get a mortgage? (yes or no)");
        //Task 1 - Pick up the user's decision.
        String mortgage = scan.nextLine();

        //Task 2 - Print this if the decision is "yes"
        switch (mortgage) {
          case "yes": System.out.println("\nGreat! In one line:" +
            "\nHow much money do you have in your savings?" +
            "\nAnd, how much do you owe in credit card debt?");

            // Task 3 - Pick up each value
            double savings = scan.nextDouble();
            double debt = scan.nextDouble();

            System.out.println("\nHow many years have you worked for?");

            // Task 4 - Pick up number of years
            int workingYears = scan.nextInt();

            System.out.println("What is your name?");

            // Task 5 - Pick up the user's name
            scan.nextLine();
            String name = scan.nextLine();

            if (savings >= 10000 && debt < 5000 && workingYears > 2) {
              //Task 6 - Approve the mortgage if they meet the requirements (see article)
              System.out.println("Congratulations, " + name + ". You have been approved!");
            } else {
              //       - Otherwise, don't give them a mortgage.
              System.out.println("Sorry, " + name + ", you are not eligible for a mortgage.");
            }
            break;

          //Task 2 - Print this if the decision was not "yes"
          case "no": System.out.println("\nOK. Have a nice day!");
            break;
          default: System.out.println("Invalid response.");
        }

        scan.close();
    }
}
