package ch11Exception.lecture;

public class C14Throw {
  public static void main(String[] args) {
    System.out.println("main code1");
    try {
      method3();
    } catch (Exception e) {
      System.out.println("예외 발생");
    }
    System.out.println("main code2");
  }

  private static void method3() throws Exception{
    throw new Exception();
  }
}
