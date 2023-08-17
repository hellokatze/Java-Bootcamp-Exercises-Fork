import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

  static AtomicInteger counter = new AtomicInteger(0); // this is a class type, not a primitive type, anymore.

  public static void main(String[] args) {

    CountDownLatch latch = new CountDownLatch(2);

    int numThreads = Runtime.getRuntime().availableProcessors();
    ExecutorService executor = Executors.newFixedThreadPool(numThreads);
    executor.submit(() -> task(latch));
    executor.submit(() -> task(latch));
    // Thread thread1 = new Thread(() -> task(lock, latch));
    // Thread thread2 = new Thread(() -> task(lock, latch));

    // thread1.start();
    // thread2.start();

    try {
      latch.await(); // this latch will never open until it counts down to 0.
    } catch (Exception e) {
      System.out.println(e.getMessage());
    } finally {
      executor.shutdown();
    }

    System.out.println(counter);
  }

  public static void task(CountDownLatch latch) {
    // some really long operations that need to run in the background...
    for (int i = 0; i < 10000; i++) {
      counter.addAndGet(1); // there happens to be a line that updates the counter variable.
    }
    latch.countDown();
    // more really long operations...
  }

}
