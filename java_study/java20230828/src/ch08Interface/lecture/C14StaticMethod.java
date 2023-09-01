package ch08Interface.lecture;

public class C14StaticMethod {
  public static void main(String[] args) {
    MyInterface14.method();
  }
}

interface MyInterface14 {
  static void method() {
    System.out.println("MyInterface14.method");
    common();
  }

  static void method2() {
    System.out.println("MyInterface14.method2");
    common();
  }

  private static void common() {
    System.out.println("어떤 기능1");
  }
}