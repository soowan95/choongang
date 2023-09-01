package ch08Interface.lecture;

public class C15Exercise {
  MyInterface15 field;

  public static void main(String[] args) {
    C15Exercise o1 = new C15Exercise();
    o1.field = new MyClass151();
    o1.field = new MyClass152();

    method(new MyClass151());
    method(new MyClass152());

    MyInterface15[] arr = new MyInterface15[3];
    arr[0] = new MyClass151();
    arr[1] = new MyClass152();
  }

  public static void method(MyInterface15 parm) {

  }
}

interface MyInterface15 {}

class MyClass151 implements MyInterface15 {}

class MyClass152 implements MyInterface15 {}