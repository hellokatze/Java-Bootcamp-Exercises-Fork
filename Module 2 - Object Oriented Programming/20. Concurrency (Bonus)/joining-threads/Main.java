import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class Main {

    static final double TARGET = 0.5;
    static final double PRECISION = 0.000000001;

    static double result = 0;

    public static void main(String[] args) {

        //call generateNumber here...
        Callable<Double> callable = () -> generateNumber();
        // Threads aren't designed to return a result. A thread can only be created out of a Runnable. But thanks to polymorphism, FutureTask can behave like a Runnable.
        FutureTask<Double> future = new FutureTask<>(callable);
        Thread thread = new Thread(future);
        thread.start();
        //calculate precision level here...

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a name to generate a number: ");
        scan.next();
        scan.close();
        try {
          result = future.get(); // future.get() blocks the main thread until task in other thread finishes. future.get() takes the value held by the other thread after it finishes and then use it as the main thread finishes.
        } catch (Exception e) {
          System.out.println(e.getMessage());
        }
        double precision = difference(result);

        System.out.println("The computer returned a value of: " + result);
        System.out.println("The value was generated to a precision of : " + precision);
    }

    /**
     * Function name: generateNumber
     * @return double
     *
     * Inside the function:
     *   1. Generates a number close to the TARGET to a precision of PRECISION.
     *
     */

    public static double generateNumber() {
      double number = Math.random();
      double difference = difference(number);
      while (difference > PRECISION) {
        number = Math.random();
        difference = difference(number);
      }
      return number;
    }

    public static double difference(double number) {
      return Math.abs(TARGET - number);
    }

}
