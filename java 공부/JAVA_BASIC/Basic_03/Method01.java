public class Method01 {
  static String name1 = "홍길동";
  static void sogae1() {
    System.out.printf("나는 %s 입니다.\n", name1);
  }
  String name2 = "이동수";
  void sogae2() {
    System.out.printf("나는 %s 입니다.\n", name2);
  }
  public static void main(String[] args) {
    sogae1();
    Method01 sogae2 = new Method01();
    sogae2.sogae2();
  }
}