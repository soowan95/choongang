package ch16Lambda.book.ch16.p717.no6;

public class Example {
  public static double calc(Function fun) {
    double x = 10;
    double y = 4;
    return fun.apply(x, y);
  }

  public static void main(String[] args) {
    double result = calc((x, y) -> x / y);
    System.out.println("result = " + result);
  }
}
