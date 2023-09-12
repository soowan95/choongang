package ch17Stream.lecture;

import java.util.List;

public class C08Sorted {
  public static void main(String[] args) {
    List<Integer> list = List.of(3, 6, 3, 5, 23, 4, 5, 23, 42);
    list.stream()
            .distinct()
            .sorted()
            .forEach(System.out::println);
  }
}
