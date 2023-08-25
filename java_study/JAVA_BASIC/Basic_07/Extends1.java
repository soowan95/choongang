class ParMoney {
  int pMoney;
  int pKum = 100;
  int pPrice;
  ParMoney(int ex1) {
    pMoney = ex1;
    pPrice = pMoney + pKum;
  }
}
class Chi extends ParMoney {
  int chiMoney;
  int chiKum = 50;
  Chi(int ex1, int ex2) {
    super(ex1);
    chiMoney = ex2;
    chiMoney += chiKum;
  }
}

public class Extends1 {
  public static void main(String[] args) {
    Chi my = new Chi(10, 20);
    System.out.println(my.chiMoney);
    System.out.println(my.pPrice);
  }
}
