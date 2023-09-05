package ch12Api.lecture;

public class C11String {
  public static void main(String[] args) {
    // String : 문자열
    String a = "java";
    String b = "java";
    String c = new String("java");

    System.out.println(a == b); // true
    System.out.println(a == c); // false

    System.out.println(a.equals(b));
    System.out.println(a.equals(c));
  }
}
