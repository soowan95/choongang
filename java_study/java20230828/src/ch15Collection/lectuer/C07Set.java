package ch15Collection.lectuer;

import java.util.HashSet;
import java.util.Set;

public class C07Set {
  public static void main(String[] args) {
    // Set : 객체(item, element, 원소, 요쇼)를 담고 있는 객체
    // 특징 : 중복된 element를 저장하지 않음.

    Set<String> set1 = new HashSet<>();

    set1.add("java");
    set1.add("spring");
    set1.add("react");
    set1.add("java");

    System.out.println(set1.size());

    System.out.println(set1.contains("java"));
    System.out.println(set1.contains("html"));

    boolean remove1 = set1.remove("java");
    boolean remove2 = set1.remove("html");

    System.out.println("remove1 = " + remove1);
    System.out.println("remove2 = " + remove2);

    System.out.println(set1.size());

    // of : 새로운 수정할수 없는 객제 생성
    Set<String> set2 = Set.of("css", "react", "html");
//    set2.add("java"); // exception

    set2.forEach(System.out::println);
  }
}
