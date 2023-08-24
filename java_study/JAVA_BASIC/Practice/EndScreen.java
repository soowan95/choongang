import java.util.Scanner;

public class EndScreen{
  boolean con = true;
  Scanner sc = new Scanner(System.in);
  void endMode() {
    System.out.print("종료하시겠습니까? (y/n) ");
    String yn = sc.nextLine();
    if(yn.equalsIgnoreCase("y")) {
      con = false;
    }
  }
}
