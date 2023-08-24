public class InterTra {
  static int speed = 0;
  static void run() {
    System.out.printf("현재 속도는 %d입니다.\n", speed);
  }
  static class Bus {
    static int speed;
    static void busRun() {
      System.out.printf("버스의 속도는 %d입니다.\n", speed);
    }
  }
  static class Car {
    static int speed;
    static void carRun() {
      System.out.printf("자동차의 속도는 %d입니다.\n", speed);
    }
  }
  public static void main(String[] args) {
    run();
    Bus.speed = 20;
    Bus.busRun();
  }
}
