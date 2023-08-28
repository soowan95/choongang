package ch06Class;

public class C04Array {
  public static void main(String[] args) {
    int[] a = { 3, 4 };

    System.out.println(a[0]); // 3

    a = method1();

    System.out.println(a[0]); // 22
  }

  public static int[] method1() {
    int[] k = { 22, 33 };

    return k;
  }
}
