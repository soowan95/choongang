package ch07Extends.lecture;

public class C03Extends {
  public static void main(String[] args) {
    MySubClass031 o1 = new MySubClass031();

    o1.printName();
  }
}

class MyClass03 {
  private String name;

  void printName() {
    System.out.println("name = " + name);
  }
}

class MySubClass031 extends  MyClass03 {
  // private field는 자식 클래스에서 사용할 수 없음.
  void setName(String name) {
//    this.name = name;
  }
}