package ch11Exception.lecture;

public class C05PrintStrackTrace {
  public static void main(String[] args) {
    System.out.println("code1");

    try {
      int i = 0;
      int j = 3 / i;
      System.out.println("code2");
    } catch (ArithmeticException e) {
      e.printStackTrace();
    }


    System.out.println("code3");
  }
}
