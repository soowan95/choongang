package ch12Api.lecture;

public class C17ReplaceAll {
  public static void main(String[] args) {
    // replacAll : 특정 패턴 -> 다른 문자열로 변경
    String a = "JAVA is java";
    String r = a.replace("java", "python");
    System.out.println(r);

    String r2 = a.replaceAll("(java|JAVA)", "python");
    System.out.println(r2);
  }
}
