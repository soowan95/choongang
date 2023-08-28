package ch06Class;

public class C02Class {
  public static void main(String[] args) {
    MyClass02 o1 = new MyClass02();

    o1.name = "spring";

    method1(o1);

    System.out.println(o1.name);
  }

  public static void method1(MyClass02 p) {
    p.name = "java";
  }
}

class MyClass02 {
  String name;
}