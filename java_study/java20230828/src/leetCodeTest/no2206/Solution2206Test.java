package leetCodeTest.no2206;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution2206Test {

  @Test
  void divideArray() {
    Solution2206 o = new Solution2206();
    boolean i = o.divideArray(new int[]{3,2,3,2,2,2});
    assertEquals(true, i);

    boolean j = o.divideArray(new int[]{1,2,3,4});
    assertEquals(false, j);
  }
}