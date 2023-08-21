public class Method07 {
  static void sori(String sound) {

  }

  static class Cat {
    static String so = "야옹";

    static void catMethod(String name) {
      System.out.printf("%s의 울음소리는 %s\n", name, so);
    }
  }

  static class Tiger {
    static String so = "어흥";

    static void tigerMethod(String name) {
      System.out.printf("%s의 울음소리는 %s\n", name, so);
    }
  }

  public static void main(String[] args) {
    Cat.so = "미야오";
    Cat.catMethod("고양이");
    Tiger.tigerMethod("호랑이");
  }
}
