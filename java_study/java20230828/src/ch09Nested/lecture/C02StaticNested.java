package ch09Nested.lecture;

public class C02StaticNested {
  public static void main(String[] args) {
    Myclass02.NestedClass02 o1 = new Myclass02.NestedClass02();

  }
}

class Myclass02 {
  static class NestedClass02 {
    // 필드, 생성자, 메소드 사용 가능
  }

  void method1() {
    NestedClass02 o2 = new NestedClass02();
  }
}