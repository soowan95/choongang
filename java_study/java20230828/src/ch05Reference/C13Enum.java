package ch05Reference;

public class C13Enum {
  public static void main(String[] args) {
    MySeason13 v1 = MySeason13.FALL;

    System.out.println("v1.toString() = " + v1.toString());
    System.out.println("v1.hashCode() = " + v1.hashCode());

    System.out.println("v1.name() = " + v1.name());
    System.out.println("v1.ordinal() = " + v1.ordinal());
  }
}

// Enum 을 상속받음
enum MySeason13 {
  SPRING,
  SUMMER,
  FALL,
  WINTER
}