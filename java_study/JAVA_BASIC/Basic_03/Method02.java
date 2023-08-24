public class Method02 {
  String handle = "우회전";
  int ball = 10;
  int rotate = 20;

  void carRun() {
    handle = "90도 회전";
    System.out.printf("1번 코너에서 %s 하세요\n", handle);
    if(ball < 10)
      System.out.printf("1번 코너에서 %d도 회전 하세요\n", rotate);
    else
      System.out.printf("1번 코너에서 %d도 회전 하세요\n", rotate+50);
  }
  public static void main(String[] args) {
    Method02 mt = new Method02();
    mt.carRun();
    mt.ball = 4;
    mt.carRun();
  }
}