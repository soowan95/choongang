package ch16Lambda.lecture;

public class C05Return {
  public static void main(String[] args) {
    MyInterface05 o1 = () -> {
      System.out.println("명령문1");
      System.out.println("명령문2");
      return 0;
    };

    MyInterface05 o2 = () -> 0;
  }
}

interface MyInterface05{
  int method();
}

class MyClass05 implements MyInterface05 {
  @Override
  public int method() {
    return 1;
  }
}