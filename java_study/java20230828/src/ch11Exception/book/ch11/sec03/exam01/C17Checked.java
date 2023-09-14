package ch11Exception.book.ch11.sec03.exam01;

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
