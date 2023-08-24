import java.util.Scanner;

public class SecondDegreeArray {
  public static void main(String[] args) {
    int jumA[][] = new int[10][10];
    int jumsu, cnt = 0;
    int su, moksu, i, j;
    String[] mokA = { "", "국어", "영어", "수학", "과학", "체육" };

    Scanner sc = new Scanner(System.in);

    System.out.print("몇 명 입력할건가요? ");
    su = sc.nextInt();

    System.out.print("몇 과목 입력할건가요? ");
    moksu = sc.nextInt();

    for (i = 1; i <= su; i++) {
      cnt++;
      for (j = 1; j <= moksu; j++) {
        System.out.println(cnt + "번 " + mokA[j] + "점수 : ");
        jumsu = sc.nextInt();
        jumA[i][j] = jumsu;
      }
    }
  }
}
