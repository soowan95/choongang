package ch12Api.lecture;

public class C22Wrapper {
  public static void main(String[] args) {
    Integer i = 3000;
    Integer j = 3000;

    int k = 30;
    int l = 30;

    System.out.println(k == l);
    System.out.println(i == j);

    System.out.println(i.equals(j));

    System.out.println(System.identityHashCode(i));
    System.out.println(System.identityHashCode(j));
  }
}
