package ch11Exception.lecture;

public class C12Polymorphism {
  public static void main(String[] args) {
    try {
      // ClassCastException
      // NullPointerException
      // ArithmeticException
    } catch (RuntimeException e) {
      // NullPointerException 처리
      // ArithmeticException 처리
    }
/*    catch (ClassCastException e) {
      // ClassCastException
    }*/

  }
}
