public class Test02 {
  public static void main(String[] args) {
    int money = 65430;
    int mok, rest, man = 10000, chun = 1000, bak = 100, sip = 10;
    System.out.printf("돈 : %,d원\n", money);
    mok = money / man;
    rest = money % man;
    System.out.println("만원 : " + mok);
    mok = rest / chun;
    rest = rest % chun;
    System.out.println("천원 : " + mok);
    mok = rest / bak;
    rest = rest % bak;
    System.out.println("백원 : " + mok);
    mok = rest / sip;
    rest = rest % sip;
    System.out.println("십원 : " + mok);
  }
}
