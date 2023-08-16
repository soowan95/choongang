import java.util.Scanner;

public class Jumun {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("메뉴 선택 프로그램");
      System.out.println("1. 새우버거");
      System.out.println("2. 치즈버거");
      System.out.println("3. 치킨버거");
      System.out.println("4. 종료");
      System.out.println("주문 번호를 입력하세요 : ");
      int no = sc.nextInt();
      if(no == 1) {
        System.out.println("새우버거");
      } else if(no == 2) {
        System.out.println("치즈버거");
      } else if(no == 3) {
        System.out.println("치킨버거");
      } else {
        System.out.println("감사합니다.");
      }
    }
  }
}
