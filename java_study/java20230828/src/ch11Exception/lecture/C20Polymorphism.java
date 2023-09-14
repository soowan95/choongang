package ch11Exception.lecture;

public class C20Polymorphism {
  public static void main(String[] args) throws Exception {
    method1();
  }

  public static void method1() throws ReflectiveOperationException {
    method2();
  }

  public static void method2() throws ClassNotFoundException {

  }
}
