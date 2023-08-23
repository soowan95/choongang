import java.util.ArrayList;
import java.util.Scanner;

public class InputScreen {
  Scanner sc = new Scanner(System.in);
  void makeLine() {
    System.out.println("==============================");
  }
  static ArrayList<String> inputNameA = new ArrayList<String>();
  static ArrayList<String> inputTelA = new ArrayList<String>();
  static ArrayList<Integer> inputAgeA = new ArrayList<Integer>();
  String name = "익명", tel = "정보 없음";
  int age;
  int count = 0;
  void inputMode() {
    boolean con = true;
    while(con == true) {
      makeLine();
      System.out.println("입력 화면");
      System.out.println("1. 이 름 : ");
      System.out.println("2. 전 화 : ");
      System.out.println("3. 나 이 : ");
      System.out.println("4. 저 장 : ");
      makeLine();
      System.out.print("작업 번호를 선택 하세요 : "); int no = sc.nextInt();
      while(true) {
        if(no == 1) {
          sc.nextLine();
          makeLine();
          System.out.print("이름을 입력하세요 : "); name = sc.nextLine();
          break;
        } else if(no == 2) {
          sc.nextLine();
          makeLine();
          System.out.print("전화번호를 입력하세요 : "); tel = sc.nextLine();
          break;
        } else if(no == 3) {
          makeLine();
          System.out.print("나이를 입력하세요 : "); age = sc.nextInt();
          break;
        } else if(no == 4) {
          makeLine();
          System.out.println("이름\t전화\t\t나이");
          System.out.println(name + "\t" + tel + "\t" + age);
          makeLine();
          sc.nextLine();
          System.out.print("저장하시겠습니까? (y/n) "); String yn = sc.nextLine();
          if(yn.equalsIgnoreCase("y")) {
            makeLine();
            inputNameA.add(name);
            inputTelA.add(tel);
            inputAgeA.add(age);
            System.out.println("이름\t전화\t\t나이");
            System.out.println(inputNameA.get(count) + "\t" + inputTelA.get(count) + "\t" + inputAgeA.get(count));
            makeLine();
            System.out.println("저장됐습니다.");
            name = "익명"; tel = "정보 없음"; age = 0;
            count++;
            con = false;
            break;
          } else 
            break;
        } else {
          makeLine();
          System.out.println("잘 못 된 번호입니다.");
        }
      }
    }
  }
}
