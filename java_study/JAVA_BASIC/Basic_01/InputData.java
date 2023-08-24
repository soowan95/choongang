import java.util.Scanner;

public class InputData {

  public static void main(String[] args) {
    try (Scanner abc = new Scanner(System.in)) {
      int su;
      double f;
      System.out.print("숫자 입력 : ");
      su = abc.nextInt();
      System.out.printf("입력한 숫자는 %d 맞나요?\n", su);
      System.out.print("실수 입력 : ");
      f = abc.nextDouble();
      System.out.printf("입력한 실수는 %f 맞나요?", f);
    }
  }
}