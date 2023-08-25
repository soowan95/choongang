package rpgGameDemo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GameDemo {
  static void makeLine() {
    System.out.println("=============================================");
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    GameTitle gameTitle = new GameTitle();
    CharacterAct characterAct = new CharacterAct();
    CharacterStatus characterStatus = new CharacterStatus();
    int no = 0;
    while(no == 0) {
      gameTitle.titleScreen();
      System.out.print("선택 : ");
      try {no = sc.nextInt();} 
      catch(InputMismatchException e) {
        sc.nextLine();
        makeLine();
        System.out.println("숫자를 입력하세요!!!!!!!!!!!!!!!!!!!!!!!!");
        makeLine();
      }
    }
    sc.nextLine();
    makeLine();
    if(no < 3)
      System.out.println("*****모험의 세계에 오신걸 환영합니다*****");
    while (CharacterMain.hp >= 0) {
      if (no == 1 || no == 2) {
        no = 0;
        while(no == 0) {
          makeLine();
          System.out.println("무엇을 하시겠습니까?");
          System.out.println("1. 걷기");
          System.out.println("2. 포션");
          System.out.println("3. 상태");
          System.out.println("4. 종료");
          System.out.print("선택 : ");
          try {no = sc.nextInt();} 
          catch(InputMismatchException e) {
            sc.nextLine();
            makeLine();
            System.out.println("숫자를 입력하세요!!!!!!!!!!!!!!!!!!!!!!!!");
          }
        }
        sc.nextLine();
        if (no == 1) {
          characterAct.walk();
          gameTitle.endScreen(no);
          no = gameTitle.endScreen(no);
        }
        else if (no == 2)
          characterAct.potionDrink();
        else if (no == 3) {
          characterStatus.showStatus();
          no = 1;
        }
        else {
          makeLine();
          System.out.println("|||||||||||Game Over||||||||||");
          break;
        }
      } else {
        System.out.println("|||||||||||Game Over||||||||||");
        break;
      }
    }
  }
}