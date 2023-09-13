package ch17Stream.lecture;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class C19IntStream {
  public static void main(String[] args) {

    // 평균 구하기
    OptionalDouble average = IntStream.of(9, 10, 0, 1, 3, 2, 77, 33)
            .average();

    System.out.println("average.orElse(0) = " + average.orElse(0));
    // 최대값 구하기
    OptionalInt max = IntStream.of(9, 10, 0, 1, 3, 2, 77, 33)
            .max();

    System.out.println("max.orElse(0) = " + max.orElse(0));
    // 최소값 구하기
    OptionalInt min = IntStream.of(9, 10, 0, 1, 3, 2, 77, 33)
            .min();

    System.out.println("min.orElse(0) = " + min.orElse(0));
  }
}
