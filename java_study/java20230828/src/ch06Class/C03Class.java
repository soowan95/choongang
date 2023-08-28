package ch06Class;

public class C03Class {
  public static void main(String[] args) {
    MyClass03 o1 = new MyClass03();

    o1.address = "seoul";

    System.out.println(o1.address);

    o1 = method1();

    System.out.println(o1.address);
  }

  public static MyClass03 method1() {
    MyClass03 p = new MyClass03();
    p.address = "jeju";

    return  p;
  }
}

class MyClass03 {
  String address;
}
