package ch07Extends.lecture;

public class C25Abstract {
  public static void main(String[] args) {
    Dog25 d1 = new Dog25();
    Cat25 c1 = new Cat25();

    Animal25 a1 = d1;
    Animal25 a2 = c1;

//    Animal25 a3 = new Animal25();
  }
}

//추상 클래스(abstract class)는 인스턴스 생성 불가
abstract class Animal25 {
  // 필드
  // 생성자
  // 메소드
}

class Dog25 extends Animal25 {}

class Cat25 extends Animal25 {}