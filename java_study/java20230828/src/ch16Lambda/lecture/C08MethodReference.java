package ch16Lambda.lecture;

public class C08MethodReference {
  public static void main(String[] args) {
    MyClass08 o1 = new MyClass08();
    o1.someMethod(o1::otherMethod);
  }
}

class MyClass08 {
  void someMethod(MyInterface08 i) {
    int result = i.method(10,20);
    System.out.println("result = " + result);
  }
  int otherMethod(int x, int y) {
    return x - y;
  }
}

interface MyInterface08 {
  int method(int x, int y);
}