package ch16Lambda.lecture;

public class C06MethodReference {
  public static void main(String[] args) {
    MyInterface06 o1 = a -> C06MethodReference.someMethod(a);

    // 메소드 참조 (method refernence)
    MyInterface06 o2 = C06MethodReference::someMethod;
  }

  public static void someMethod(int x) {

  }
}

interface MyInterface06 {
  void method(int a);
}