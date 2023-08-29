package ch06Class;

public class C08Static {
  public static void main(String[] args) {
    MyClass08 o1 = new MyClass08();

    o1.name = "java";
    o1.printName();

    // static member는 클래스 이름으로 바로 접근해야함.
    MyClass08.name = "spring";
    MyClass08.printName();
  }
}

class MyClass08 {
  static String name;

  static void printName() {
    System.out.println("name = " + name);
  }
}