package ch09Nested.lecture;

public class C05Access {
   String name = "java";
   class InnerClass {
    String name = "spring";

    void method() {
      System.out.println(name);
      System.out.println(this.name);
      System.out.println(C05Access.this.name);
    }
  }

  public static void main(String[] args) {
    C05Access o2 = new C05Access();
    InnerClass o1 = o2.new InnerClass();
    o1.method();
  }
}
