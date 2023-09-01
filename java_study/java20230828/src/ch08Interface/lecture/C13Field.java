package ch08Interface.lecture;

public class C13Field {
  public static void main(String[] args) {
    System.out.println(MyInterface13.VALUE);
    System.out.println(MyInterface13.NAME);
    System.out.println(MyInterface13.HOME_ADDRESS);

    String str = "asdf";
    str.substring(1, 2);
    boolean a = str.substring(1, 2).equals("a");
  }
}

interface MyInterface13 {
  int VALUE = 30; // public static final
  public static final String NAME = "java";
  String HOME_ADDRESS = "seoul";
}