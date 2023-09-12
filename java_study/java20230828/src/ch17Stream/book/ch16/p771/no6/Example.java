package ch17Stream.book.ch16.p771.no6;

import java.util.Arrays;
import java.util.List;

public class Example {
  public static void main(String[] args) {
    List<Member> list = List.of(
            new Member("홍길동" , 30),
            new Member("신용권", 40),
            new Member("김자바", 26)
    );

    double i = list.stream()
            .map(a -> (double)a.getAge())
            .reduce(0.0, (a, b) -> a + b / list.size());
    System.out.println(i);

    System.out.println("가장 많은 나이");
    Integer i1 = list.stream()
            .map(a -> a.getAge())
            .reduce(0, Math::max);
    System.out.println(i1);

    System.out.println("가장 적은 나이");
    Integer i2 = list.stream()
            .map(a -> a.getAge())
            .reduce(200, Math::min);
    System.out.println(i2);
  }
}
