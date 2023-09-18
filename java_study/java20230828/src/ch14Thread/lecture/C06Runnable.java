package ch14Thread.lecture;

import java.awt.*;

public class C06Runnable {
  public static void main(String[] args) {
    Thread thread = new Thread(new Runnable() {
      @Override
      public void run() {
        for (int i = 0; i < 3; i++) {
          System.out.println("dding");
          try {
            Thread.sleep(500);
          } catch (InterruptedException e) {
            throw new RuntimeException(e);
          }
        }
      }
    });

    thread.start();

    Thread thread1 = new Thread(new Runnable() {
      @Override
      public void run() {
          Toolkit toolkit = Toolkit.getDefaultToolkit();
          for (int i = 0; i < 3; i++) {
            toolkit.beep();
            try {
              Thread.sleep(500);
            } catch (InterruptedException e) {
              throw new RuntimeException(e);
            }
          }
      }
    });
  }
}
