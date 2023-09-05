package ch12Api.lecture;

public class C15IndexOf {
  public static void main(String[] args) {
    // indexOf : 특정 문자열이 시작하는 위치(index) 리턴
    String a = "spring";

    int index = a.indexOf("ring");
    System.out.println(index); // 2

    System.out.println(a.indexOf("pr")); // 1

    String b = "spring is spring";

    System.out.println(b.indexOf("ring"));

    int index1 = b.indexOf("ring", 2);//2
    System.out.println(index1);

    System.out.println(b.indexOf("ring", 3));
  }
}
