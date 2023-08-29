package ch06Class;

public class C10Capsule {
  public static void main(String[] args) {
    MyClass10 o1 = new MyClass10();
  
    o1.setAge(10);
    System.out.println("age = " + o1.getAge());
  }
}

class MyClass10 {
  private int age;
  private String name;

  public int getAge() {
    return age;
  }

  public String getName() {
    return name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setName(String name) {
    this.name = name;
  }
}