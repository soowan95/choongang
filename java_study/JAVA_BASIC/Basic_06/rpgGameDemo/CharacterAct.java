package rpgGameDemo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CharacterAct extends CharacterMain {
  Scanner sc = new Scanner(System.in);
  Monster monster = new Lv01();
  CharacterStatus characterStatus = new CharacterStatus();
  int no = 0;
  boolean victory = true;
  // ---------------------------------걷기 시작--------------------------------
  void walk() {
    while(true) {
      if(bossKill == 0) {
        no = (int)(Math.random() * 10) + 1;
        if     (no ==  1)  monster = new Lv01();
        else if(no ==  2)  monster = new Lv02();
        else if(no ==  3)  monster = new Lv03();
        else if(no ==  5)  monster = new Lv05();
        else if(no ==  7)  monster = new Lv07();
        else if(no ==  9)  monster = new Lv09();
        else if(no == 10)  monster = new Lv10Boss();

        if     (no ==  1) {meetMonster(no); levelUp(); break;} 
        else if(no ==  2) {meetMonster(no); levelUp(); break;}
        else if(no ==  3) {meetMonster(no); levelUp(); break;} 
        else if(no ==  5) {meetMonster(no); levelUp(); break;} 
        else if(no ==  7) {meetMonster(no); levelUp(); break;} 
        else if(no ==  9) {meetMonster(no); levelUp(); break;} 
        else if(no == 10) {meetMonster(no); levelUp(); break;} 
        else              {nothing(); levelUp(); break;}
      } else if(bossKill == 1) {
        no = (int)(Math.random() * 5) + 11;
        if     (no ==  11)  monster = new Lv11();
        else if(no ==  13)  monster = new Lv13();
        else if(no ==  15)  monster = new Lv15();

        if     (no ==  11) {meetMonster(no); levelUp(); break;} 
        else if(no ==  13) {meetMonster(no); levelUp(); break;}
        else if(no ==  15) {meetMonster(no); levelUp(); break;} 
      }
    }
  }
  // ---------------------------------걷기 끝--------------------------------
  // ---------------------------------휴식 시작--------------------------------
  void rest() {
    hp = (int)(charLv * 1.2) + 9;
    makeLine();
    hpBar(hp);
    System.out.println("체력이 모두 회복됐습니다.");
  }
  // ---------------------------------휴식 끝--------------------------------
  // ---------------------------------몬스터 만나기 시작--------------------------------
  void meetMonster(int no) {
    String yn = "y";
    if((no % 10) == 0) {
      victory = true;
      monster.creat();
      monster.status();
      System.out.println("보스가 나타났습니다. Lv : " + monster.monLv + " (체력 : " + monster.monHp + "/ 공격력 : " + monster.monStr + ")");
      System.out.print("전투를 시작하시겠습니까? (y/n) "); yn = sc.nextLine();
    } else {
      victory = true;
      monster.creat();
      monster.status();
      System.out.println("몬스터를 만났습니다. Lv : " + monster.monLv + " (체력 : " + monster.monHp + "/ 공격력 : " + monster.monStr + ")");
      System.out.print("전투를 시작하시겠습니까? (y/n) "); yn = sc.nextLine();
    }
    if(yn.equalsIgnoreCase("y")) {
      makeLine();
      monster.appear();
      makeLine();
      while(victory == true) {
        int act = 0;
        while(act == 0) {
          makeLine();
          System.out.println("1. 공격");
          System.out.println("2. 도망");
          System.out.println("3. 상태확인");
          System.out.print("어떤 행동을 하시겠습니까 : ");
          try {act = sc.nextInt();} 
          catch(InputMismatchException e) {
            sc.nextLine();
            makeLine();
            System.out.println("숫자를 입력하세요!!!!!!!!!!!!!!!!!!!!!!!!");
          }
        }
        sc.nextLine();
        if(act == 1) {
          attack();
        } else if(act == 2){
          makeLine();
          System.out.println("도망갔습니다.");
          victory = false;
        } else {
          characterStatus.showStatus();
          makeLine();
          monster.appear();
        }
      }
    }
  }
  // ---------------------------------몬스터 만나기 끝-------------------------------
  // ---------------------------------공격 시작--------------------------------
  void attack() {
    monster.monHp -= str;
    hp -= monster.monStr;
    makeLine();
    hpBar(monster.monHp);
    System.out.printf("몬스터 hp : %d\n", monster.monHp);
    hpBar(hp);
    System.out.printf("현재 hp : %d\n", hp);
    makeLine();
    if(monster.monHp <= 0 && hp >= 0) {
      if((no % 10) == 0) {
        System.out.println("승리했습니다.");
        exp += (monster.monExp + charLv - 1);
        System.out.println("경험치 : " + exp + "/" + (int)(charLv * 10.5));
        bossKill = no / 10;
        victory = false;
      } else {
        System.out.println("승리했습니다.");
        exp += (monster.monExp + charLv - 1);
        System.out.println("경험치 : " + exp + "/" + (int)(charLv * 10.5));
        victory = false;
      }
    } else if(hp < 0) {
      System.out.println("패배했습니다.\n\n");
      System.out.println("|||||||||||Game Over||||||||||");
      victory = false;
    }
  }
  void nothing() {
    makeLine();
    System.out.println("아무일도 없었습니다.");
    exp += (int)(charLv * 1.4);
    System.out.println("경험치가 1 증가했습니다.");
    makeLine();
    System.out.println("현재 경험치 : " + exp);
  }
}
// ---------------------------------공격 끝--------------------------------
