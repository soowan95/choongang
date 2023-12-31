package ch07Extends.lecture;

public class C26AbstractMethod {
  public static void main(String[] args) {
    Dog26 d1 = new Dog26();
    d1.breath();

    Animal26 a1 = d1;
    a1.breath();

    Animal26 a2 = new Fist26();
    a2.breath();
  }
}

//추상 메소드를 가진 클래스는 꼭 추상 클래스가 되어야 함
abstract class Animal26 {
  //추상 메소드 : 몸통이 없는 메소드
  abstract public void breath();
}

class Dog26 extends Animal26 {
  @Override
  public void breath() {
    System.out.println("폐로 숨을 쉽니다");
  }
}

class Fist26 extends Animal26 {
  @Override
  public void breath() {
    System.out.println("아가미로 숨을 쉽니다");
  }
}