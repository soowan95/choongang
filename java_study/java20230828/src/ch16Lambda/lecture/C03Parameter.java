package ch16Lambda.lecture;

public class C03Parameter {
  public static void main(String[] args) {
    MyInterface03 o1 = (int x, int y) -> {};
    MyInterface03 o2 = (x, y) -> {};
  }
}

@FunctionalInterface
interface MyInterface03 {
  void method(int x, int y);
}