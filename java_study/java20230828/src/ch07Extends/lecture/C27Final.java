package ch07Extends.lecture;

public class C27Final {
  public static void main(String[] args) {
    final int a = 3;
  }
}

class MyClass27 {
  final int age = 3;

  final String name;

  MyClass27() {
    this.name = "java";
  }

  MyClass27(String name) {
    this.name = name;
  }
}