package ch16Lambda.lecture;

public class C02Lambda {
  public static void main(String[] args) {
    MyInterface02 o1 = new MyInterface02() {
      @Override
      public void method() {
        System.out.println("C02Lambda.method");
      }
    };

    o1.method();

    MyInterface02 o2 = () -> {
      System.out.println("C02Lambda.main");
    };

    o2.method();

    MyInterface02 o3 = () -> System.out.println("C02Lambda.main");

    o3.method();
  }
}

@FunctionalInterface
interface MyInterface02 {
  // 파라미터 없는 메소드
  // 리턴 없음
  void method();
}