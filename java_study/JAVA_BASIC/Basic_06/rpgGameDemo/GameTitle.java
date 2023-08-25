package rpgGameDemo;

public class GameTitle extends CharacterMain{
  void titleScreen() {
    System.out.println("***************용사의 모험****************\n");
    System.out.println("                           | ");
    System.out.println("                           | ");
    System.out.println("                           | ");
    System.out.println("                 ***      _|_");
    System.out.println("               * ^ ^ *   * | ");
    System.out.println("               *  o  *  *    ");
    System.out.println("                 ***   *     ");
    System.out.println("                  *   *      ");
    System.out.println("                ******       ");
    System.out.println("               *  *          ");
    System.out.println("              *   *          ");
    System.out.println("            /^^^^|*          ");
    System.out.println("            | 방 |*          ");
    System.out.println("            |    |*          ");
    System.out.println("            | 패 |*          ");
    System.out.println("            |____/*          ");
    System.out.println("                  *          ");
    System.out.println("                *  *         ");
    System.out.println("               *    *        ");
    System.out.println("              *     *        ");
    System.out.println("             *      *        ");
    GameDemo.makeLine();
    System.out.println("1. 새로하기");
    System.out.println("2. 이어하기");
    System.out.println("3. 종    료");
  }
  int endScreen(int no) {
    if(bossKill == 3) {
      makeLine();
      System.out.println("!!!!!!!!!!용사가 마을을 지켜냈습니다!!!!!!!!!!");
      System.out.println("                                     ");
      System.out.println("                                     ");
      System.out.println("                                     ");
      System.out.println("                 ***                 ");
      System.out.println("               * ^ ^ *               ");
      System.out.println("               *  o  *               ");
      System.out.println("                 ***                 ");
      System.out.println("                  *                  ");
      System.out.println("                ******               ");
      System.out.println("               *  *   *              ");
      System.out.println("              *   *    *             ");
      System.out.println("            /^^^^|*     *            ");
      System.out.println("            | 방 |*    _\\_          ");
      System.out.println("            |    |*      \\          ");
      System.out.println("            | 패 |*       \\         ");
      System.out.println("            |____/*        \\        ");
      System.out.println("                  *         _______  ");
      System.out.println("                *  *       / 보 스\\ ");
      System.out.println("               *    *      | x  x  | ");
      System.out.println("              *     *      |_______/ ");
      System.out.println("             *      *                ");
      no = 3;
    }
    return no;
  }
}
