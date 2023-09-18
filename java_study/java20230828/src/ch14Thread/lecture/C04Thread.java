package ch14Thread.lecture;

import java.awt.*;

public class C04Thread {
  public static void main(String[] args) {
    // thread 만들기
    Thread thread = new MyThread04();
    // thread 시작
    thread.start();

    Thread thread1 = new Thread();
    thread1.start();
  }
}

class YourThread04 extends Thread {

  @Override
  public void run() {
    Toolkit toolkit = Toolkit.getDefaultToolkit();
    for (int i = 0; i < 5; i++) {
      toolkit.beep();
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
  }
}

class MyThread04 extends Thread {

  @Override
  public void run() {
    // thread가 해야할 일 작성
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