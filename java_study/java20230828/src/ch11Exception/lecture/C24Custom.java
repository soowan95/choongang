package ch11Exception.lecture;

public class C24Custom {
  public static void main(String[] args) {
    int money = 300;
    if (money < 10000) {
      throw new LackOfMoneyException("돈이 부족해");
    }
  }
}
