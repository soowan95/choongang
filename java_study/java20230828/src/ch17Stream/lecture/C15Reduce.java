package ch17Stream.lecture;

import java.util.List;

public class C15Reduce {
  public static void main(String[] args) {
    // reduce
    //
    List<Integer> list = List.of(5, 1, 3);


    System.out.println("모든 값 더하기");
    Integer i = list.stream()
            .reduce(0, (r, e) -> r + e / list.size());
    System.out.println(i);

    List<String> list1 = List.of("ja", "va", " is ", "g", "ood");
    String s = list1.stream()
            .reduce("", String::concat);
    System.out.println(s);
  }
}
