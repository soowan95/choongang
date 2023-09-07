package ch13Generic.lecture;

public class C09GenericMethod {
  public static void main(String[] args) {
    MyClass09 o1 = new MyClass09();
    o1.<Object>method(new Object());
    o1.<String>method("java");

    String s = o1.<String>method1();
    Object o = o1.<Object>method1();


  }
}

class MyClass09 {

  public <T> void method(T param) {

  }

  public <T> T method1() {
    return null;
  }
}