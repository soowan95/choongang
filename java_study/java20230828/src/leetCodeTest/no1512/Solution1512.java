package leetCodeTest.no1512;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class Solution1512 {
  public int numIdenticalPairs(int[] nums) {

    return Arrays.stream(nums)
            .boxed()
            .collect(groupingBy(Function.identity(), counting())).values()
            .stream()
            .map(a -> a * (a - 1) / 2)
            .mapToInt(Long::intValue)
            .sum();
  }
}
