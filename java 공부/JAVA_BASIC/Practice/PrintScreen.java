public class PrintScreen extends InputScreen{
  void makeLine() {
    System.out.println("==============================");
  }
  void printMode() {
    makeLine();
    System.out.println("이름\t전화\t\t나이");
    for(int i = 0; i < inputNameA.size(); i++)
    System.out.println(inputNameA.get(i) + "\t" + inputTelA.get(i) + "\t" + inputAgeA.get(i));
  }
}
