package ch06Class;

public class C05Class {
  public static void main(String[] args) {
    MyClass05 o1 = new MyClass05();
    MyClass05 o2 = new MyClass05();

    System.out.println("o1의 참조값 : " + System.identityHashCode(o1));

    o1.age = 30;
    o1.model = "java"; // static한 변수이기 때문에 객체로 사용하는 것을 권장하지 않음.
    MyClass05.model = "spring";

    System.out.println("o1.age = " + o1.age); // 30
    System.out.println("o2.age = " + o2.age); // 0
    System.out.println("o1.model = " + o1.model); // java
    System.out.println("o2.model = " + o2.model); // java
  }
}

class MyClass05 {
  // 속성 fields
  int age; // instance field
  static String model; // static field, class field, 정적필드

  // 기능
}
