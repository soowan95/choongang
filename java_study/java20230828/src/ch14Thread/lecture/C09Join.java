package ch14Thread.lecture;

public class C09Join {
  public static void main(String[] args) {
    // join : 다른 쓰레드의 종료를 기다림

    Thread thread = new Thread(() -> {
      for (int i = 0; i < 5; i++) {
        System.out.println("thread");
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        }
      }
    });

    thread.start();

    try {
      thread.join();
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }

    for (int i = 0; i < 5; i++) {
      System.out.println("main thread");
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
  }
}
