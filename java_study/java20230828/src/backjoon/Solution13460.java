package backjoon;

import java.util.Arrays;

public class Solution13460 {
  static private int[] redBall;
  static private int[] blueBall;
  static private int[] exitLoca;
  static private String[] global_mazeW;
  static private boolean keep;

  public int solution13460(int N, int M, String[] mazeW) {
    setKeep(true);
    setMazeW(mazeW);

    int[] redBall = new int[2];
    for (int i = 0; i < N; i++) {
      if (mazeW[i].indexOf("R") != -1) {
        redBall[0] = i;
        redBall[1] = mazeW[i].indexOf("R");
      }
    }

    setRedBall(redBall);

    int[] blueBall = new int[2];
    for (int i = 0; i < N; i++) {
      if (mazeW[i].indexOf("B") != -1) {
        blueBall[0] = i;
        blueBall[1] = mazeW[i].indexOf("B");
      }
    }

    setBlueBall(blueBall);

    int[] exit = new int[2];
    for (int i = 0; i < N; i++) {
      if (mazeW[i].indexOf("O") != -1) {
        exit[0] = i;
        exit[1] = mazeW[i].indexOf("O");
      }
    }

    setExitLoca(exit);

    leftB(global_mazeW, blueBall);
    upR(global_mazeW, redBall);
    downR(global_mazeW, redBall);
    downB(global_mazeW, blueBall);
    rightR(global_mazeW, redBall);

    Arrays.stream(global_mazeW).forEach(System.out::println);
    System.out.println("빨간공 위치");
    Arrays.stream(redBall).forEach(System.out::println);
    System.out.println("파란공 위치");
    Arrays.stream(blueBall).forEach(System.out::println);
    System.out.println(keep);
    Arrays.stream(exitLoca).forEach(System.out::println);

    return 0;
  }

  public void upR(String[] mazeW, int[] locate) {
    mazeW = turn(mazeW);
    locate[0] = mazeW[locate[1]].indexOf(".");
    mazeW[locate[1]] = mazeW[locate[1]].replace("R", ".");
    mazeW[locate[1]] = mazeW[locate[1]].replaceFirst("\\.", "R");
    redBall = locate;
    global_mazeW = turn(mazeW);

    if (redBall[0] - 1 == exitLoca[0]) keep = false;
  }

  public void downR(String[] mazeW, int[] locate) {
    String[] mazeL = turn(mazeW);
    String rev = revStr(mazeL[locate[1]]);
    locate[0] = rev.length() - rev.indexOf(".") - 1;
    rev = rev.replace("R", ".");
    rev = rev.replaceFirst("\\.", "R");
    redBall = locate;
    mazeL[locate[1]] = revStr(rev);
    global_mazeW = turn(mazeL);

    if (redBall[0] + 1 == exitLoca[0]) keep = false;
  }

  public void leftR(String[] mazeW, int[] locate) {
    int repla = mazeW[locate[0]].length() - mazeW[locate[0]].replaceAll("#\\.+[#B]", "").length();
    String repStr = "";
    for (int i = 0; i < repla; i++) {
      repStr += "#";
    }
    locate[1] = mazeW[locate[0]].replaceAll("#\\.+[#BO]", repStr).indexOf(".");
    mazeW[locate[0]] = mazeW[locate[0]].replace("R", ".");
    mazeW[locate[0]] = mazeW[locate[0]].substring(0, repla) + "R" + mazeW[locate[0]].substring(repla);
    redBall = locate;
    global_mazeW = mazeW;

    if (redBall[1] - 1 == exitLoca[1]) keep = false;
  }

  public void rightR(String[] mazeW, int[] locate) {
    String rev = revStr(mazeW[locate[0]]);
    int repla = rev.length() - rev.replaceAll("#\\.+[#B]", "").length();
    String repStr = "";
    for (int i = 0; i < repla; i++) {
      repStr += "#";
    }
    if(rev.replaceAll("#\\.+[#BO]", repStr).contains(".")) {
      locate[1] = rev.replaceAll("#\\.+[#B]", repStr).indexOf(".");
      rev = rev.replace("R", ".");
      rev = rev.substring(0, repla) + "R" + rev.substring(repla);
    }
    redBall = locate;
    mazeW[locate[0]] = revStr(rev);
    global_mazeW = mazeW;

    if (redBall[1] + 1 == exitLoca[1]) keep = false;
  }

  public void upB(String[] mazeW, int[] locate) {
    mazeW = turn(mazeW);
    locate[0] = mazeW[locate[1]].indexOf(".");
    mazeW[locate[1]] = mazeW[locate[1]].replace("B", ".");
    mazeW[locate[1]] = mazeW[locate[1]].replaceFirst("\\.", "B");
    blueBall = locate;
    global_mazeW = turn(mazeW);
  }

  public void downB(String[] mazeW, int[] locate) {
    String[] mazeL = turn(mazeW);
    String rev = revStr(mazeL[locate[1]]);
    locate[0] = rev.length() - rev.indexOf(".") - 1;
    rev = rev.replace("B", ".");
    rev = rev.replaceFirst("\\.", "B");
    blueBall = locate;
    mazeL[locate[1]] = revStr(rev);
    global_mazeW = turn(mazeL);
  }

  public void leftB(String[] mazeW, int[] locate) {
    locate[1] = mazeW[locate[0]].indexOf(".");
    mazeW[locate[0]] = mazeW[locate[0]].replace("B", ".");
    mazeW[locate[0]] = mazeW[locate[0]].replaceFirst("\\.", "B");
    blueBall = locate;
    global_mazeW = mazeW;
  }

  public void rightB(String[] mazeW, int[] locate) {
    String rev = revStr(mazeW[locate[0]]);
    locate[1] = rev.length() - rev.indexOf(".") - 1;
    rev = rev.replace("B", ".");
    rev = rev.replaceFirst("\\.", "B");
    blueBall = locate;
    mazeW[locate[0]] = revStr(rev);
    global_mazeW = mazeW;
  }

  public static void setMazeW(String[] mazeW) {
    Solution13460.global_mazeW = mazeW;
  }

  public static void setRedBall(int[] redBall) {Solution13460.redBall = redBall;}

  public static void setBlueBall(int[] blueBall) {Solution13460.blueBall = blueBall;}

  public static void setExitLoca(int[] exit) {exitLoca = exit;}

  public static void setKeep(boolean keep) {Solution13460.keep = keep;}

  public static String revStr(String str) {
    String revStr = "";
    for (int i = str.length(); i > 0; i--) {
      revStr += String.valueOf(str.charAt(i - 1));
    }
    return revStr;
  }

  public static String[] turn(String[] mazeW) {
    String[] turn = new String[mazeW.length];

    for(int i = 0; i < mazeW[0].length(); i++) {
      final int j = i;
      turn[i] = Arrays.stream(mazeW).map(a -> String.valueOf(a.charAt(j))).reduce("", String::concat);
    }

    return turn;
  }
}
