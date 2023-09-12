package ch17Stream.lecture;

import java.util.List;

public class C07Distinct {
  public static void main(String[] args) {
    List<Integer> list = List.of(3, 2, 5, 2, 2, 1, 3, 6);
    long count = list.stream()
            .distinct()
            .count();

    System.out.println("count = " + count);
  }
}
