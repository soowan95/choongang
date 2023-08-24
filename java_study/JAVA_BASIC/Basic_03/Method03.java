public class Method03 {
  static String kimchi = "김치";
  String beef = "소고기";
  static void res1() {
    System.out.printf("%s를 먹었습니다.\n", kimchi);
  }
  void res2() {
    System.out.printf("%s를 먹었습니다.\n", beef);
  }
  public static void main(String[] args) {
    res1();
    Method03 mt = new Method03();
    mt.res2();
  }
}
