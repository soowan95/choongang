public class BasicLang {
  public static void main(String[] args) {
    String s1 = "abcdefg";
    String s2 = "ABCDEFG";
    String s3 = " abc ";
    String kor = "한글 입력을 시작합니다.";
    String a1 = "컴퓨터", a2 = "컴퓨터", a3 = "학교";
    String c1 = "Abc", c2 = "abc123 ? kbs456 : sbs777";
    String book = "1, 자바 학습, 참조 타입, String을 학습합니다., 홍길동";
    String[] strA = {"자바", "웹표준", "백엔드", "프론트"};
    String[] wordA = kor.split(" +");
    String[] tokens = book.split(",");
    int i1 = 1234567;
    int[] jumA = {50, 60, 70};
    double pi = 3.141592;
    char[] charA = s2.toCharArray();

    System.out.println(String.format("%20s", s1));
    System.out.println(String.format("%,d", i1));
    System.out.println(String.format("%,#6.3f", pi));
    System.out.println(String.format("%,06.3f", pi));
    System.out.println("--------------------------------------------");
    System.out.println(String.format(s2.toLowerCase()));
    System.out.println(String.format(s1.toUpperCase()));
    System.out.println("--------------------------------------------");
    System.out.println(s3);
    System.out.println(s3.trim());
    System.out.println("--------------------------------------------");
    System.out.println(s1.substring(3, 5));
    System.out.println("--------------------------------------------");
    for (int k = 0; k < charA.length; k++)
      System.out.println(charA[k]);
    System.out.println("--------------------------------------------");
    for (int k = 0; k < wordA.length; k++)
      System.out.println(wordA[k]);
    System.out.println("--------------------------------------------");
    System.out.println(s1.matches("[a-z]"));
    System.out.println(s1.matches("[a-z]+"));
    System.out.println("--------------------------------------------");
    System.out.println(String.join(", ", strA));
    System.out.println("--------------------------------------------");
    System.out.println(a1.compareTo(a2));
    System.out.println(a1.compareTo(a3));
    System.out.println(a3.compareTo(a2));
    System.out.println("--------------------------------------------");
    System.out.println(a1.startsWith("컴"));
    System.out.println(a1.endsWith("퓨"));
    System.out.println(c1.equals("abc"));
    System.out.println(c1.equalsIgnoreCase("abc"));
    System.out.println("--------------------------------------------");
    System.out.println(c2.replace("?", ""));
    System.out.println(c2.replaceAll("[0-9]", ""));
    System.out.println("--------------------------------------------");
    for(int i = 0; i < tokens.length; i++)
      System.out.println(tokens[i]);
    System.out.println("--------------------------------------------");
    for(String str : tokens)
      System.out.println(str);
    System.out.println("--------------------------------------------");
    for(int no : jumA)
      System.out.println(no);
  }
}