package ch14Thread.lecture;

import java.util.concurrent.atomic.AtomicInteger;

public class C11Atomic {

  private static AtomicInteger value = new AtomicInteger();

  public static void main(String[] args) throws InterruptedException {
    Thread thread = new Thread(() -> {
      for (int i = 0; i < 100000; i++) {
        value.getAndIncrement();
      }
    });

    thread.start();

    Thread thread1 = new Thread(() -> {
      for (int i = 0; i < 100000; i++) {
        value.getAndIncrement();
      }
    });

    thread1.start();

    thread.join();
    thread1.join();

    System.out.println("value = " + value);
  }
}
