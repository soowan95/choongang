package ch13Generic.lecture;

import java.util.Arrays;

public class C08Wildcard {
  public static void main(String[] args) {
    MyClass08<?> o1 = new MyClass08<Animal>();
    MyClass08<?> o2 = new MyClass08<Dog>();
    MyClass08<?> o3 = new MyClass08<Cat>();
    MyClass08<?> o4 = new MyClass08<Cat>();
  }

  public void otherMethod() {
    someMethod(new MyClass08<>());
    someMethod(new MyClass08<Animal>());
    someMethod(new MyClass08<Dog>());
    someMethod(new MyClass08<Cat>());
  }

  public void someMethod(MyClass08<?> param) {
    param.hashCode();
    param.equals(null);
    param.toString();
  }
}

class MyClass08<T> {

}