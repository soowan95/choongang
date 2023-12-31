package ch11Exception.lecture;

public class C09Catch {
  public static void main(String[] args) {

    try {
      int[] arr = {1, 0};
      int i = 3 / arr[0];

      System.out.println("try내의 흐름");

      // try block 에서
      // 여러 Exception 이 발생할 수 있으면
      // 여러 catch block 을 작성하면 됨
    } catch (ArithmeticException e) {
      System.out.println("잘못된 산술연산");
    } catch (IndexOutOfBoundsException e) {
      System.out.println("잘못된 인덱스 참조");
    }

    System.out.println("실행흐름 이어감.....");
  }
}
