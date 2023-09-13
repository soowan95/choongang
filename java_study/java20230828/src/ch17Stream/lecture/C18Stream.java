package ch17Stream.lecture;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class C18Stream {
  public static void main(String[] args) {
    List<Integer> list = List.of(3, 1, 3, 9, 10, 11);
    Optional<Integer> sum = list.stream()
            .reduce(Integer::sum);

    System.out.println("sum.orElse(0) = " + sum.orElse(0));

    OptionalInt sum2 = IntStream.of(3, 1, 3, 9, 10, 11)
            .reduce(Integer::sum);

    System.out.println("sum2.orElse(0) = " + sum2.orElse(0));

    int[] i = {3, 1, 3, 9, 10, 11};
    int sum1 = IntStream.of(i)
            .sum();

    System.out.println("sum1 = " + sum1);
  }
}
