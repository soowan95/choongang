import java.util.Scanner;

public class MethodBack {
  static void who() {
    System.out.println("넌 누구니?");
  }

  static void iam(int no) {
    Scanner sc = new Scanner(System.in, "EUC-KR");
    String name;
    System.out.print("이름을 입력하세요 : ");
    name = sc.nextLine();
    System.out.printf("번호 %d : %s\n", no, name);
  }

  public static void main(String[] args) {
    for (int i = 0; i < 3; i++) {
      who();
      iam(i + 1);
    }
  }
}