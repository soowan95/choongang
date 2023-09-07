package ch15Collection.lectuer;

import java.util.ArrayList;
import java.util.List;

public class C04ForEach {
  public static void main(String[] args) {
    List<MyClass04> list = new ArrayList<>();
    list.add(new MyClass04("흥민"));
    list.add(new MyClass04("강인"));
    list.add(new MyClass04("민재"));

    list.forEach(System.out::println);
  }
}

class MyClass04 {
  private String name;

  public MyClass04(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "MyClass04{" +
            "name='" + name + '\'' +
            '}';
  }
}