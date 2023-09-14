package ch11Exception.book.ch11.sec03.exam01;

public class C13Throw {
  public static void main(String[] args) {
    System.out.println("main code1");
    try {
      method1();
    } catch (RuntimeException e) {
      System.out.println("예외 발생");
    }
    System.out.println("main code2");
  }

  public static void method1() {
    System.out.println("code1");
    throw new RuntimeException();
//    System.out.println("code2");
  }

  public static void method2() {
//    throw new Exception();
  }
}
