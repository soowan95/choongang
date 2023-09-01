package ch09Nested.lecture;

public class C07LocalClass {
  // 로컬 클래스에서 사용되는
  // 감싸고 있는 메소드의 지역변수는
  // 값을 변경할 수 없음
  void method() {
    int value = 0;
    class LocalClass {
      void method1() {
        System.out.println(value);
      }
    }
  }

  void method2(int param) {
    class LocalClass {
      void method() {
        System.out.println(param);
      }
    }
  }
}
