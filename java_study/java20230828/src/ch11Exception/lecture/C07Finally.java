package ch11Exception.lecture;

public class C07Finally {
  public static void main(String[] args) {
    System.out.println("code1");
    try {
      int j = 3 / 0;
      System.out.println("code2");
      return;
    } catch (Exception e) {
      System.out.println("code3");
    } finally {
      System.out.println("code4");
    }
    System.out.println("code5");
  }
}
