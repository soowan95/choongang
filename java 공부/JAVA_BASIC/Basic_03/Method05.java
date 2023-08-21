public class Method05 {
  static String name = "난장이";
  static int count = 0;
  static void who() {
    for(int i = 0; i < 7; i++) {
      count++;
      System.out.println("넌 누구니?");
      System.out.printf("나는 %d번째 %s야\n", count, name);
    }
  }
  public static void main(String[] args) {
    who();
  }
}
