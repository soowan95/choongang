package ch09Nested.lecture;

public class C09Anonymous {
  public static void main(String[] args) {
    MyClass09 o1 = new MySubClass091();
    o1.mehtod1();

    // anonymous class (익명 클래스)
    MyClass09 o2 = new MyClass09() {
      // 자식클래스 몸통

      @Override
      void mehtod1() {
        System.out.println("C09Anonymous.mehtod1");
      }
    };
    o2.mehtod1();
  }
}

class MyClass09 {
  void mehtod1() {
    System.out.println("MyClass09.mehtod1");
  }
}

class MySubClass091 extends MyClass09 {
  @Override
  void mehtod1() {
    System.out.println("MySubClass091.mehtod1");
  }
}