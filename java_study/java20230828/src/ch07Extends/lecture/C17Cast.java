package ch07Extends.lecture;

public class C17Cast {
  public static void main(String[] args) {
    Animal17 ani1 = new Dog17();
    Animal17 ani2 = new Cat17();

    if(ani1 instanceof Dog17) {
      Dog17 d1 = (Dog17) ani1;
    } else {
      System.out.println("Dog로 형변환 안됨");
    }

    if(ani1 instanceof Cat17) {
      Cat17 c1 = (Cat17) ani1;
    } else {
      System.out.println("Cat로 형변환 안됨");
    }

    if(ani2 instanceof Dog17) {
      Dog17 d2 = (Dog17) ani2;
    } else {
      System.out.println("Dog로 형변환 안됨");
    }

    if(ani2 instanceof Cat17) {
      Cat17 c2 = (Cat17) ani2;
    } else {
      System.out.println("Cat로 형변환 안됨");
    }

    System.out.println("프로그램 종료....");
  }
}

class Animal17 {}

class Dog17 extends Animal17 {}

class Cat17 extends Animal17 {}