package ch14Thread.lecture;

public class C10Concurrency {

  private static int value = 0;

  public static void main(String[] args) {
    Thread thread = new Thread(() -> {
      for (int i = 0; i < 100000; i++) {
        value++;
      }
    });

    thread.start();

    Thread thread1 = new Thread(() -> {
      for (int i = 0; i < 100000; i++) {
        value++;
      }
    });

    thread1.start();

    try {
      thread.join();
      thread1.join();
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }

    System.out.println("value = " + value);
  }
}
