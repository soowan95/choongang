package leetCodeTest.no844;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution844Test {

  @Test
  void backspaceCompare() {
    Solution844 o = new Solution844();
    assertEquals(true, o.backspaceCompare("ad#c", "ad#c"));
    assertEquals(true, o.backspaceCompare("ad##", "c#d#"));
    assertEquals(false, o.backspaceCompare("a#c", "b"));
  }
}