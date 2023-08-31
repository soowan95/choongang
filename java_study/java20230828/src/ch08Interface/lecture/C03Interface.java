package ch08Interface.lecture;

public class C03Interface {
  public static void main(String[] args) {
    MyClass03 o1 = new MyClass03();

    o1.method1();
    o1.method2();
  }
}

interface MyInterace031 {
  void method1();
}

interface MyInterface032 {
  void method2();
}
class MyClass03 implements MyInterace031, MyInterface032 {
  @Override
  public void method2() {
    System.out.println("MyClass03.method2");
  }

  @Override
  public void method1() {
    System.out.println("MyClass03.method1");
  }
}