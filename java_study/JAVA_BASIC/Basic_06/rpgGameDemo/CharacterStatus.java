package rpgGameDemo;

import java.util.Scanner;

public class CharacterStatus extends CharacterMain {
  Scanner sc = new Scanner(System.in);
  void showStatus() {
    while(true) {
      makeLine();
      System.out.println("레벨 : " + charLv);
      hpBar(hp);
      System.out.println("현재 체력 : " + hp);
      System.out.println("공격력 : " + str);
      System.out.println("경험치 : " + exp + "/" + (int)(charLv * 10.5));
      System.out.println("처치한 보스 : " + bossKill);
      System.out.print("나가려면 아무키나 입력하세요..."); String str = sc.nextLine();
      break;
    }
  }
}
