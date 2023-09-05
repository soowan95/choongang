package ch16Lambda.lecture;

public class C10ConstructorReference {
  public static void main(String[] args) {
    MyInterface10 o1 = () -> new MyClass10();

    MyInterface10 o2 = MyClass10::new;
  }
}

class MyClass10 {
  MyClass10() {};
}

interface MyInterface10 {
  MyClass10 method();
}