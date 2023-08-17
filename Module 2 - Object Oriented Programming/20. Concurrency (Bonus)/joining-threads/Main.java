import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class Main {

    static double[] targets = new double[] {0.5, 0.8, 0.3};
    static final double PRECISION = 0.0000001;

    static double result = 0;

    public static void main(String[] args) {

        int numThreads = Runtime.getRuntime().availableProcessors();
        ExecutorService executor = Executors.newFixedThreadPool(numThreads);
        Future<Double> future = executor.submit(() -> generateNumber(0));
        Future<Double> future2 =executor.submit(() -> generateNumber(1));
        Future<Double> future3 =executor.submit(() -> generateNumber(2));
        // Threads aren't designed to return a result. A thread can only be created out of a Runnable. But thanks to polymorphism, FutureTask can behave like a Runnable.
        // FutureTask<Double> future = new FutureTask<>(() -> generateNumber(0));
        // Thread thread2 = new Thread(future);

        // FutureTask<Double> future2 = new FutureTask<>(() -> generateNumber(1));
        // Thread thread3 = new Thread(future2);

        // FutureTask<Double> future3 = new FutureTask<>(() -> generateNumber(2));
        // Thread thread4 = new Thread(future3);

        // Don't need to start thread once executor submits.
        // thread2.start();
        // thread3.start();
        // thread4.start();
        //calculate precision level here...

        // Scanner scan = new Scanner(System.in);
        // System.out.print("Please enter a name to generate a number: ");
        // scan.next();
        // scan.close();
        try {
          future.get(); // future.get() blocks the main thread until task in other thread finishes. future.get() takes the value held by the other thread after it finishes and then use it as the main thread finishes.
          future2.get();
          future3.get();
        } catch (Exception e) {
          System.out.println(e.getMessage());
        } finally {
          executor.shutdown();
        }

        System.out.println("Finished running background operations.");
    }

    /**
     * Function name: generateNumber
     * @return double
     *
     * Inside the function:
     *   1. Generates a number close to the TARGET to a precision of PRECISION.
     *
     */

    public static double generateNumber(int index) {
      double number = Math.random();
      double difference = difference(number, index);
      while (difference > PRECISION) {
        number = Math.random();
        difference = difference(number, index);
      }
      return number;
    }

    public static double difference(double number, int index) {
      return Math.abs(targets[index] - number);
    }

}
