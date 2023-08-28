package ch05Reference;

public class C09Method {
  public static void main(String[] args) {
    int a = 5;

    method1(a);

    int b = 50;

    method1(b);
  }

  public static void method1(int p) {
    System.out.println(p);
  }
}
