public class SearchArray {
  String[] nameA = {"Hong", "Lee", "Kim", "Park", "Kang"};
  int[] ageA = {10, 20, 30, 40, 50};
  String[] telA = {"010-5311-4156", "010-4567-9874", "010-4822-3156", "010-1264-4848", "010-8465-4111"};
  int i, count = 0;
  void makeLine() {
    System.out.println("----------------------------------------");
  }
  void searchData() {
    System.out.println("데이터 출력");
    makeLine();
    System.out.println("이름    나이    전화");
    makeLine();
    for(i = 0; i < nameA.length; i++) {
      System.out.println(nameA[i] + "\t" + ageA[i] + "\t" + telA[i]);
    }
    makeLine();
  }
}
