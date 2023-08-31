package ch07Extends.lecture.package1;

import ch07Extends.lecture.MyClass30;

public class C31AccessMoodifier {
  public static void main(String[] args) {
    MyClass30 o1 = new MyClass30();
//    o1.privateMethod(); // x
    o1.publicMethod(); // ok
//    o1.packagePrivateMethod(); // x
//    o1.protectedMethod(); // x
  }
}
