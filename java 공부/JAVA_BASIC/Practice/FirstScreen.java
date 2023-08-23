import java.util.Scanner;

public class FirstScreen {
  Scanner sc = new Scanner(System.in);
  void makeLine() {
    System.out.println("==============================");
  }
  void firstMode() {
    makeLine();
    System.out.println("작업 입력 선택 화면");
    System.out.println("1. 입 력 : ");
    System.out.println("2. 수 정 : ");
    System.out.println("3. 출 력 : ");
    System.out.println("4. 조 회 : ");
    System.out.println("5. 종 료 : ");
    makeLine();
    System.out.print("작업 번호를 선택 하세요 : ");
  }
}
