package ch12Api.lecture;

public class C03ToString {
  public static void main(String[] args) {
    Car car1 = new Car("telas", 5000);
    Car car2 = new Car("kia", 3000);
    Car car3 = new Car("bmw", 2000);

    System.out.println(car1.getModel() + ": " + car1.getPrice());
    System.out.println(car2.getModel() + ": " + car1.getPrice());
    System.out.println(car3.getModel() + ": " + car1.getPrice());

    System.out.println(car1.toString());
    System.out.println(car2.toString());
    System.out.println(car3.toString());
  }
}

class Car {
  private String model;
  private int price;

  public Car(String model, int price) {
    this.model = model;
    this.price = price;
  }

  public String getModel() {
    return model;
  }

  public int getPrice() {
    return price;
  }

  @Override
  public String toString() {
    return this.model + ": " + this.price;
  }
}