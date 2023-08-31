package ch08Interface.lecture;

public class C08Cast {
  public static void main(String[] args) {
    MyInterface08 i1 = new MyClass081();

    i1.method1();

//    i1.otherMethod(); // x

    MyClass081 o1 = (MyClass081) i1;

    o1.otherMethod();

    if(i1 instanceof MyClass081 o2) {
      o2.otherMethod();
    }
  }
}

interface MyInterface08 {
  void method1();
}

class MyClass081 implements MyInterface08 {
  @Override
  public void method1() {
    System.out.println("재정의한 메소드!!!!");
  }

  public void otherMethod() {
    System.out.println("MyClass081.otherMethod");
  }
}