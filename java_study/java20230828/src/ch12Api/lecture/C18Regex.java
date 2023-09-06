package ch12Api.lecture;

public class C18Regex {
  public static void main(String[] args) {
    // regular expression : 정규표현식(정규식, 정규식표현)
    // 문자열의 패턴을 나타내는 기호들

    // 문자
    System.out.println("x".matches("x")); // true
    System.out.println("x".matches("a")); // true
    System.out.println("a".matches("x")); // false

    // 문자들
    System.out.println("xyz".matches("xyz")); // true
    System.out.println("xxx".matches("xxx")); // true
    System.out.println("xxx".matches("x")); // false

    // 수량자(quantifiers)
    System.out.println("xxx".matches("x{3}")); // true
    System.out.println("aaa".matches("a{3}")); // true
    System.out.println("aa".matches("a{3}")); // false
    System.out.println("a".matches("a{1,3}")); // true
    System.out.println("aa".matches("a{1,3}")); // true
    System.out.println("aaa".matches("a{1,3}")); // true

    System.out.println("dog".matches("do{1,9}g"));
    System.out.println("dooooog".matches("do{1,9}g"));
    System.out.println("dooog".matches("do{1,9}g"));
  }
}
