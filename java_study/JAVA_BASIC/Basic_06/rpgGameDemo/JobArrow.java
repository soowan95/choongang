package rpgGameDemo;

public class JobArrow extends CharacterMain{
  void showSkill() {
    makeLine();
    System.out.println("1. 체력회복");
    System.out.println("2. 더블공격");
    System.out.print("선택 : ");
    
  }
  void skill1() {
    hpBar(hp);
    hp = (int)(charLv * 1.2) + 9;
    System.out.println("체력이 회복됐습니다.");
  }
  int skill2(int monsterHp) {
    makeLine();
    monsterHp -= (int)(str * 0.7);
    System.out.println("1st Hit! 몬스터 hp : " + monsterHp);
    hpBar(monsterHp);
    monsterHp -= (int)(str * 0.7);
    System.out.println("2nd Hit1 몬스터 hp : " + monsterHp);
    hpBar(monsterHp);
    return monsterHp;
  }
}
