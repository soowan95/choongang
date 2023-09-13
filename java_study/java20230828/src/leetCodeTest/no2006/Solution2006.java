package leetCodeTest.no2006;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution2006 {
  public int countKDifference(int[] nums, int k) {

    ArrayList<Integer> list = new ArrayList<>();

    for(int i = 0; i < nums.length-1; i++) {
      for(int j = i+1; j < nums.length; j++) {
        list.add(Math.abs(nums[i]-nums[j]));
      }
    }

    return (int) list.stream()
            .filter(a -> a == k)
            .count();
  }
}
