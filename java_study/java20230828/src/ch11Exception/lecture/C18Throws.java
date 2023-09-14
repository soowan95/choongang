package ch11Exception.lecture;

public class C18Throws {
  public static void main(String[] args) {
    try {
      method1();
    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
  }

  public static void method1() throws ClassNotFoundException {

  }
}
