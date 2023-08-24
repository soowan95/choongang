import java.util.InputMismatchException;
import java.util.Scanner;

public class Management {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    FirstScreen firstScreen = new FirstScreen();
    InputScreen inputScreen = new InputScreen();
    EditScreen editScreen = new EditScreen();
    PrintScreen printScreen = new PrintScreen();
    SearchScreen searchScreen = new SearchScreen();
    EndScreen endScreen = new EndScreen();
    int no = 0;
    while(endScreen.con == true) {
      firstScreen.firstMode();
      try {
        no = sc.nextInt();
      } catch(InputMismatchException e) {
        System.out.println("잘 못 입력하셨습니다.");
        sc.nextLine();
      }
      if(no == 1) 
        inputScreen.inputMode();
      else if(no == 2)
        editScreen.editMode();
      else if(no == 3)
        printScreen.printMode();
      else if(no == 4)
        searchScreen.searchMode();
      else {
        endScreen.endMode();
      }
    }
    System.out.println("종료했습니다.");
  }
}
