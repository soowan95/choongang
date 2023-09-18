package ch14Thread.lecture;

import java.awt.*;

public class C05Runnable {
  public static void main(String[] args) {
    Thread thread = new Thread(new MyRunnable05());
    thread.start();

    Thread thread1 = new Thread(new YourRunnable05());
    thread1.start();
  }
}

class YourRunnable05 implements Runnable {
  @Override
  public void run() {
    Toolkit toolkit = Toolkit.getDefaultToolkit();
    for (int i = 0; i < 5; i++) {
      toolkit.beep();
      try {
        Thread.sleep(500);
      } catch (Exception e) {
        throw new RuntimeException(e);
      }
    }
  }
}

class MyRunnable05 implements Runnable {
  @Override
  public void run() {
    // thread 가 실행할 작업 작성
    for (int i = 0; i < 5; i++) {
      System.out.println("띵");
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
  }
}