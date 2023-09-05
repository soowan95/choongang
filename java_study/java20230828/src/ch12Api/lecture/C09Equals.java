package ch12Api.lecture;

public class C09Equals {
  public static void main(String[] args) {
    Object o1 = new String("java");
    Object o2 = new String("spring");
    Object o3 = new String("java");

    System.out.println(o1 == o2); // false
    System.out.println(o1 == o3); // false

    System.out.println(o1.equals(o2)); // false
    System.out.println(o1.equals(o3)); // true
  }
}
