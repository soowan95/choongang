package ch13Generic.lecture;

public class C01Before {
  public static void main(String[] args) {
    MyClass01 o1 = new MyClass01();
    o1.setA("java");

    MyClass01 o2 = new MyClass01();
    o2.setA(3);

    MyClass01 o3 = new MyClass01();
    o3.setA(true);

    Object f1 = o1.getA();
    Object f2 = o2.getA();
    Object f3 = o3.getA();

    String g1 = (String) f1;
    Integer g2 = (Integer) f2;
    boolean g3 = (boolean) f3;

    Long g4 = (Long) f2; // runtime exception

    System.out.println("프로그램 진행....");
  }
}

class MyClass01 {
  private Object a;

  public void setA(Object a) {
    this.a = a;
  }

  public Object getA() {
    return a;
  }
}