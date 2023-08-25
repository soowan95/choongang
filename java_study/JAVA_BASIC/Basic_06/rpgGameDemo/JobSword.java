package rpgGameDemo;

public class JobSword extends CharacterMain {
  void showSkill() {
    makeLine();
    System.out.println("1. 체력회복");
    System.out.println("2. 강타");
    System.out.print("선택 : ");
    
  }
  void skill1() {
    makeLine();
    hpBar(hp);
    hp = (int)(charLv * 1.2) + 9;
    System.out.println("체력이 회복됐습니다.");
  }
  int skill2(int monsterHp) {
    makeLine();
    monsterHp -= 10;
    System.out.println("몬스터 hp : " + monsterHp);
    hpBar(monsterHp);
    return monsterHp;
  }
}
