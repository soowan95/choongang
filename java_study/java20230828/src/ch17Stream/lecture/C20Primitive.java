package ch17Stream.lecture;

import java.util.Optional;
import java.util.stream.IntStream;

public class C20Primitive {
  public static void main(String[] args) {
    // 기본타입 stream : IntStream, LongStream, DoubleStream
    // 참조타입 stream : Stream<T>

    // 기본타입 stream -> 참조타입 stream
    Integer max = IntStream.of(3, 9, 1, 2, 7)
            .boxed()
            .max(Math::max)
            .get();

    System.out.println("max = " + max);
  }
}
