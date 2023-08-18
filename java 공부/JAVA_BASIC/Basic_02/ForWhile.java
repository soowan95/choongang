import java.util.Scanner;

public class ForWhile {
  public static void main(String[] args) {
    /*
    for(int i = 1; i <= 5; i++) {
      System.out.printf("\n [%d번] 입니다.", i);
    }
    */
    /*
    int sum = 0, even = 0, odd = 0;
    for(int i = 1; i <= 100; i++) {
      sum += i;
      if(i%2 == 0) {
        even += i;
      } else {
        odd += i;
      }
    }
    System.out.println("1~100합 : " + sum);
    System.out.println("1~100 짝수 합 : " + even);
    System.out.println("1~100 홀수 합 : " + odd);
    */
    /*
    for(int i = 1; i < 10; i++) {
      for(int j = 2; j < 10; j++) {
        if(j != 9)
          System.out.printf("%d * %d = %2d, ", j, i, i * j);
        else
          System.out.printf("%d * %d = %2d\n", j, i, i * j);
      }
    }
    */
    /*
    int count = 0;
    while(count < 5) {
      count++;
      System.out.printf("\n아직도 작네... %d", count);
    }
    */
    /*
    int count = 0;
    while(count < 500) {
      if(count > 5) {
        break;
      } else {
        count++;
      }
      System.out.printf("\n아직도 작네... %d", count);
    }
    */
    /* 
    int count = 0;
    while(true) {
      if(count > 4) {
        break;
      } 
      count++;
      System.out.printf("\n아직도 작네... %d", count);
    }
    */
    Scanner sc = new Scanner(System.in);
    String yn = "y";
    while(yn.equalsIgnoreCase("y")) {
      System.out.print("아무키나 입력하면 프로그램 시작 : "); yn = sc.next();
      while(true) {
        System.out.print("또 할거냐? (Y/N)"); String input = sc.next();
        if(input.equalsIgnoreCase("y")) {
          yn = input;
          break;
        } else if(input.equalsIgnoreCase("n")) {
          System.out.println("-----------종료------------");
          yn = input;
          break;
        } else {
          System.out.println("잘 못 누름.");
        }
      }
    }
  }
}