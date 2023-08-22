import java.util.ArrayList;
import java.util.Scanner;

public class InputScreen {
  Scanner sc = new Scanner(System.in);
  ArrayList<String> inputNameA = new ArrayList<String>();
  ArrayList<String> inputTelA = new ArrayList<String>();
  ArrayList<Integer> inputAgeA = new ArrayList<Integer>();
  String name, tel;
  int age;
  void inputMode() {
    while(true) {
      System.out.println("입력 화면");
      System.out.println("1. 이 름 : ");
      System.out.println("2. 전 화 : ");
      System.out.println("3. 나 이 : ");
      System.out.println("4. 저 장 : ");
      System.out.println("작업 번호를 선택 하세요 : "); int no = sc.nextInt();
      int count = 0;
      if(no == 1) {
        sc.nextLine();
        System.out.print("이름을 입력하세요 : "); name = sc.nextLine();
      } else if(no == 2) {
        sc.nextLine();
        System.out.print("전화번호를 입력하세요 : "); tel = sc.nextLine();
      } else if(no == 3) {
        System.out.print("나이를 입력하세요 : "); age = sc.nextInt();
      } else if(no == 4) {
        System.out.println("저장됐습니다.");
        inputNameA.add(name);
        inputTelA.add(tel);
        inputAgeA.add(age);
        System.out.println(inputNameA.get(count) + " " + inputTelA.get(count) + " " + inputAgeA.get(count));
        count++;
        break;
      } else {
        System.out.println("잘 못 된 번호입니다.");
      }
    }
  }
}
