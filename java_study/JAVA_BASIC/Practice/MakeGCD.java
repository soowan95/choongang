public class MakeGCD {
  public static void main(String[] args) {
  }
  static int GCD(int a, int b) {
    int i = 1;
    int j = 0;
    for(i = 1; (i <= a) && (i <= b); i++) {
      if(((a % i) == 0) && ((b % i) == 0)) {
        j = i;
      }
    }
    return j;
  }
}
