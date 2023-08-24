class Apt {
  int room = 3;
  void door() {
    System.out.println("문이 열쇠");
  }
}

class Dan extends Apt {
  int room = 4;
  void door() {
    System.out.println("문이 도어락");
  }
}

class An extends Dan {
  int room = 5;
}

public class House {
  public static void main(String[] args) {
    Apt apt = new Apt();
    Apt aptDan = new Dan();
    Dan dan = new Dan();
    Dan danAny = new An();
    apt.door();
    aptDan.door();
    danAny.door();
    System.out.println(aptDan.room);
    System.out.println(dan.room);
    System.out.println(danAny.room + 1);
    danAny.room += 1;
    System.out.println(dan.room);
    System.out.println(danAny.room);
  }
}
