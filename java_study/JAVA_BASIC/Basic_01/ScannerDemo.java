import java.util.Scanner;

public class ScannerDemo {
  public static void main(String[] args) {
    try (Scanner scanf = new Scanner(System.in)) {
      int su;
      String str;
      System.out.println("숫자를 입력 하세요 : ");
      su = scanf.nextInt();
      System.out.println("값 : " + su);
      scanf.nextLine();
      System.out.println("문자를 입력 하세요.");
      str = scanf.nextLine();
      System.out.println("입력한 문자열은 : " + str);
    }
  }
}
