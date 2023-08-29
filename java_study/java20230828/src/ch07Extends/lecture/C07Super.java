package ch07Extends.lecture;

public class C07Super {
  public static void main(String[] args) {
    MySubClass071 o1 = new MySubClass071();
    o1.method1();
  }
}

class MyClass07 {
  void method1() {
    System.out.println("부모 클래스 메소드 가능");
  }
}

class MySubClass071 extends MyClass07 {
  @Override
  void method1() {
//    System.out.println("부모 클래스 메소드 가능");
    super.method1(); // 부모 클래스의 원래 메소드 호출
    System.out.println("자식 클래스의 재정의 한 메소드");
  }
}