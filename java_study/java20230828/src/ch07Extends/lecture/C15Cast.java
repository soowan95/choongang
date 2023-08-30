package ch07Extends.lecture;

public class C15Cast {
  public static void main(String[] args) {
    Animal15 ani1 = new Dog15();
    Animal15 ani2 = new Cat15();

    Dog15 d1 = (Dog15) ani1;
    Cat15 c1 = (Cat15) ani2;

//    Cat15 c2 = (Cat15) ani1; // 문법 오류는 아님. runtime오류가 발생

    System.out.println("프로그램 실행 계속됨...");
  }
}

class Animal15 {}

class Dog15 extends Animal15 {}

class Cat15 extends Animal15 {}