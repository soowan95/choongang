package ch12Api.lecture;

public class C190Hangul {
  public static void main(String[] args) {
    // 자바 문자 : unicode
    char a = '\u0d05';
    System.out.println(a);
    System.out.println('\u0041');

    System.out.println('\uac00');
    System.out.println('\ud7a3');

    System.out.println("손흥민".matches("[\uac00-\ud7a3]{3}")); // true
    System.out.println("이강인".matches("[\uac00-\ud7a3]{3}")); // true
    System.out.println("해리케인".matches("[\uac00-\ud7a3]{3}")); // false

    System.out.println("손흥민".matches("[가-힣]{3}")); // true
    System.out.println("이강인".matches("[가-힣]{3}")); // true
    System.out.println("해리케인".matches("[가-힣]{3}")); // false

    String s = "java";
    String b = new String("java");
  }
}