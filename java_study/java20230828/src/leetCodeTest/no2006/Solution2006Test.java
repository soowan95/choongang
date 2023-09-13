package leetCodeTest.no2006;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution2006Test {

  @Test
  void countKDifference() {
    Solution2006 o = new Solution2006();
    assertEquals(4, o.countKDifference(new int[]{1,2,2,1}, 1));
    assertEquals(0, o.countKDifference(new int[]{1,3}, 3));
    assertEquals(3, o.countKDifference(new int[]{3,2,1,5,4}, 2));
  }
}