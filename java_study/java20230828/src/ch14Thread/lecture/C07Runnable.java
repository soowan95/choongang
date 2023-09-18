package ch14Thread.lecture;

import java.awt.*;

public class C07Runnable {
  public static void main(String[] args) {
    Thread thread = new Thread(() -> {
      for (int i = 0; i < 3; i++) {
        System.out.println("dding");
        try {
          Thread.sleep(500);
        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        }
      }
    });

    thread.start();

    Thread thread1 = new Thread(() -> {
      Toolkit toolkit = Toolkit.getDefaultToolkit();
      for (int i = 0; i < 3; i++) {
        toolkit.beep();
        try {
          Thread.sleep(500);
        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        }
      }
    });

    thread1.start();
  }
}
