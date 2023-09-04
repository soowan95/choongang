package ch16Lambda.book.ch16.p717.no7;

public class Example {
  private static int[] scores = { 10, 50, 3 };

  public static int maxOrMin(Operator operator) {
    int result = scores[0];
    for(int score : scores) {
      result = operator.apply(result, score);
    }
    return result;
  }

  public static void main(String[] args) {
    int max = maxOrMin(Math::max);
    System.out.println("max = " + max);

    int min = maxOrMin((x, y) -> {
      if(x < y) return x;
      return y;
    });
    System.out.println("min = " + min);
  }
}
