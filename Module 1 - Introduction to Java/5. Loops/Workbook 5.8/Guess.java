import java.util.Scanner;

public class Guess  {
    public static void main(String[] args) {

       int number = generateRandomNumber();
       System.out.print("I chose a number between 1 and 5. Try to guess it: ");

       Scanner scan = new Scanner(System.in);

       //See Learn the Part for detailed instructions.
        int userNumber = scan.nextInt();
        while (userNumber != number) {
          System.out.print("Guess again: ");
          userNumber = scan.nextInt();
        }
        System.out.println("You got it!");
        scan.close();
    }

    public static int generateRandomNumber() {
      return (int) (Math.random() * 5) + 1;
    }

}
