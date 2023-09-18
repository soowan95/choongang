package ch14Thread.lecture;

public class C08Thread {
  public static void main(String[] args) {

    Thread thread = new Thread(() -> {
      for (int i = 0; i < 5; i++) {
        System.out.println("thread");
        try {
          Thread.sleep(500);
        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        }
      }
    });
    thread.start();

    Thread thread1 = new Thread(() -> {
      for (int i = 0; i < 5; i++) {
        System.out.println("thread1");
        try {
          Thread.sleep(500);
        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        }
      }
    });
    thread1.start();

    for (int i = 0; i < 5; i++) {
      System.out.println("main thread");
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
  }
}
