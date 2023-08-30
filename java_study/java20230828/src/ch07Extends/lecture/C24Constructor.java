package ch07Extends.lecture;

public class C24Constructor {
}

class MyClass24 {
  int age;

  MyClass24(int age) {
    this.age = age;
  }
}
class MySubClass241 extends MyClass24 {
  MySubClass241(int age) {
    super(age);
  }
}