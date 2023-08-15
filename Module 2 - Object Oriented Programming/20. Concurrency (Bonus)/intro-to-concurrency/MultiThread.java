public class MultiThread {

  // static class LongTask implements Runnable {
  //   @Override
  //   public void run() {
  //     longTask();
  //   }
  // }

  public static void main(String[] args) {
      // when possible, avoid anonymous classes and use a lambda expression instead.
      Thread thread2 = new Thread(() -> longTask());
      thread2.start();
      System.out.println("Doing other work on main thread");
      
      // Runnable runnable = new Runnable() {
      // // This makes an anonymous class so you don't have to declare it above. But you must override its methods:
      //   @Override
      //   public void run() {
      //     longTask();
      //   }
      // };
      // // LongTask runnable = new LongTask(); // create a new object of the LongTask class
      // Thread thread2 = new Thread(runnable); // create a new thread where longTask() will be executed.
      // thread2.start(); // this starts a new thread and executes its task by invoking its run method.
    }

  public static void longTask() {
    long t = System.currentTimeMillis();
    long end = t + 3000;

    while (true) {
      if (System.currentTimeMillis() == end) {
        System.out.println("Finished long task");
        break;
      }
    }
  }

}
