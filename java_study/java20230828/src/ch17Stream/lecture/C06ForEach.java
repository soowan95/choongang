package ch17Stream.lecture;

import java.util.List;

public class C06ForEach {
  public static void main(String[] args) {
    List<Integer> list = List.of(1, 2, 3, 4, 13, 5, 23);
    list.stream()
            .forEach(System.out::println);
  }
}
