package ch13Generic.lecture;

public class C07Wildcard {

  public void otherMethod() {
    someMethod1(new MyClass07<Dog>());
    someMethod1(new MyClass07<Cat>());
    someMethod1(new MyClass07<>());

    someMethod2(new MyClass07<>());
    someMethod2(new MyClass07<Object>());
  }

  public void someMethod1(MyClass07<? extends Animal> param) {
    Animal item = param.getItem();
  }


  public void someMethod2(MyClass07<? super Animal> param) {
    param.setItem(new Animal());
  }
}


class MyClass07<T> {

  private T item;

  public T getItem() {
    return item;
  }

  public void setItem(T item) {
    this.item = item;
  }
}