import java.util.ArrayList;

public class EditScreen extends InputScreen{
  ArrayList<Integer> indexCountA = new ArrayList<Integer>();
  void makeLine() {
    System.out.println("==============================");
  }
  void editMode() {
  while(true) {
    int check = 0;
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
        if(inputNameA.isEmpty()) {
          makeLine();
          System.out.println("정보가 없습니다.");
          break;
        } else {
          makeLine();
          System.out.print("이름을 입력하세요 : "); name = sc.nextLine();
          for(String str : inputNameA) {
            if(name.equals(str))
              check++;
          }
          if(check != 0) {
            System.out.println("이름\t전화\t\t나이\t번호");
            for(String str : inputNameA) {
              if(name.equals(str))
                indexCountA.add(indexCount);
              indexCount++;
            }
            for(int i = 0; i < indexCountA.size(); i++) {
              System.out.println(inputNameA.get(indexCountA.get(i)) + "\t" + inputTelA.get(indexCountA.get(i)) + "\t" + inputAgeA.get(indexCountA.get(i)) + "\t" + (i + 1) + ".");
            }
          } else {
            makeLine();
            System.out.println("정보가 없습니다.");
            break;
          }
        }
      } else if(no == 2) {
        if(inputTelA.isEmpty()) {
          makeLine();
          System.out.println("정보가 없습니다.");
          break;
        } else {
          makeLine();
          System.out.print("전화를 입력하세요 : "); tel = sc.nextLine();
          for(String str : inputNameA) {
            if(tel.equals(str))
              check++;
          }
          if(check != 0) {
            System.out.println("이름\t전화\t\t나이\t번호");
            for(String str : inputTelA) {
              if(tel.equals(str))
                indexCountA.add(indexCount);
              indexCount++;
            }
            for(int i = 0; i < indexCountA.size(); i++) {
              System.out.println(inputNameA.get(indexCountA.get(i)) + "\t" + inputTelA.get(indexCountA.get(i)) + "\t" + inputAgeA.get(indexCountA.get(i)) + "\t" + (i + 1) + ".");
            }
          } else {
            makeLine();
            System.out.println("정보가 없습니다.");
            break;
          }
        }
      } else if(no == 3) {
        if(inputAgeA.isEmpty()) {
          makeLine();
          System.out.println("정보가 없습니다.");
          break;
        } else {
          makeLine();
          System.out.print("나이를 입력하세요 : "); age = sc.nextInt();
          sc.nextLine();
          for(int i : inputAgeA) {
            if(age == i)
              check++;
          }
          if(check != 0) {
            System.out.println("이름\t전화\t\t나이\t번호");
            for(int i : inputAgeA) {
              if(age == i)
                indexCountA.add(indexCount);
              indexCount++;
            }
            for(int i = 0; i < indexCountA.size(); i++) {
              System.out.println(inputNameA.get(indexCountA.get(i)) + "\t" + inputTelA.get(indexCountA.get(i)) + "\t" + inputAgeA.get(indexCountA.get(i)) + "\t" + (i + 1) + ".");
            }
          } else {
            makeLine();
            System.out.println("정보가 없습니다.");
            break;
          }
        }
      }
      // -------------------원하는 정보 찾기 끝--------------------------
      makeLine();
      System.out.print("수정할 정보의 번호를 입력하세요 : "); int editNo = sc.nextInt();
      sc.nextLine();
      boolean con = true;
      while(con == true) {
        if(editNo > indexCountA.size()) {
          makeLine();
          System.out.print("번호를 다시 입력하세요."); editNo = sc.nextInt();
          sc.nextLine();
        } else {
          makeLine();
          System.out.println("이름\t전화\t\t나이\t번호");
          System.out.println(inputNameA.get(indexCountA.get(editNo - 1)) + "\t" + inputTelA.get(indexCountA.get(editNo - 1)) + "\t" + inputAgeA.get(indexCountA.get(editNo - 1)) + "\t" + editNo + ".");
          con = false;
        }
      }
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
        break;
      } else if(selectNo == 2) {
        makeLine();
        System.out.print("수정할 정보를 입력하세요 : "); String tel = sc.nextLine();
        inputTelA.set(indexCountA.get(editNo - 1), tel);
        makeLine();
        System.out.println("수정된 정보 : ");
        System.out.println("이름\t전화\t\t나이");
        System.out.println(inputNameA.get(indexCountA.get(editNo - 1)) + "\t" + inputTelA.get(indexCountA.get(editNo - 1)) + "\t" + inputAgeA.get(indexCountA.get(editNo - 1)));
        break;
      } else if(selectNo == 3) {
        makeLine();
        System.out.print("수정할 정보를 입력하세요 : "); int age = sc.nextInt();
        sc.nextLine();
        inputAgeA.set(indexCountA.get(editNo - 1), age);
        makeLine();
        System.out.println("수정된 정보 : ");
        System.out.println("이름\t전화\t\t나이");
        System.out.println(inputNameA.get(indexCountA.get(editNo - 1)) + "\t" + inputTelA.get(indexCountA.get(editNo - 1)) + "\t" + inputAgeA.get(indexCountA.get(editNo - 1)));
        break;
      }
    }
  }
}
