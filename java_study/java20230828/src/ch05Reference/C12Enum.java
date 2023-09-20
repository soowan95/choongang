package ch05Reference;

public class C12Enum {
  public static void main(String[] args) {
    MyEnum12 v1 = MyEnum12.VALUE1;
    MyEnum12 v2 = MyEnum12.VALUE2;
    MyEnum12 v3 = MyEnum12.VALUE3;
    MyEnum12 v4 = MyEnum12.MY_FRIST_VALUE;
    MyEnum12 v5 = MyEnum12.VALUE3;

    System.out.println("(v1==v2) = " + (v1 == v2));
    System.out.println("(v1==v4) = " + (v1 == v4));
    System.out.println("(v3==v5) = " + (v3 == v5));
  }
}

enum MyEnum12 {
  // 콤마로 구분한 값 나열
  // 값의 이름 작성 관습 : UPPER_SNAKE_CASE
  VALUE1,
  VALUE2,
  VALUE3,
  MY_FRIST_VALUE
}