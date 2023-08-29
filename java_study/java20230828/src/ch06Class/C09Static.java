package ch06Class;

public class C09Static {
  public static void main(String[] args) {

  }
}

class MyClass09 {
  String name;
  static String model;

  void printName() {
    // instance member끼리 접근 가능
    System.out.println("name = " + name);

    // instance member에서 static member 저근 가능
    System.out.println("model = " + model);
  }

  static void printModel() {
    // static member끼리 접근 가능
    System.out.println("model = " + model);

    // static member에서 instance member는 접근 불가능
//    System.out.println("name = " + name);
  }
}