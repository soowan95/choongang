package ch08Interface.lecture;

public class C02Interface {
  public static void main(String[] args) {
    MyClass021 o1 = new MyClass021();
    MyInterface02 i1 = o1;

    System.out.println(System.identityHashCode(o1));
    System.out.println(System.identityHashCode(i1));

    MyInterface02 i2 = new MyClass021();

    System.out.println(System.identityHashCode(i2));

    i2.method1();
    i2.method2();

    MyInterface02 i3 = new MyClass022();

    i3.method1();
    i3.method2();
  }
}

interface MyInterface02 {
  // 추상 메소드
  abstract public void method1();

  void method2(); // abstract public 생략 가능
}

class MyClass021 implements MyInterface02 {
  @Override
  public void method1() {
    System.out.println("MyClass021.method1");
  }

  @Override
  public void method2() {
    System.out.println("MyClass021.method2");
  }
}

class MyClass022 implements MyInterface02 {
  @Override
  public void method1() {
    System.out.println("MyClass022.method1");
  }

  @Override
  public void method2() {
    System.out.println("MyClass022.method2");
  }
}