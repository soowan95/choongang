package ch14Thread.lecture;

public class C01Sleep {
  public static void main(String[] args) throws InterruptedException {
    System.out.println("code1");
    Thread.sleep(1000);
    System.out.println("code2");
    Thread.sleep(1000);
    System.out.println("code3");
  }
}
