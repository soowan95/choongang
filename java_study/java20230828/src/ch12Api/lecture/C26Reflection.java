package ch12Api.lecture;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class C26Reflection {
  public static void main(String[] args) {
    MyClass26 o1 = new MyClass26("son");

    Class<? extends MyClass26> aClass = o1.getClass();

    System.out.println("aClass.getName() = " + aClass.getName());
    System.out.println("aClass.getSimpleName() = " + aClass.getSimpleName());
    System.out.println("aClass.getPackageName() = " + aClass.getPackageName());

    Field[] fields = aClass.getDeclaredFields();
    System.out.println("fields = " + fields.length);

    Constructor[] constructors = aClass.getDeclaredConstructors();
    System.out.println("constructors = " + constructors.length);

    Method[] methods = aClass.getDeclaredMethods();
    System.out.println("methods = " + methods.length);
  }
}

class MyClass26 {
  private String name;

  public MyClass26(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}