package rpgGameDemo;

public class Monster{
  int monHp  = 0;
  int monStr = 0;
  int monLv  = 0;
  int monExp = 0;
  void status() {
    if((monLv % 10) != 0) { 
      monHp  = monLv * 2;
      monStr = monLv;
      monExp = (int)(monLv * 1.13);
    } else {
      monHp  = monLv * 2;
      monStr = (int)(monLv * 1.2);
      monExp = (int)(monLv * 1.5);
    }
  }
  void creat() {monLv = 0;}

  void appear() {System.out.printf("몬스터 체력 : %d / 공격력 : %d\n", monHp, monStr);}
}

class Lv01     extends Monster { void creat() {monLv =  1;} }
class Lv02     extends Monster { void creat() {monLv =  2;} }
class Lv03     extends Monster { void creat() {monLv =  3;} }
class Lv05     extends Monster { void creat() {monLv =  5;} }
class Lv07     extends Monster { void creat() {monLv =  7;} }
class Lv09     extends Monster { void creat() {monLv =  9;} }
class Lv10Boss extends Monster { void creat() {monLv = 10;} }
class Lv11     extends Monster { void creat() {monLv = 11;} }
class Lv13     extends Monster { void creat() {monLv = 13;} }
class Lv15     extends Monster { void creat() {monLv = 15;} }