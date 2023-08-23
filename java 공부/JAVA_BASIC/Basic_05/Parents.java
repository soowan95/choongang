public class Parents {
  int age = 50;
  String name = "부모";

  Parents() {
    System.out.println("나는 부모 생성자");
  }
  public Parents(int age, String name) {
    this.age = age;
    this.name = name;
    System.out.println("나는 부모 생성자(매개변수 2개)");
    System.out.println("나는 부모 생성자 나이 : " + age + ", 이름 : " + name);
  }
  public void pr() {
    System.out.println("자식 클래스에서 호출되어 출력 나이 : " + age + " 이름 : " + name);
  }
  public static void main(String[] args) {
    Hong hong = new Hong(10, "홍길동");
    hong.pr();
  }
}

class Hong extends Parents {
  Hong(int age, String name) {
    super(age, name);
  }
}