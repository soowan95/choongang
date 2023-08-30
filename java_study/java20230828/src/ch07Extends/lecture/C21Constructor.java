package ch07Extends.lecture;

public class C21Constructor {
  public static void main(String[] args) {
    MyClass21 o1 = new MyClass21(40);

    o1.printAge();

    MyClass21 o2 = new MyClass21(50);

    o2.printAge();
  }
}

class MyClass21 {
  private int age;

  MyClass21(int age) {
    this.age = age;
  }

  public void printAge() {
    System.out.println("age = " + age);
  }
}