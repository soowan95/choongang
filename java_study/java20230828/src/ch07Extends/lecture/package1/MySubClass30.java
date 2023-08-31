package ch07Extends.lecture.package1;

import ch07Extends.lecture.MyClass30;

public class MySubClass30 extends MyClass30 {
    public void someMethod() {
      super.publicMethod();
      super.protectedMethod();
//      super.packagePrivateMethod(); // x
//      super.privateMethod(); // x
    }
}
