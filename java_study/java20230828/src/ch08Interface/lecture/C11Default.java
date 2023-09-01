package ch08Interface.lecture;

public class C11Default {
  public static void main(String[] args) {
    MyInterface11 o1 = new MyClass111();
    MyInterface11 o2 = new MyClass112();

    o1.method1();
    o1.method2();

    o2.method1();
    o2.method2();
  }
}

interface MyInterface11 {
  void method1();
  default void method2() {
    // 몸통이 있는 public instance 메소드
    System.out.println("MyInterface11.method2");
  }
}

class MyClass111 implements MyInterface11 {
  @Override
  public void method1() {
    System.out.println("MyClass111.method1");
  }

  @Override
  public void method2() {
    System.out.println("MyClass111.method2");
  }
}

class MyClass112 implements MyInterface11 {
  @Override
  public void method1() {
    System.out.println("MyClass112.method1");
  }
}