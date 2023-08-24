import java.util.Scanner;

public class SelectJackup {
  static void inputScreen() {
    Scanner sc = new Scanner(System.in);
    String pro, model, yn = "y";
    int size;
    while(yn.equalsIgnoreCase("y")) {
      System.out.println("------------------------------");
      System.out.println("입력 화면입니다.");
      System.out.print("상품명을 입력해주세요 :"); pro = sc.nextLine();
      System.out.print("모델명을 입력해주세요 :"); model = sc.nextLine();
      System.out.print("규격을 입력해주세요 :"); size = sc.nextInt();
      System.out.println("------------------------------");
      System.out.printf("상품명 : %s\n규격 : %d\"\n모델 : %s\n", pro, size, model);
      sc.nextLine();
      System.out.println("또 상품을 입력 하실건가요? (Y/N)");
        while(true) {
          String input = sc.nextLine();
          if(input.equalsIgnoreCase("y")) {
            yn = input;
            break;
          } else if(input.equalsIgnoreCase("n")) {
            yn = input;
            System.out.println("종료합니다.");
            break;
          } else {
            System.out.println("잘 못 입력하셨습니다. 또 상품을 입력 하실건가요? (Y/N)");
          }
        }
    }
  }

  static void serchScreen() {
    Scanner sc = new Scanner(System.in);
    String pro, yn = "y";
    while(yn.equalsIgnoreCase("y")) {
      System.out.println("------------------------------");
      System.out.println("조회 화면입니다.");
      System.out.print("조회 하실 상품명 : "); pro = sc.nextLine();
      System.out.println("------------------------------");
      System.out.println(pro + "이(가) 조회 되었습니다.");
      System.out.println("또 조회 하실건가요? (Y/N)");
      while(true) {
        String input = sc.nextLine();
        if(input.equalsIgnoreCase("y")) {
          yn = input;
          break;
        } else if(input.equalsIgnoreCase("n")) {
          yn = input;
          System.out.println("종료합니다.");
          break;
        } else {
          System.out.println("잘 못 입력하셨습니다. 또 조회 하실건가요? (Y/N)");
        }
      }
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int no;
    String yn;

    while(true) {
      System.out.println("프로그램 화면");
      System.out.println("1. 입력");
      System.out.println("2. 조회");
      System.out.println("3. 수정");
      System.out.println("4. 출력");
      System.out.println("5. 종료");
      System.out.print("작업 번호를 누르세요 :"); no = sc.nextInt();
      // System.out.printf("작업 번호 : %d", no);

      switch(no) {
        case 1: {
          inputScreen();
        } break;
        case 2: {
          serchScreen();
        } break;
        case 3: {
          System.out.println("수정 화면입니다.");
        } break;
        case 4: {
          System.out.println("출력 화면입니다.");
        } break;
        case 5: {
          System.out.println("종료 화면입니다.");
        } break;
        default : {
          System.out.println("선택 번호를 확인하고 다시 입력하세요.");
        }
      }
    }
  }
}