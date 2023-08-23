public class OverLoad {
  static void car() {
    System.out.println("자동차 소개");
  }

  static void car(int value) {
    System.out.println("자동차 가격 : " + value);
  }

  static void car(String name) {
    System.out.println("자동차 이름 : " + name);
  }

  static void car(int year, int speed) {
    System.out.println("출시년도 : " + year + "\n속도 : " + speed);
  }

  static void car(int a, double b) {
    System.out.println("출시년도 : " + a + "\n속도 : " + b);
  }

  public static void main(String[] args) {
    car();
    car(500);
    car("제네시스");
    car(2023, 300);
    car(10, 10.4);
  }
}
