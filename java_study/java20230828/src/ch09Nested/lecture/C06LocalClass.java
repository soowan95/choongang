package ch09Nested.lecture;

public class C06LocalClass {
  public static void main(String[] args) {
    class LocalClass {

    }
  }

  public static void method1() {
    class LocalClass {

    }
  }

  public void method2() {
    class LocalClass {

    }

    LocalClass o1 = new LocalClass();
  }
}
