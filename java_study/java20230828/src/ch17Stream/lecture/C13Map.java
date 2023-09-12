package ch17Stream.lecture;

import java.util.List;

public class C13Map {
  public static void main(String[] args) {
    List<Integer> list = List.of(3, 2, 1, 4, 7);
    list.stream()
            .map(x -> x - 2)
            .forEach(System.out::println);

    System.out.println("음수로 바꿔서 출력");
    list.stream()
            .map(x -> -x)
            .forEach(System.out::println);

    System.out.println("2배한 값 출력");
    list.stream()
            .map(x -> x * 2)
            .forEach(System.out::println);

    System.out.println("제곱값 출력");
    list.stream()
            .map(x -> x * x)
            .forEach(System.out::println);
  }
}
