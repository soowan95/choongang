package ch17Stream.lecture;

import java.util.List;
import java.util.Optional;

public class C16Reduce {
  public static void main(String[] args) {
    List<Integer> list = List.of(3, 4, 1);
    Integer max = list.stream()
            .reduce(Integer.MIN_VALUE, Math::max);
    System.out.println("max = " + max);

    List<Integer> list2 = List.of();
    Integer max2 = list2.stream()
            .reduce(Integer.MIN_VALUE, Math::max);
    System.out.println("max2 = " + max2);

    Optional<Integer> max3 = list2.stream()
            .reduce(Math::max);
    System.out.println("max3 = " + max3);
  }
}
