package ch17Stream.lecture;

import java.util.List;

public class C10Skip {
  public static void main(String[] args) {
    List<Integer> list = List.of(3, 2, 3, 4, 5, 6, 7, 1);
    list.stream()
            .skip(3)
            .forEach(System.out::println);

    System.out.println("가장 작은 값");
    list.stream()
            .sorted()
            .limit(1)
            .forEach(System.out::println);

    System.out.println("가장 큰 값");
    list.stream()
            .sorted()
            .skip(list.size()-1)
            .forEach(System.out::println);
  }
}
