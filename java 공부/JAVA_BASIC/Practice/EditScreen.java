public class EditScreen extends InputScreen{
  void editMode() {
    System.out.println("정보 수정 선택 화면");
    System.out.println("1. 이 름 : ");
    System.out.println("2. 전 화 : ");
    System.out.println("3. 나 이 : ");
    System.out.println("작업 번호를 선택 하세요 : "); int no = sc.nextInt();
    if(no == 1) {
      System.out.println("수정할 정보를 입력하세요 : ");
      sc.nextLine();
      String name = sc.nextLine();
      int count = 0;
      for(String str : inputNameA) {
        if(name.equals(str))
          break;
        count++;
      }
      name = sc.nextLine();
      inputNameA.set(count, name);
    }
  }
}
