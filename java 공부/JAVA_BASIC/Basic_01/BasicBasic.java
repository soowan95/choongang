public class BasicBasic {
  public static void main(String[] args) {
    int intValue = 10;
    System.out.println("정수값 출력 " + intValue);
    System.out.println("------------------------");
    String str = "김수완";
    System.out.printf("문자열 출력 : %s\n", str);
    System.out.println("------------------------");
    char ch = '김';
    System.out.printf("문자 출력 : %c\n", ch);
    System.out.println("------------------------");
    double dou = 65.7654654;
    System.out.printf("실수 출력 : %f\n", dou);
    System.out.println("------------------------");
    boolean boo = true;
    System.out.printf("논리값 출력 : %b", boo);
  }
}