package ch11Exception.lecture;

public class C11Polymorphism {
  public static void main(String[] args) {
    try {

    } catch (NullPointerException e) {
      // 동일한 예외 처리 코드
    } catch (ArithmeticException e) {
      // 동일한 예외 처리 코드
    }

    try {

    } catch (RuntimeException e) {
      // 동일한 예외 처리 코드
    }
  }
}
