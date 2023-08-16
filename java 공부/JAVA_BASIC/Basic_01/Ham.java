public class Ham {
  public static void main(String[] args) {
    String sang, gu;
    int price, su, kum;
    sang = "햄버거";
    gu = "Big Size";
    price = 5000;
    su = 3;
    kum = price * su;
    System.out.println("상품명 : " + sang);
    System.out.println("규  격 : " + gu);
    System.out.println("가  격 : " + price + "원");
    System.out.println("수  량 : " + su + "개");
    System.out.println("금  액 : " + kum + "원");
  }
}