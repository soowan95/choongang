class Child extends CarExtends {
  public void light() {
    System.out.println("내가 조명을 달았어요");
  }
}

public class CarExtends {
  String name;
  int speed, price;
  public void setOption(int speed, int price) {
    this.speed = speed;
    this.price = price;
  }
  public void total() {
    System.out.println("자동차 속도 : " + speed + " 가격 : " + this.price);
  }
  public void pandan() {
    System.out.println("자동차를 잘 샀다.");
  }
  public static void main(String[] args) {
    Child child = new Child();
    child.setOption(100, 20000);
    child.total();
    
  }
}
