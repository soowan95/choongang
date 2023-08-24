public class InterClass {
  static void sori(String name) {
    System.out.printf("%s의 특징\n", name);
  }

  static class Cat {
    static String so = "야옹";

    static void catMethod(String name) {
      System.out.printf("전달 받은 %s소리 : %s\n", name, so);
    }
  }

  static class Dog {
    static String so = "멍멍";

    static void dogMethod(String name) {
      System.out.printf("전달 받은 %s소리 : %s\n", name, so);
    }
  }

  public static void main(String[] args) {
    sori("고양이");
    Cat.catMethod("고양이");
    sori("강아지");
    Dog.dogMethod("강아지");
  }
}
