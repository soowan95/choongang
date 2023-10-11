package backjoon;

import java.util.Arrays;

public class Solution13460 {
  static private int[] redBall;
  static private int[] blueBall;
  static private int[] exitLoca;
  static private String[] global_mazeW;
  static private boolean keep;
  static private int count;

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

    up();
    down();
//    downR(global_mazeW, redBall);
//    downB(global_mazeW, blueBall);

    System.out.println("count = " + count);
    Arrays.stream(global_mazeW).forEach(System.out::println);
    System.out.println("빨간공 위치");
    Arrays.stream(redBall).forEach(System.out::println);
    System.out.println("파란공 위치");
    Arrays.stream(blueBall).forEach(System.out::println);
    System.out.println(keep);
    Arrays.stream(exitLoca).forEach(System.out::println);

    return 0;
  }

  public void up() {
    if (redBall[0] < blueBall[0] && redBall[1] == blueBall[1]) {
      upR(global_mazeW, redBall);
      upB(global_mazeW, blueBall);
    } else if (redBall[0] > blueBall[0] && redBall[1] == blueBall[1]) {
      upB(global_mazeW, blueBall);
      upR(global_mazeW, redBall);
    } else {
      upR(global_mazeW, redBall);
      upB(global_mazeW, blueBall);
    }
  }

  public void down() {
    if (redBall[0] < blueBall[0] && redBall[1] == blueBall[1]) {
      downB(global_mazeW, blueBall);
      downR(global_mazeW, redBall);
    } else if (redBall[0] > blueBall[0] && redBall[1] == blueBall[1]) {
      downR(global_mazeW, redBall);
      downB(global_mazeW, blueBall);
    } else {
      downB(global_mazeW, blueBall);
      downR(global_mazeW, redBall);
    }
  }

  public void left() {
    if (redBall[1] < blueBall[1]) {
      leftR(global_mazeW, redBall);
      leftB(global_mazeW, blueBall);
    } else {
      leftB(global_mazeW, blueBall);
      leftR(global_mazeW, redBall);
    }
  }

  public void right() {
    if (redBall[1] > blueBall[1]) {
      rightR(global_mazeW, redBall);
      rightB(global_mazeW, blueBall);
    } else {
      rightB(global_mazeW, blueBall);
      rightR(global_mazeW, redBall);
    }
  }

  public void upR(String[] mazeW, int[] locate) {
    mazeW = turn(mazeW);
    int repla = mazeW[locate[1]].length() - mazeW[locate[1]].replaceAll("#\\.+[#BO]+", "").length();
    String repStr = "";
    if (repla == 0) repla = mazeW[locate[1]].indexOf(".");
    for (int i = 0; i < repla; i++) {
      repStr += "#";
    }
    if (mazeW[locate[1]].replaceAll("#\\.+[#BO]+", repStr).contains(".") && mazeW[locate[1]].charAt(mazeW[locate[1]].indexOf("R")-1) == '.') {
      locate[0] = mazeW[locate[1]].replaceAll("#\\.+[#BO]+", repStr).indexOf(".");
      mazeW[locate[1]] = mazeW[locate[1]].replace("R", ".");
      mazeW[locate[1]] = mazeW[locate[1]].substring(0, repla) + "R" + mazeW[locate[1]].substring(repla+1);
    }
    redBall = locate;
    global_mazeW = turn(mazeW);

    if (redBall[0] - 1 == exitLoca[0] && redBall[1] == exitLoca[1]) keep = false;
    if (count != -1) count++;
  }

  public void downR(String[] mazeW, int[] locate) {
    String[] mazeL = turn(mazeW);
    String rev = revStr(mazeL[locate[1]]);
    int repla = rev.length() - rev.replaceAll("#\\.+[#BO]+", "").length();
    if (repla == 0) repla = rev.indexOf(".");
    String repStr = "";
    for (int i = 0; i < repla; i++) {
      repStr += "#";
    }
    if (rev.replaceAll("#\\.+[#BO]+", repStr).contains(".") && rev.charAt(rev.indexOf("R")-1) == '.') {
      locate[0] = rev.length() - rev.replaceAll("#\\.+[#BO]+", repStr).indexOf(".") -1;
      rev = rev.replace("R", ".");
      rev = rev.substring(0, repla) + "R" + rev.substring(repla+1);
    }
    redBall = locate;
    mazeL[locate[1]] = revStr(rev);
    global_mazeW = turn(mazeL);

    if (redBall[0] + 1 == exitLoca[0] && redBall[1] == exitLoca[1]) keep = false;
    if (count != -1) count++;
  }

  public void leftR(String[] mazeW, int[] locate) {
    int repla = mazeW[locate[0]].length() - mazeW[locate[0]].replaceAll("#\\.+[#BO]+", "").length();
    if (repla == 0) repla = mazeW[locate[0]].indexOf(".");
    String repStr = "";
    for (int i = 0; i < repla; i++) {
      repStr += "#";
    }
    if (mazeW[locate[0]].replaceAll("#\\.+[#BO]+", repStr).contains(".") && mazeW[locate[0]].charAt(mazeW[locate[0]].indexOf("R")-1) == '.') {
      locate[1] = mazeW[locate[0]].replaceAll("#\\.+[#BO]+", repStr).indexOf(".");
      mazeW[locate[0]] = mazeW[locate[0]].replace("R", ".");
      mazeW[locate[0]] = mazeW[locate[0]].substring(0, repla) + "R" + mazeW[locate[0]].substring(repla+1);
    }
    redBall = locate;
    global_mazeW = mazeW;

    if (redBall[1] - 1 == exitLoca[1] && redBall[0] == exitLoca[0]) keep = false;
    if (count != -1) count++;
  }

  public void rightR(String[] mazeW, int[] locate) {
    String rev = revStr(mazeW[locate[0]]);
    int repla = rev.length() - rev.replaceAll("#\\.+[#BO]+", "").length();
    if (repla == 0) repla = rev.indexOf(".");
    String repStr = "";
    for (int i = 0; i < repla; i++) {
      repStr += "#";
    }
    if(rev.replaceAll("#\\.+[#BO]+", repStr).contains(".") && rev.charAt(rev.indexOf("R")-1) == '.') {
      locate[1] = rev.length() - rev.replaceAll("#\\.+[#BO]+", repStr).indexOf(".") -1;
      rev = rev.replace("R", ".");
      rev = rev.substring(0, repla) + "R" + rev.substring(repla+1);
    }
    redBall = locate;
    mazeW[locate[0]] = revStr(rev);
    global_mazeW = mazeW;

    if (redBall[1] + 1 == exitLoca[1] && redBall[0] == exitLoca[0]) keep = false;
    if (count != -1) count++;
  }

  public void upB(String[] mazeW, int[] locate) {
    mazeW = turn(mazeW);
    int repla = mazeW[locate[1]].length() - mazeW[locate[1]].replaceAll("#\\.+[#RO]+", "").length();
    String repStr = "";
    if (repla == 0) repla = mazeW[locate[1]].indexOf(".");
    for (int i = 0; i < repla; i++) {
      repStr += "#";
    }
    if (mazeW[locate[1]].replaceAll("#\\.+[#RO]+", repStr).contains(".") && mazeW[locate[1]].charAt(mazeW[locate[1]].indexOf("B")-1) == '.') {
      locate[0] = mazeW[locate[1]].replaceAll("#\\.+[#RO]+", repStr).indexOf(".");
      mazeW[locate[1]] = mazeW[locate[1]].replace("B", ".");
      mazeW[locate[1]] = mazeW[locate[1]].substring(0, repla) + "B" + mazeW[locate[1]].substring(repla+1);
    }
    redBall = locate;
    global_mazeW = turn(mazeW);

    if (redBall[0] - 1 == exitLoca[0] && redBall[1] == exitLoca[1]) {
      keep = false;
      count = -1;
    }
  }

  public void downB(String[] mazeW, int[] locate) {
    String[] mazeL = turn(mazeW);
    String rev = revStr(mazeL[locate[1]]);
    int repla = rev.length() - rev.replaceAll("#\\.+[#RO]+", "").length();
    if (repla == 0) repla = rev.indexOf(".");
    String repStr = "";
    for (int i = 0; i < repla; i++) {
      repStr += "#";
    }
    if (rev.replaceAll("#\\.+[#RO]+", repStr).contains(".") && rev.charAt(rev.indexOf("B")-1) == '.') {
      locate[0] = rev.length() - rev.replaceAll("#\\.+[#RO]+", repStr).indexOf(".") -1;
      rev = rev.replace("B", ".");
      rev = rev.substring(0, repla) + "B" + rev.substring(repla+1);
    }
    redBall = locate;
    mazeL[locate[1]] = revStr(rev);
    global_mazeW = turn(mazeL);

    if (redBall[0] + 1 == exitLoca[0] && redBall[1] == exitLoca[1]) {
      keep = false;
      count = -1;
    }
  }

  public void leftB(String[] mazeW, int[] locate) {
    int repla = mazeW[locate[0]].length() - mazeW[locate[0]].replaceAll("#\\.+[#RO]+", "").length();
    if (repla == 0) repla = mazeW[locate[0]].indexOf(".");
    String repStr = "";
    for (int i = 0; i < repla; i++) {
      repStr += "#";
    }
    if (mazeW[locate[0]].replaceAll("#\\.+[#RO]+", repStr).contains(".") && mazeW[locate[0]].charAt(mazeW[locate[0]].indexOf("B")-1) == '.') {
      locate[1] = mazeW[locate[0]].replaceAll("#\\.+[#RO]+", repStr).indexOf(".");
      mazeW[locate[0]] = mazeW[locate[0]].replace("B", ".");
      mazeW[locate[0]] = mazeW[locate[0]].substring(0, repla) + "B" + mazeW[locate[0]].substring(repla+1);
    }
    redBall = locate;
    global_mazeW = mazeW;

    if (redBall[1] - 1 == exitLoca[1] && redBall[0] == exitLoca[0]) {
      keep = false;
      count = -1;
    }
  }

  public void rightB(String[] mazeW, int[] locate) {
    String rev = revStr(mazeW[locate[0]]);
    int repla = rev.length() - rev.replaceAll("#\\.+[#RO]+", "").length();
    if (repla == 0) repla = rev.indexOf(".");
    String repStr = "";
    for (int i = 0; i < repla; i++) {
      repStr += "#";
    }
    if(rev.replaceAll("#\\.+[#RO]+", repStr).contains(".") && rev.charAt(rev.indexOf("B")-1) == '.') {
      locate[1] = rev.length() - rev.replaceAll("#\\.+[#RO]+", repStr).indexOf(".") -1;
      rev = rev.replace("B", ".");
      rev = rev.substring(0, repla) + "B" + rev.substring(repla+1);
    }
    redBall = locate;
    mazeW[locate[0]] = revStr(rev);
    global_mazeW = mazeW;

    if (redBall[1] + 1 == exitLoca[1] && redBall[0] == exitLoca[0]) {
      keep = false;
      count = -1;
    }
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
    String[] turn = new String[mazeW[0].length()];

    for(int i = 0; i < mazeW[0].length(); i++) {
      final int j = i;
      turn[i] = Arrays.stream(mazeW).map(a -> String.valueOf(a.charAt(j))).reduce("", String::concat);
    }

    return turn;
  }
}
