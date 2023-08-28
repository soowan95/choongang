package ch06Class;

public class C01Class {
  public static void main(String[] args) {
    MyClass01 o1 = new MyClass01();
    System.out.println(System.identityHashCode(o1));

    MyClass01 o2 = o1;

    System.out.println(o2.age);

    o2.age = 50;

    System.out.println(o1.age);
  }
}

class MyClass01 {
  int age = 30;
}