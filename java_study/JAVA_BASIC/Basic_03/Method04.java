public class Method04{
  static String name1 = "홍길동", job1 = "개발자";
  static int age1 = 20;
  static void info1() {
    System.out.printf("이름 : %s\n직업 : %s\n나이 : %d\n", name1, job1, age1);
  }
  String name2 = "이동수", job2 = "프론트";
  int age2 = 30;
  void  info2() {
    System.out.printf("이름 : %s\n직업 : %s\n나이 : %d\n", name2, job2, age2);
  }
  public static void main(String[] args) {
    info1();
    Method04 mt1 = new Method04();
    mt1.info2();
  }
}
