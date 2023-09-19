package ch14Thread.lecture;

public class C13Synchronized {
  public static void main(String[] args) throws InterruptedException {
    MyBox13 box = new MyBox13(0);
    Thread thread = new Thread(new Task13(box));
    Thread thread1 = new Thread(new Task13(box));

    thread.start();
    thread1.start();

    thread.join();
    thread1.join();

    System.out.println(box.getValue());
  }
}

class Task13 implements Runnable {

  private MyBox13 box;

  public Task13(MyBox13 box) {
    this.box = box;
  }

  @Override
  public void run() {
    for (int i = 0; i < 10000; i++) {
      box.increment();
    }
  }
}

class MyBox13 {

  private int value;

  public MyBox13(int value) {
    this.value = value;
  }

  // synchronized method
  public synchronized void increment() {
    value++;
  }

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }
}