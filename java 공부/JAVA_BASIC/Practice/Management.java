import java.util.Scanner;

public class Management {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    FirstScreen firstScreen = new FirstScreen();
    InputScreen inputScreen = new InputScreen();
    EditScreen editScreen = new EditScreen();
    while(true) {
      firstScreen.firstMode();
      int no = sc.nextInt();
      if(no == 1) 
        inputScreen.inputMode();
      else if(no == 2)
        editScreen.editMode();
    }
  }
}
