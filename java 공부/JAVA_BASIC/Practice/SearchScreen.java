import java.util.ArrayList;

public class SearchScreen extends InputScreen{
  ArrayList<Integer> indexCountA = new ArrayList<Integer>();
  void searchMode() {
    int indexCount = 0;
    indexCountA.clear();
    makeLine();
    System.out.println("검색 화면");
    System.out.println("1. 이 름");
    System.out.println("2. 전 화");
    System.out.println("3. 나 이");
    makeLine();
    System.out.print("검색 번호를 선택 하세요 : "); int no = sc.nextInt();
    sc.nextLine();
    if(no == 1) {
      makeLine();
      System.out.print("이름을 입력하세요 : "); name = sc.nextLine();
      makeLine();
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
      makeLine();
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
      makeLine();
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
  }
}
