package ch11Exception.lecture;

public class C17Checked {
  public static void main(String[] args) {
    try {
      a();
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  static void a() throws Exception{
    Class.forName("java.lang.String");
  }
}
