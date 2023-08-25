package rpgGameDemo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CharacterStatus extends CharacterMain {
  Scanner sc = new Scanner(System.in);
  void showStatus() {
    makeLine();
    System.out.println("레벨 : " + charLv);
    System.out.println("직업 : " + job);
    hpBar(hp);
    System.out.println("현재 체력 : " + hp);
    System.out.println("공격력 : " + str);
    System.out.println("포션 : " + potion + "개");
    System.out.println("경험치 : " + exp + "/" + (int)(charLv * 10.5));
    System.out.println("처치한 보스 : " + bossKill);
    System.out.print("나가려면 아무키나 입력하세요..."); String str = sc.nextLine();
  }
  void getJob() {
    if(charLv == 10 && exp == 0) {
      makeLine();
      System.out.println("계속 진행하려면 아무키나 입력하세요..."); sc.nextLine();
      System.out.println("충분한 경험을 쌓으셨습니다.");
      int no = 0;
      while(no == 0) {
        System.out.println("어떤 직업으로 전직하시겠습니까?");
        System.out.println("1. 전사");
        System.out.println("2. 궁수");
        System.out.println("3. 법사");
        System.out.print("선택 : "); 
        try{no = sc.nextInt();}
        catch(InputMismatchException e) {
          sc.nextLine();
          makeLine();
          System.out.println("숫자를 입력하세요!!!!!!!!!!!!!!!!!!!!!!!!");
          makeLine();
        }
        if(no > 3)
          no = 0;
      }
      sc.nextLine();
      if     (no == 1) {job = "전사";}
      else if(no == 2) {job = "궁수";}
      else if(no == 3) {job = "법사";}
    }
  }
}
