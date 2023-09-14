package ch11Exception.lecture;

public class C02Exception {
  public static void main(String[] args) {
    System.out.println("실행코드1");
    System.out.println("실행코드2");

    int[] arr = {1, 2};
    int i = arr[2]; // ArrayIndexOutOfBoundsException

    System.out.println("실행코드3");
  }
}
