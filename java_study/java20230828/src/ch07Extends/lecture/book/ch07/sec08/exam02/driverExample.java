package ch07Extends.lecture.book.ch07.sec08.exam02;

public class driverExample {
  public static void main(String[] args) {
    Driver driver = new Driver();

    Bus bus = new Bus();
    driver.drive(bus);

    Taxi taxi = new Taxi();
    driver.drive(taxi);
  }
}
