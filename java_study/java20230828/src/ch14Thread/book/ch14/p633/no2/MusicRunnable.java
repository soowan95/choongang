package ch14Thread.book.ch14.p633.no2;

public class MusicRunnable implements Runnable {
  @Override
  public void run() {
    for (int i = 0; i < 3; i++) {
      System.out.println("음악을 재생합니다.");
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
  }
}
