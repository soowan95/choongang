package leetCodeTest.no1748;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.function.Function.*;
import static java.util.stream.Collectors.*;

public class Solution1748 {
  public int sumOfUnique(int[] nums) {


    return Arrays.stream(nums)
            .boxed()
            .collect(groupingBy(identity(), counting())).entrySet()
            .stream()
            .filter(a -> a.getValue() == 1)
            .map(Map.Entry::getKey)
            .mapToInt(Integer::intValue)
            .sum();
  }
}
