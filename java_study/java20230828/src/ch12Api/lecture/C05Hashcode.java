package ch12Api.lecture;

public class C05Hashcode {
  public static void main(String[] args) {
    Object o1 = new Object();
    Object o2 = new Object();

    int hashCode1 = o1.hashCode();
    int hashCode2 = o2.hashCode();

    System.out.println(hashCode1);
    System.out.println(hashCode2);
  }
}
