import java.util.ArrayList;

public class EditScreen extends InputScreen{
  ArrayList<Integer> indexCountA = new ArrayList<Integer>();
  void makeLine() {
    System.out.println("==============================");
  }
  void editMode() {
  int indexCount = 0;
  indexCountA.clear();
    makeLine();
    System.out.println("정보 수정 선택 화면");
    System.out.println("1. 이 름");
    System.out.println("2. 전 화");
    System.out.println("3. 나 이");
    makeLine();
    System.out.print("검색 번호를 선택 하세요 : "); int no = sc.nextInt();
    sc.nextLine();
    // -------------------원하는 정보 찾기 시작--------------------------
    if(no == 1) {
      makeLine();
      System.out.print("이름을 입력하세요 : "); name = sc.nextLine();
      System.out.println("이름\t전화\t\t나이\t번호");
      for(String str : inputNameA) {
        if(name.equals(str))
          indexCountA.add(indexCount);
        indexCount++;
      }
      for(int i = 0; i < indexCountA.size(); i++) {
        System.out.println(inputNameA.get(indexCountA.get(i)) + "\t" + inputTelA.get(indexCountA.get(i)) + "\t" + inputAgeA.get(indexCountA.get(i)) + "\t" + (i + 1) + ".");
      }
    } else if(no == 2) {
      makeLine();
      System.out.print("전화를 입력하세요 : "); tel = sc.nextLine();
      System.out.println("이름\t전화\t\t나이\t번호");
      for(String str : inputTelA) {
        if(tel.equals(str))
          indexCountA.add(indexCount);
        indexCount++;
      }
      for(int i = 0; i < indexCountA.size(); i++) {
        System.out.println(inputNameA.get(indexCountA.get(i)) + "\t" + inputTelA.get(indexCountA.get(i)) + "\t" + inputAgeA.get(indexCountA.get(i)) + "\t" + (i + 1) + ".");
      }
    } else if(no == 3) {
      makeLine();
      System.out.print("나이를 입력하세요 : "); age = sc.nextInt();
      sc.nextLine();
      System.out.println("이름\t전화\t\t나이\t번호");
      for(int i : inputAgeA) {
        if(age == i)
          indexCountA.add(indexCount);
        indexCount++;
      }
      for(int i = 0; i < indexCountA.size(); i++) {
        System.out.println(inputNameA.get(indexCountA.get(i)) + "\t" + inputTelA.get(indexCountA.get(i)) + "\t" + inputAgeA.get(indexCountA.get(i)) + "\t" + (i + 1) + ".");
      }
    }
    // -------------------원하는 정보 찾기 끝--------------------------
    makeLine();
    System.out.print("수정할 정보의 번호를 입력하세요 : "); int editNo = sc.nextInt();
    sc.nextLine();
    makeLine();
    System.out.println("이름\t전화\t\t나이\t번호");
    System.out.println(inputNameA.get(indexCountA.get(editNo - 1)) + "\t" + inputTelA.get(indexCountA.get(editNo - 1)) + "\t" + inputAgeA.get(indexCountA.get(editNo - 1)) + "\t" + editNo + ".");
    makeLine();
    System.out.println("1. 이 름");
    System.out.println("2. 전 화");
    System.out.println("3. 나 이");
    makeLine();
    System.out.print("수정할 정보를 선택하세요 : "); int selectNo = sc.nextInt();
    sc.nextLine();
    // ------------------정보 수정하기 시작--------------------
    if(selectNo == 1) {
      makeLine();
      System.out.print("수정할 정보를 입력하세요 : "); String name = sc.nextLine();
      inputNameA.set(indexCountA.get(editNo - 1), name);
      makeLine();
      System.out.println("수정된 정보 : ");
      System.out.println("이름\t전화\t\t나이");
      System.out.println(inputNameA.get(indexCountA.get(editNo - 1)) + "\t" + inputTelA.get(indexCountA.get(editNo - 1)) + "\t" + inputAgeA.get(indexCountA.get(editNo - 1)));
    } else if(selectNo == 2) {
      makeLine();
      System.out.print("수정할 정보를 입력하세요 : "); String tel = sc.nextLine();
      inputTelA.set(indexCountA.get(editNo - 1), tel);
      makeLine();
      System.out.println("수정된 정보 : ");
      System.out.println("이름\t전화\t\t나이");
      System.out.println(inputNameA.get(indexCountA.get(editNo - 1)) + "\t" + inputTelA.get(indexCountA.get(editNo - 1)) + "\t" + inputAgeA.get(indexCountA.get(editNo - 1)));
    } else if(selectNo == 3) {
      makeLine();
      System.out.print("수정할 정보를 입력하세요 : "); int age = sc.nextInt();
      sc.nextLine();
      inputAgeA.set(indexCountA.get(editNo - 1), age);
      makeLine();
      System.out.println("수정된 정보 : ");
      System.out.println("이름\t전화\t\t나이");
      System.out.println(inputNameA.get(indexCountA.get(editNo - 1)) + "\t" + inputTelA.get(indexCountA.get(editNo - 1)) + "\t" + inputAgeA.get(indexCountA.get(editNo - 1)));
    }
  }
}
