package ch17Stream.lecture;

import java.util.List;

public class C12Filter {
  public static void main(String[] args) {
    List<Integer> list = List.of(2, 3, 4, 1, 9, 3);
    list.stream()
            .filter(e -> e > 2)
            .sorted((a, b) -> a - b)
            .forEach(System.out::println);

    System.out.println("---------------");
    list.stream()
            .filter(e -> e%2 == 1)
            .sorted((x, y) -> y - x)
            .limit(1)
            .forEach(System.out::println);
  }
}
