public class Test01 {
  static int stringToInt(String a) {
    int i = Integer.parseInt(a);
    return i;
  }
  public static void main(String[] args) {
    String a = "100";
    String b = "200";
  /*
    int A = Integer.parseInt(a);
    int B = Integer.parseInt(b);

    System.out.println(A * B);
  */
  int A = stringToInt(a);
  int B = stringToInt(b);
  System.out.println(A * B);
  }
}
