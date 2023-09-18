package ch14Thread.book.ch14.p633.no2;

public class ThreadExample {
  public static void main(String[] args) {
    Thread thread1 = new MovieThread();
    thread1.start();

    Thread thread2 = new Thread(new MusicRunnable());
    thread2.start();
  }
}
