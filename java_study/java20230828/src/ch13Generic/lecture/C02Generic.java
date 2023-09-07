package ch13Generic.lecture;

public class C02Generic {
  public static void main(String[] args) {
    MyClass02<Object> o1 = new MyClass02<>();
    MyClass02<String> o2 = new MyClass02<>();
    MyClass02<Integer> o3 = new MyClass02<>();
    MyClass02<Boolean> o4 = new MyClass02<>();


  }
}

// generic type
class MyClass02<T> {

  private T a;

}