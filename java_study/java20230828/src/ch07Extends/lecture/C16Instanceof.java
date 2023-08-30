package ch07Extends.lecture;

public class C16Instanceof {
  public static void main(String[] args) {
    Animal16 ani1 = new Dog16();
    Animal16 ani2 = new Cat16();
    Animal16 ani3 = new Animal16();

    boolean res1 = ani1 instanceof Animal16; // true;
    boolean res2 = ani1 instanceof Dog16; // true;
    boolean res3 = ani1 instanceof Cat16; // false;

    System.out.println("res1 = " + res1);
    System.out.println("res2 = " + res2);
    System.out.println("res3 = " + res3);

    boolean res4 = ani2 instanceof Animal16; // true;
    boolean res5 = ani2 instanceof Dog16; // false;
    boolean res6 = ani2 instanceof Cat16; // true;

    boolean res7 = ani3 instanceof Animal16; // true;
    boolean res8 = ani3 instanceof Dog16; // false;
    boolean res9 = ani3 instanceof Cat16; // false;

    System.out.println("res4 = " + res4);
    System.out.println("res5 = " + res5);
    System.out.println("res6 = " + res6);
    System.out.println("res7 = " + res7);
    System.out.println("res8 = " + res8);
    System.out.println("res9 = " + res9);
  }
}

class Animal16 {}

class Dog16 extends Animal16 {}

class Cat16 extends Animal16 {}