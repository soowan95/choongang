package ch14Thread.lecture;

public class C12Synchronized {
  public static void main(String[] args) throws InterruptedException {
    MyBox box = new MyBox(0);

    Thread thread = new Thread(new Task(box));
    
    thread.start();

    Thread thread1 = new Thread(new Task(box));

    thread1.start();

    thread.join();
    thread1.join();

    System.out.println("box.getValue() = " + box.getValue());
  }
}

class Task implements Runnable {
  
  private MyBox box;

  public Task(MyBox box) {
    this.box = box;
  }

  @Override
  public void run() {
    for (int i = 0; i < 10000; i++) {
      box.increment();
    }
  }
}

class MyBox {
  
  private int value;
  // monitor lock
  private Object lock = new Object();

  public MyBox(int value) {
    this.value = value;
  }
  
  public void increment() {

    // synchronized block
    synchronized (lock) {
      value++;
    }

  }

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }
}