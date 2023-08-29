package ch07Extends.lecture;

public class C05Override {
  public static void main(String[] args) {
    MyClass05 o1 = new MyClass05();
    o1.method1();

    MySubClass051 o2 = new MySubClass051();
    o2.method1();
    o2.method2();
  }
}

class MyClass05 {
  public void method1() {
    System.out.println("어떤 기능");
  }
}

class MySubClass051 extends MyClass05 {
  // 메소드 재정의 (method override)
  public void method1() {
    System.out.println("변경된 기능");
  }
  public void method2() {
    System.out.println("추가된 기능");
  }
}