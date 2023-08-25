class Par {
  String name;
  int age;
  Par(String name, int age) {
    this.name = name;
    this.age = age;
  }
  String str() {
    System.out.printf("이름 : %s, 나이 : %d\n", name, age);
    return String.format("이름 : %s, 나이 : %d", name, age);
  }
}

public class Constructor {
  public static void main(String[] args) {
    Par p1 = new Par("홍길동", 20);
    String str =  p1.str();
    System.out.println(str);
  }
}
