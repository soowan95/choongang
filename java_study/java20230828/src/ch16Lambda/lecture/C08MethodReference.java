package ch16Lambda.lecture;

public class C08MethodReference {
  public static void main(String[] args) {
    MyClass08 o2 = new MyClass08();
    MyInterface08 o1 = o2::otherMethod;
  }
}

class MyClass08 {
  void otherMethod(int x, int y) {
    System.out.println(x - y);
  }
}

interface MyInterface08 {
  void method(int x, int y);
}