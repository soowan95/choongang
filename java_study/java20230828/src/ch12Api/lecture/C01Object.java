package ch12Api.lecture;

public class C01Object {
  public static void main(String[] args) {
    // Object
    // 모든 클래스의 슈퍼 클래스
    // 모든 타입의 상위 타입
    String s = "java";
    Object o1 = s;
    o1.toString();

    Integer i = 3;
    Object o2 = i;
    o2.toString();

    C01Object c = new C01Object();
    Object o3 = c;

    int j = 30;
    Object o4 = j;
  }
}
