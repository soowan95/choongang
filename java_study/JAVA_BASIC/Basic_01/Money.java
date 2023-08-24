public class Money {
  public static void main(String[] args) {
    int money = 32345;
    int man, chun, bak, si, w, nam;
    man = money / 10000;
    nam = money - (man * 10000);
    System.out.println("만원 : " + man + "장" + " (나머지 " + nam + ")");
    chun = nam / 1000;
    nam = nam - (chun * 1000);
    System.out.printf("천원 : %d장 (나머지 %d)\n", chun, nam);
    bak = nam / 100;
    nam = nam - (bak * 100);
    System.out.printf("백원 : %d개 (나머지 %d)\n", bak, nam);
    si = nam / 10;
    nam = nam - (si * 10);
    System.out.printf("십원 : %d개 (나머지 %d)\n", si, nam);
    w = nam;
    System.out.printf("일원 : %d개 \n", w);
  }
}