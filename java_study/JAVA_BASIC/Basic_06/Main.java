class Car {
  String name = "정해야 되고";
  int speed = 0;
  void run() {
    System.out.printf("이름은 %s 속력은 %d", name, speed);
  }
}

class Bus extends Car {
  void run() {
    name = "시내버스";
    speed = 30;
    super.run();
    System.out.printf("이름은 %s 속력은 %d", name, speed);
  }
}

class Tru extends Car {

}

public class Main {
  public static void main(String[] args) {
    Bus bus = new Bus();
    bus.run();
  }
}
