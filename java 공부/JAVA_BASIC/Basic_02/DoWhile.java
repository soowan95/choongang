public class DoWhile {
  public static void main(String[] args) {
    int sum = 0, count = 0;
    do {
      count++;
      sum += count;
    } while(count < 100);
    System.out.println(sum);
  }
}