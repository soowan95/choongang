package ch11Exception.lecture;

public class C23Custom {
  public static void main(String[] args) {
    int money = 300;

    if (money < 10000) {
      throw new LackOfMoneyException();
    }
  }
}

class LackOfMoneyException extends RuntimeException {
  public LackOfMoneyException(){}
  public LackOfMoneyException(String message) {
    super(message);
  }
}