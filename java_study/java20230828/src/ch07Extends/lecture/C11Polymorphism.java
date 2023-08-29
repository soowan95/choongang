package ch07Extends.lecture;

public class C11Polymorphism {
  public static void main(String[] args) {
    String s = "java";
    Object o = s;
    String o2 = new String("java");

//    String t = o; // x

    int v1 = s.hashCode();
    int v2 = o.hashCode();
    int v3 = o2.hashCode();

    System.out.println(v1);
    System.out.println(v2);
    System.out.println(v3);

    System.out.println(System.identityHashCode(s));
    System.out.println(System.identityHashCode(o));
    System.out.println(System.identityHashCode(o2));
  }
}
