package ch09Nested.lecture;

public class C11Interface {
  public static void main(String[] args) {
    MyInterface11 o1 = new MyInterface11() {
      @Override
      public void method1() {
        System.out.println("C11Interface.method1");
      }
    };

    o1.method1();
  }
}

interface MyInterface11 {
  void method1();
}