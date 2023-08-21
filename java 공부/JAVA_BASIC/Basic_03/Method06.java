public class Method06 {
  static String name = "홍길동";
  static int count = 0;

  public static void main(String[] args) {
    for(int i = 0; i < 7; i++) {
      Who.whoPoint();
      Iam.iamPoint();
    }
  }

  class Who {
    static void whoPoint() {
      System.out.println("\n너 누구니?");
    }
  }
  class Iam {
    static void iamPoint() {
      System.out.printf("%d번째 %s이다", ++count, name);
    }
  }
}
