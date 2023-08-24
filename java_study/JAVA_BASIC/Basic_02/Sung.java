import java.util.Scanner;

public class Sung {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int kook, eng, math;
    String yn = "y";
    while(yn.equalsIgnoreCase("y")) {
      System.out.print("국어점수를 입력하세요: "); kook = sc.nextInt();
      System.out.printf("국어 : %d 점\n", kook);
      System.out.print("영어점수를 입력하세요: "); eng = sc.nextInt();
      System.out.printf("영어 : %d 점\n", eng);
      System.out.print("수학점수를 입력하세요: "); math = sc.nextInt();
      System.out.printf("수학 : %d 점\n", math);
      int sum = kook + eng + math;
      double avg = sum / 3;
      System.out.println("총점 : " + sum + " 점");
      System.out.printf("평균 : %5.2f 점으로 ", avg);
      String result = (avg < 60) ? "불합격" : "합격";
      System.out.printf("%s 입니다.\n", result);
      if(avg >= 90) {
        System.out.println("학점 : A");
      } else if(avg >= 80) {
        System.out.println("학점 : B");
      } else if(avg >= 70) {
        System.out.println("학점 : C");
      } else if(avg >= 60) {
        System.out.println("학점 : D");
      } else {
        System.out.println("학점 : F");
      }
      sc.nextLine();
      System.out.println("점수를 다시 입력하시겠습니까? (Y/N)");
      while(true) {
        String input = sc.nextLine();
        if(input.equalsIgnoreCase("y")) {
          yn = input;
          break;
        } else if(input.equalsIgnoreCase("n")) {
          yn = input;
          System.out.println("종료했습니다.");
          break;
        } else {
          System.out.println("잘못된 입력입니다. 다시 입력하세요. (Y/N)");
        }
      }
    }
  }
}