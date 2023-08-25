package rpgGameDemo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CharacterAct extends CharacterMain {
  Scanner sc = new Scanner(System.in);
  Monster monster = new Lv01();
  CharacterStatus characterStatus = new CharacterStatus();
  CharacterMain sword = new JobSword();
  CharacterMain arrow = new JobArrow();
  CharacterMain magic = new JobMagic();
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

        if     (no ==  1) {meetMonster(no); levelUp(); characterStatus.getJob(); break;} 
        else if(no ==  2) {meetMonster(no); levelUp(); characterStatus.getJob(); break;}
        else if(no ==  3) {meetMonster(no); levelUp(); characterStatus.getJob(); break;} 
        else if(no ==  5) {meetMonster(no); levelUp(); characterStatus.getJob(); break;} 
        else if(no ==  7) {meetMonster(no); levelUp(); characterStatus.getJob(); break;} 
        else if(no ==  9) {meetMonster(no); levelUp(); characterStatus.getJob(); break;} 
        else if(no == 10) {meetMonster(no); levelUp(); characterStatus.getJob(); break;} 
        else              {nothing();       levelUp(); characterStatus.getJob(); break;}
      } else if(bossKill == 1) {
        no = (int)(Math.random() * 10) + 11;
        if     (no ==  11)  monster = new Lv11();
        else if(no ==  13)  monster = new Lv13();
        else if(no ==  15)  monster = new Lv15();
        else if(no ==  18)  monster = new Lv18();
        else if(no ==  20)  monster = new Lv20Boss();

        if     (no ==  11) {meetMonster(no); levelUp(); characterStatus.getJob(); break;} 
        else if(no ==  13) {meetMonster(no); levelUp(); characterStatus.getJob(); break;}
        else if(no ==  15) {meetMonster(no); levelUp(); characterStatus.getJob(); break;} 
        else if(no ==  18) {meetMonster(no); levelUp(); characterStatus.getJob(); break;} 
        else if(no ==  20) {meetMonster(no); levelUp(); characterStatus.getJob(); break;} 
        else               {nothing();       levelUp(); characterStatus.getJob(); break;}
      } else if(bossKill ==2 ) {
        no = (int)(Math.random() * 10) + 21;
        if     (no ==  21)  monster = new Lv21();
        else if(no ==  23)  monster = new Lv23();
        else if(no ==  25)  monster = new Lv25();
        else if(no ==  27)  monster = new Lv27();
        else if(no ==  29)  monster = new Lv29();
        else if(no ==  30)  monster = new Lv30Boss();

        if     (no ==  21) {meetMonster(no); levelUp(); characterStatus.getJob(); break;} 
        else if(no ==  23) {meetMonster(no); levelUp(); characterStatus.getJob(); break;}
        else if(no ==  25) {meetMonster(no); levelUp(); characterStatus.getJob(); break;} 
        else if(no ==  27) {meetMonster(no); levelUp(); characterStatus.getJob(); break;} 
        else if(no ==  29) {meetMonster(no); levelUp(); characterStatus.getJob(); break;} 
        else if(no ==  30) {meetMonster(no); levelUp(); characterStatus.getJob(); break;} 
        else               {nothing();       levelUp(); characterStatus.getJob(); break;}
      }
    }
  }
  // ---------------------------------걷기 끝--------------------------------
  // ---------------------------------포션 먹기 시작--------------------------------
  void potionDrink() {
    if(potion > 0) {
      String yn = "y";
      makeLine();
      hpBar(hp);
      System.out.println("현재 포션 : " + potion + "개");
      System.out.print("포션을 드시겠습니까? (y/n) "); yn = sc.nextLine();
        if(yn.equalsIgnoreCase("y")) {
        hp = (int)(charLv * 1.2) + 9;
        potion -= 1;
        makeLine();
        hpBar(hp);
        System.out.println("체력이 모두 회복됐습니다.");
        System.out.println("남은 포션 : " + potion + "개");
      }
    } else {
      makeLine();
      System.out.println("포션이 없습니다.");
    }
  }
  // ---------------------------------포션 먹기 끝--------------------------------
  // ---------------------------------몬스터 만나기 시작--------------------------------
  void meetMonster(int no) {
    String yn = "y";
    if((no % 10) == 0) {
      victory = true;
      monster.creat();
      monster.status();
      makeLine();
      System.out.println("!!!!!보스 등장!!!!!");
      makeLine();
      System.out.println("보스가 나타났습니다. Lv : " + monster.monLv + " (체력 : " + monster.monHp + "/ 공격력 : " + monster.monStr + ")");
      System.out.print("전투를 시작하시겠습니까? (y/n) "); yn = sc.nextLine();
    } else {
      victory = true;
      monster.creat();
      monster.status();
      makeLine();
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
          System.out.println("4. 포션먹기");
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
        } else if(act == 3) {
          characterStatus.showStatus();
          makeLine();
          monster.appear();
        } else {
          potionDrink();
          makeLine();
          monster.appear();
        }
      }
    }
  }
  // ---------------------------------몬스터 만나기 끝-------------------------------
  // ---------------------------------공격 시작--------------------------------
  void attack() {
    int skillNo = 0;
    if(charLv >= 10) {
      while(skillNo == 0) {
        makeLine();
        System.out.println("1. 공격");
        System.out.println("2. 스킬");
        System.out.print("선택 : ");
        try {skillNo = sc.nextInt();}
        catch(InputMismatchException e) {
          sc.nextLine();
          makeLine();
          System.out.println("숫자를 입력하세요!!!!!!!!!!!!!!!!!!!!!!!!");
          makeLine();
        }
      } sc.nextLine();
      if(skillNo == 1) {
        monster.monHp -= str;
        hp -= monster.monStr;
        makeLine();
        hpBar(monster.monHp);
        System.out.printf("몬스터 hp : %d\n", monster.monHp);
        hpBar(hp);
        System.out.printf("현재 hp : %d\n", hp);
        makeLine();
      } else if(skillNo == 2) {
        skillNo = 0;
        while(skillNo == 0) {
          if     (job.equals("전사")) {sword.showSkill();}
          else if(job.equals("궁수")) {arrow.showSkill();}
          else if(job.equals("법사")) {magic.showSkill();}
          try {skillNo = sc.nextInt();}
          catch(InputMismatchException e) {
            sc.nextLine();
            makeLine();
            System.out.println("숫자를 입력하세요!!!!!!!!!!!!!!!!!!!!!!!!");
            makeLine();
          }
        }
        sc.nextLine();
        if(skillNo == 1) {
          if     (job.equals("전사")) {sword.skill1();}
          else if(job.equals("궁수")) {arrow.skill1();}
          else if(job.equals("법사")) {magic.skill1();}
        } else if(skillNo == 2) {
          if     (job.equals("전사")) {monster.monHp = sword.skill2(monster.monHp);}
          else if(job.equals("궁수")) {monster.monHp = arrow.skill2(monster.monHp);}
          else if(job.equals("법사")) {monster.monHp = magic.skill2(monster.monHp);}
        }
      }
    } else if(charLv < 10) {
      monster.monHp -= str;
      hp -= monster.monStr;
      makeLine();
      hpBar(monster.monHp);
      System.out.printf("몬스터 hp : %d\n", monster.monHp);
      hpBar(hp);
      System.out.printf("현재 hp : %d\n", hp);
      makeLine();
    }
    if(monster.monHp <= 0 && hp >= 0) {
      if((no % 10) == 0) {
        potion += 1;
        System.out.println("포션을 1개 획득했습니다.");
        makeLine();
        System.out.println("승리했습니다.");
        exp += (monster.monExp + charLv - 1);
        System.out.println("경험치 : " + exp + "/" + (int)(charLv * 10.5));
        bossKill = no / 10;
        victory = false;
      } else {
        int potionDrop = (int)(Math.random() * 3);
        if(potionDrop == 0) {
          potion += 1;
          System.out.println("포션을 1개 획득했습니다.");
        }
        makeLine();
        System.out.println("승리했습니다.");
        exp += (monster.monExp + charLv - 1);
        System.out.println("경험치 : " + exp + "/" + (int)(charLv * 10.5));
        victory = false;
      }
    } else if(hp < 0) {
      System.out.println("패배했습니다.\n\n");
      victory = false;
    }
  }
  void nothing() {
    makeLine();
    System.out.println("아무일도 없었습니다.");
    exp += (int)(charLv * 1.2);
    System.out.println("경험치가 " + (int)(charLv * 1.2) + " 증가했습니다.");
    makeLine();
    System.out.println("현재 경험치 : " + exp);
  }
}
// ---------------------------------공격 끝--------------------------------
