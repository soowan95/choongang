package backjoon;

import java.util.Arrays;

public class Solution13460 {
  static private int[] redBall;
  static private int[] blueBall;
  static private String[] mazeW;

  public int solution13460(int N, int M, String[] mazeW) {
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

    leftB(mazeW, blueBall);
//    rightB(mazeW, blueBall);

    upR(mazeW, redBall);
    Arrays.stream(mazeW).forEach(System.out::println);
    System.out.println("빨간공 위치");
    Arrays.stream(redBall).forEach(System.out::println);
    System.out.println("파란공 위치");
    Arrays.stream(blueBall).forEach(System.out::println);

    return 0;
  }

  public void upR(String[] mazeW, int[] locate) {
    mazeW = turn(mazeW);
    locate[0] = mazeW[locate[1]].indexOf(".");
    mazeW[locate[1]] = mazeW[locate[1]].replace("R", ".");
    mazeW[locate[1]] = mazeW[locate[1]].replaceFirst("\\.", "R");
    redBall = locate;
    mazeW = turn(mazeW);
    this.mazeW = mazeW;
  }

  public void downR(String[] mazeW, int[] locate) {
    String[] mazeL = turn(mazeW);
    String rev = revStr(mazeL[locate[1]]);
    locate[0] = rev.length() - rev.indexOf(".") - 1;
    rev = rev.replace("R", ".");
    rev = rev.replaceFirst("\\.", "R");
    redBall = locate;
    mazeL[locate[1]] = revStr(rev);
    this.mazeW = turn(mazeL);
  }

  public void upB(String[] mazeW, int[] locate) {
    String[] mazeL = turn(mazeW);
    locate[0] = mazeL[locate[1]].indexOf(".");
    mazeL[locate[1]] = mazeL[locate[1]].replace("B", ".");
    mazeL[locate[1]] = mazeL[locate[1]].replaceFirst("\\.", "B");
    blueBall = locate;
    this.mazeW = turn(mazeL);
  }

  public void leftR(String[] mazeW, int[] locate) {
    locate[1] = mazeW[locate[0]].indexOf(".");
    mazeW[locate[0]] = mazeW[locate[0]].replace("R", ".");
    mazeW[locate[0]] = mazeW[locate[0]].replaceFirst("\\.", "R");
    redBall = locate;
    this.mazeW = mazeW;
  }

  public void leftB(String[] mazeW, int[] locate) {
    locate[1] = mazeW[locate[0]].indexOf(".");
    mazeW[locate[0]] = mazeW[locate[0]].replace("B", ".");
    mazeW[locate[0]] = mazeW[locate[0]].replaceFirst("\\.", "B");
    blueBall = locate;
    this.mazeW = mazeW;
  }

  public void rightR(String[] mazeW, int[] locate) {
    String rev = revStr(mazeW[locate[0]]);
    locate[1] = rev.length() - rev.indexOf(".") - 1;
    rev = rev.replace("R", ".");
    rev = rev.replaceFirst("\\.", "R");
    redBall = locate;
    mazeW[locate[0]] = revStr(rev);
    this.mazeW = mazeW;
  }

  public void rightB(String[] mazeW, int[] locate) {
    String rev = revStr(mazeW[locate[0]]);
    locate[1] = rev.length() - rev.indexOf(".") - 1;
    rev = rev.replace("B", ".");
    rev = rev.replaceFirst("\\.", "B");
    blueBall = locate;
    mazeW[locate[0]] = revStr(rev);
    this.mazeW = mazeW;
  }

  public static void setMazeW(String[] mazeW) {
    Solution13460.mazeW = mazeW;
  }

  public static void setRedBall(int[] redBall) {
    Solution13460.redBall = redBall;
  }

  public static void setBlueBall(int[] blueBall) {
    Solution13460.blueBall = blueBall;
  }

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
