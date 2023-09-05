package ch12Api.lecture;

public class C13Substring {

  public static void main(String[] args) {
    // substring : 부분 문자열 추출
    String a = "spring";

    String sub1 = a.substring(0, 2);// sp
    System.out.println(sub1);

    String sub2 = a.substring(2, 5);// rin
    System.out.println(sub2);
  }
}