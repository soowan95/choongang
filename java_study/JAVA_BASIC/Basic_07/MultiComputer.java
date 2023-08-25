class Lang {
  String name;
  int page;
  int def;

  public void show() {
    System.out.println("------------------------------");
    System.out.println("언 어 " + name);
    System.out.println("페이지 " + page);
    System.out.println("난이도 " + def);
    System.out.println("------------------------------");
  }
}

class Java extends Lang {
  public Java() {
    name = "자바";
    page = 200;
    def = 50;
  }
}

class JavaScript extends Lang {
  public JavaScript() {
    name = "자바스크립트";
    page = 100;
    def = 10;
  }
}

public class MultiComputer {
  public static void main(String[] args) {
    Lang lang = new Java();
    lang.show();
  }
}
