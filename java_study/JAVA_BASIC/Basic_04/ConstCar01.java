class Car {
  int speed;
  Car() {
    System.out.println("Car 클래스의 생성자가 만들어 졌습니다.\n");
  }
}
class Car2 {
  String name;
  int age;
  Car2(String name, int age) {
    this.name = name;
    this.age = age;
  }
  void a() {
    System.out.println(name + age);
  }
}
class Car3 {
  String name, color;
  int speed;
  Car3(String name, int speed, String color) {
    this.name = name;
    this.speed = speed;
    this.color = color;
  }
  void b() {
    System.out.printf("차종 : %s, 속도 : %d, 색 : %s\n", name, speed, color);
  }
}
class Person {
  String name, job;
  int age;
  Person(String name, String job, int age) {
    this.name = name;
    this.job = job;
    this.age = age;
    System.out.printf("이름은 %s이고 나이는 %d살입니다. 직업은 %s입니다.\n", name, age, job);
  }
}
public class ConstCar01 {
  public static void main(String[] args) {
    Car car = new Car();
    Car2 car2 = new Car2("제네시스", 4000);
    car2.a();
    Car3 car3 = new Car3("SUV", 250, "blue");
    car3.b();
    Person hong = new Person("홍길동", "의적", 30);
    Person lee = new Person("이동수", "개발자", 20);
  }
}
