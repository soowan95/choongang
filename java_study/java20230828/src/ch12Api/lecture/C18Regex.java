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

    System.out.println("dog".matches("do{1,9}g")); // true
    System.out.println("dooooog".matches("do{1,9}g")); // true
    System.out.println("dooog".matches("do{1,9}g")); // true

    // 그룹 : ()
    System.out.println("dog".matches("(do){1,3}g")); // true
    System.out.println("dodog".matches("(do){1,3}g")); // true
    System.out.println("dododog".matches("(do){1,3}g")); // true

    // 수량 : {n,} n개 이상
    System.out.println("dog".matches("do{1,}g")); // true
    System.out.println("doooooooooooooooooooog".matches("do{1,}g")); // true

    // ? : 없거나 한번
    System.out.println("dg".matches("do?g")); // true
    System.out.println("dog".matches("do?g")); // true
    System.out.println("doog".matches("do?g")); // false

    // * : 0번 이상
    System.out.println("dg".matches("do*g")); // true
    System.out.println("dog".matches("do*g")); // true
    System.out.println("doog".matches("do*g")); // true
    System.out.println("dooog".matches("do*g")); // true
    System.out.println("doooog".matches("do*g")); // true

    // + : 1번 이상
    System.out.println("dg".matches("do+g")); // false
    System.out.println("dog".matches("do+g")); // true
    System.out.println("doog".matches("do+g")); // true
    System.out.println("dooog".matches("do+g")); // true
    System.out.println("doooog".matches("do+g")); // true

    // 문자 분류 (Character classes)
    System.out.println("dog".matches("d[oi]g")); // true
    System.out.println("dig".matches("d[oi]g")); // true
    System.out.println("dag".matches("d[oi]g")); // false

    System.out.println("dog".matches("d[^oi]g")); // false
    System.out.println("dig".matches("d[^oi]g")); // false
    System.out.println("dag".matches("d[^oi]g")); // true

    // 문자 분류 기호
    System.out.println("0".matches("[0-9]")); // true
    System.out.println("7".matches("[0-9]")); // true
    System.out.println("0".matches("\\d")); // true
    System.out.println("7".matches("\\d")); // true

    System.out.println("a".matches("[a-zA-Z_0-9]")); // true
    System.out.println("_".matches("\\w")); // true
    System.out.println("9".matches("\\w")); // true

    // 예제 : 숫자로 시작하면 안되고, 영문대소문자, _, $
    System.out.println("adsf".matches("[a-zA-Z_$][a-zA-Z_$0-9]*"));

    // 전화번호 패턴
    String telPattern = "\\d{2,3}-?\\d{3,4}-?\\d{4}";
    System.out.println("010-5362-9797".matches(telPattern));
    System.out.println("01053629797".matches(telPattern));
    System.out.println("025369797".matches(telPattern));
    System.out.println("010-364-9797".matches(telPattern));
    System.out.println("010-3464-797".matches(telPattern));
    System.out.println("010".matches(telPattern));

    // 모든 문자
    System.out.println(" ".matches(".")); // true
    System.out.println("a".matches(".")); // true
    System.out.println("3".matches(".")); // true
    System.out.println("+".matches(".")); // true
    System.out.println(".".matches(".")); // true

    // 이메일 패턴
    // 영문소문자, 숫자가 여러개 @ 영문소문자, 숫자가 여러개 . 영문소준자, 숫자 여러개
    String ePattern = "[a-z0-9]*@[a-z0-9]*\\.[a-z0-9]*";
    System.out.println("john23@google3.co2m".matches(ePattern));

    // or : |
    System.out.println("adusfdogasdf".matches(".*dog.*")); // true
    System.out.println("asdfcat31".matches(".*cat.*")); //true
    System.out.println("adusfdogasdf".matches(".*(dog|cat).*")); // true
    System.out.println("asdfcat31".matches(".*(dog|cat).*")); //true
  }
}
