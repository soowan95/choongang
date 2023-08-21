import java.util.Scanner;

public class Array01 {
  public static void main(String[] args) {
    int i;
  /*
    String[] str_1 = {"홍길동", "이동수", "김철수"};
    
    System.out.println(str_1[0]);
    System.out.println(str_1[1]);
    System.out.println(str_1[2]);
    System.out.println("------------------------------");
    for(i = 0; i < str_1.length; i++)
    System.out.println(str_1[i]);
  */
  /*
    String[] week = {"월", "화", "수", "목", "금", "토", "일"};
    for(i = 0; i < week.length; i++)
    System.out.printf("%d번쨰 : %s요일\n", i + 1, week[i]);
  */
  /*
    int[] age = { 10, 20, 30, 40, 50 };
    String[] name = { "홍길동", "이동수", "김철수", "강수진", "최영숙" };
    String[] phone = { "011", "012", "013", "014", "015" };
    System.out.println("번호 이름 전화  나이");
    for (i = 0; i < age.length; i++)
      System.out.printf("%d번 %s %s   %d\n", i + 1, name[i], phone[i], age[i]);
  */
    Scanner sc = new Scanner(System.in);
    System.out.print("몇 개의 점수를 입력 하겠습니까 : ");
    int[] jumA = new int[sc.nextInt()];
    int sum = 0, avg = 0;
    for(i = 0; i < jumA.length; i++) {
      System.out.print("점수 입력 : ");
      jumA[i] = sc.nextInt();
    }
    for(i = 0; i < jumA.length; i++) 
      sum += jumA[i];
    avg = sum / jumA.length;
    System.out.println("------------------------");
    for(i = 0; i < jumA.length; i++) 
      System.out.printf("%d번째 점수는 : %d\n", i + 1, jumA[i]);
    System.out.println("총합 : " + sum);
    System.out.println("평균 : " + avg);
  }
}