package ch13Generic.lecture;

public class C06Wildcard {
  public static void main(String[] args) {
    Dog d = new Dog();
    Animal a1 = d;
    Cat c = new Cat();
    Animal a2 = c;

    MyClass06<Dog> o1 = new MyClass06<>();
//    MyClass06<Animal> o2 = o1;
//    o2.set(new Animal());

    MyClass06<? extends Animal> o3 = o1;
    Animal ani1 = o3.get();
    ani1.animalMethod();

    MyClass06<? super Animal> o4 = new MyClass06<Animal>();
    MyClass06<? super Animal> o5 = new MyClass06<Object>();

  }
}

class Animal {
  public void animalMethod() {}
}

class Dog extends Animal {}

class Cat extends Animal {}

class MyClass06<T> {

  public void set(T param) {}

  public T get() {
    return null;
  }
}