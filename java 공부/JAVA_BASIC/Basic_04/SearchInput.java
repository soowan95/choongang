import java.util.Scanner;

public class SearchInput extends SearchArray{
  String name;
  int info = 0;
  void inputName() {
    Scanner sc = new Scanner(System.in);
      while(true) {
        System.out.print("찾는 사람 이름 : "); name = sc.nextLine();
        int count = 0;
        for(String str : nameA) {
          if(str.equals(name)) {
            break;
          }
          count++;
        }
        makeLine();
        System.out.println("이름    나이    전화");
        makeLine();
        System.out.println(nameA[count] + "\t" + ageA[count] + "\t" + telA[count]);
        makeLine();
        System.out.println("구체적인 정보 - 1. 이름 2. 나이 3. 전화 :"); info = sc.nextInt();
        while(info >= 0) {
          if(info == 1) {
            makeLine();
            System.out.println("이름은 : " + nameA[count] + "입니다.");
            break;
          } else if(info == 2) {
            makeLine();
            System.out.println("나이는 : " + ageA[count] + "살 입니다.");
            break;
          } else if(info == 3) {
            makeLine();
            System.out.println("전화번호는 : " + telA[count] + "입니다.");
            break;
          } else {
            makeLine();
            System.out.println("정보 입력 오류");
            break;
          }
        }
        
        System.out.print("\n또 찾을 사람(y/n)");
        sc.nextLine();
        name = sc.nextLine();
        if(name.equalsIgnoreCase("n"))
          break;
      }
    
      
  /*
    for(i = 0; i < nameA.length; i++) {
      if(name.equals(nameA[i])) {
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + ageA[i]);
        System.out.println("번호 : " + telA[i]);
      }
    }
    System.out.println("또 찾을건가요 : ");
  */
  }
}