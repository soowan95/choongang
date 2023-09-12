package ch17Stream.lecture;

import java.util.Comparator;
import java.util.List;

public class C11Sorted {
  public static void main(String[] args) {
    List<Integer> list = List.of(3, 2, 1, 5, 3, 4, 5);
    list.stream()
            .sorted((x, y) -> y - x)
            .distinct()
            .forEach(System.out::println);
  }
}
