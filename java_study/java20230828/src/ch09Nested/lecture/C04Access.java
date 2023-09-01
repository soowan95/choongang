package ch09Nested.lecture;

public class C04Access {

  int instanceField;
  static int staticField;

  static class StaticNestedClass {
    void method1() {
//      System.out.println(instanceField); // x
      System.out.println(staticField);
    }
  }
  class InnerClass {
    void method1() {
      System.out.println(instanceField);
      System.out.println(staticField);
    }
  }
}
