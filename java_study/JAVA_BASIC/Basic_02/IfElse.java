import java.util.Scanner;

public class IfElse {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    /*
    int jumsu = 75;
    String hak = "";
    String han = "";
    if(jumsu >= 90) {
    hak = "A";
    han = "최우수";
    } else if(jumsu >= 80) {
    hak = "B";
    han = "우수";
    } else if(jumsu >= 70) {
    hak = "C";
    han = "보통";
    } else if(jumsu >= 60) {
    hak = "D";
    han = "미흡";
    } else {
    hak = "F";
    han = "낙제";
    }
    System.out.println(hak);
    System.out.println(han + " 성적");
     */
    /*
    for(int i = 1; i <= 6; i++) {
    int num = (int)(Math.random() * 45) + 1;
    System.out.print(num + ", ");
    }
     */
    /*
    int no = 0;
    if (no >= 0 || no < 4) {
    while(no <4) {
    System.out.print("숫자를 입력하세요 : "); no = sc.nextInt();
    switch (no) {
    case 0:
    System.out.println("0이군");
    break;
    case 1:
    System.out.println("1이군");
    break;
    case 2:
    System.out.println("2이군");
    break;
    case 3:
    System.out.println("3이군");
    }
    } System.out.println("오류");
    }
     */
    /*
    int score = 1;
    while (score > 0) {
    System.out.print("점수를 입력하세요(0은 종료) : ");
    score = sc.nextInt();
    switch (score / 10) {
    case 10:
    System.out.println("최우수");
    break;
    case 9:
    System.out.println("최우수");
    break;
    case 8:
    System.out.println("우수");
    break;
    case 7:
    System.out.println("보통");
    break;
    case 0:
    System.out.println("-----------------------------");
    break;
    default:
    System.out.println("아쉽네요");
    }
    }
    System.out.println("종료");
    */
    System.out.print("숫자를 입력하세요 : "); int su = sc.nextInt();
    switch (su % 2) {
      case 0:
        System.out.println("짝짝짝");
        break;
      case 1:
        System.out.println("홀홀홀");
    }
  }
}