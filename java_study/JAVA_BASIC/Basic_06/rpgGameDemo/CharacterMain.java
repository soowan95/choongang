package rpgGameDemo;

public class CharacterMain {
  static int charLv = 1;
  static int hp = 10;
  static int str = 1;
  static int exp = 0;
  static int bossKill = 0;
  static int potion = 0;
  static String job = "없음";
  void hpBar(int hp) {
    String bar = "";
    for(int i = 0; i < hp; i++) {
      bar += "[]";
    }
    System.out.println(bar);
  }
  void makeLine() {
    System.out.println("=============================================");
  }
  void levelUp() {
    if(exp >= (int)(charLv * 10.5)) {
      makeLine();
      System.out.println("레벨이 1 증가했습니다.");
      charLv += 1;
      System.out.println("현재 레벨 : " + charLv);
      hp = (int)(charLv * 1.2) + 9;
      str = (int)(charLv * 1.3);
      exp = 0;
    }
  }
  void showSkill() {}
  void skill1() {}
  int skill2(int monsterHp) {return monsterHp;}
}
