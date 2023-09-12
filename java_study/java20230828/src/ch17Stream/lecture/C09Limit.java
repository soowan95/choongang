package ch17Stream.lecture;

import java.util.List;

public class C09Limit {
  public static void main(String[] args) {
    List<Integer> list = List.of(2, 3, 4, 5, 1, 3, 4, 5, 6);
    list.stream()
            .limit(3)
            .forEach(System.out::println);
  }
}
