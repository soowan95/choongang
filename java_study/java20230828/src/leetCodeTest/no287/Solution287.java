package leetCodeTest.no287;

import java.util.HashSet;
import java.util.Set;

public class Solution287 {

  public int findDuplicate(int[] nums) {

    Set<Integer> set = new HashSet<>();

    for(int num : nums) {
      if (set.contains(num)) {
        return num;
      }
      set.add(num);
    }
    return 0;

  }
}
