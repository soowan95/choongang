import java.util.Scanner;

public class AniAll {
  AniCat aniCat = new AniCat();
  void makeLine() {
    System.out.println("=============================");
  }
  Scanner sc = new Scanner(System.in);
  String name = "동물 이름";
  static String sori = "울음 소리";
  static int leg = 4;

  void AniSearch() {
    makeLine();
    System.out.print("어떤 동물의 정보를 원하시나요 : "); name = sc.nextLine();
    makeLine();
    System.out.println(name + "의 어떤 정보를 원하시나요?");
    System.out.println("1. 울음 소리");
    System.out.println("2. 다리 수");
    System.out.println("3. 먹이");
    System.out.println("4. 사육 난이도");
    System.out.print("번호 입력 : "); int no = sc.nextInt();
    if(name.equalsIgnoreCase(aniCat.title))
      sori = aniCat.sori;
      leg = aniCat.leg;
      switch(no) {
        case 1 : System.out.println(name + "의 울음 소리는 " + sori + "입니다."); break;
        case 2 : System.out.println(name + "의 다리는 " + leg + "개 입니다.");
    }
  }
}
