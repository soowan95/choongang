package ch15Collection.lectuer;

import java.util.ArrayList;
import java.util.List;

public class C02List {

  public static void main(String[] args) {
    // List : 순서가 있음, 중복된 원소 저장 가능
    List<String> list = new ArrayList<>();

    // element 추가
    list.add("java");
    list.add("spring");
    list.add("3");
    list.add("react");

    // element 꺼내기
    String s = list.get(0);
    String s1 = list.get(3);
    System.out.println("s = " + s);
    System.out.println("s1 = " + s1);

    // element 갯수
    int size = list.size();
    System.out.println("size = " + size);

    list.add("react");
    list.add("3");

    System.out.println(list.size());

    // element 지우기
    list.remove("react");
    System.out.println(list.size());
    list.remove("java");
    System.out.println(list.size());

    System.out.println(list.get(0));
    System.out.println(list.get(3));

    // element 확인
    boolean contains = list.contains("java");
    boolean contains1 = list.contains("react");
    System.out.println("contains = " + contains);
    System.out.println("contains1 = " + contains1);

    // element 전체 탐색 (for)
    System.out.println("for 이용 탐색");
    for(int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }

    System.out.println("향상된 for 이용 탐색");
    for(String str : list) {
      System.out.println(str);
    }

    System.out.println("foreach 이용 탐색");
    list.forEach(System.out::println);
  }
}
