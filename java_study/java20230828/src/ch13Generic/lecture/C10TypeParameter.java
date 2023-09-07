package ch13Generic.lecture;

public class C10TypeParameter {
  public static void main(String[] args) {
    MyClass11<Animal> o1 = new MyClass11<>();
    MyClass11<Dog> o2 = new MyClass11<>();
    MyClass11<Cat> o3 = new MyClass11<>();
  }
}

class MyClass11<T extends Animal> {

  public void method(T param) {
    param.equals(null);
    param.toString();
    param.hashCode();
    param.animalMethod();
  }
}