package ch11Exception.lecture;

public class C08Finally {
  public static void main(String[] args) {
    try {
      System.out.println("코드 실행");
      return;
    } finally {
      System.out.println("무조건 실행해야 하는 코드");
    }
  }
}
