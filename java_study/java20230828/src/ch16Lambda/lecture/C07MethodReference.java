package ch16Lambda.lecture;

public class C07MethodReference {
  public static void main(String[] args) {
    MyInterface07 o1 = MyClass07::otherMethod;
    o1.method(3, 3);
  }
}

class MyClass07 {
  static void otherMethod(int x, int y) {
    System.out.println(x + y);
  }
}

interface MyInterface07 {
  void method(int x, int y);
}