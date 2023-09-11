package leetCodeTest.no771;

import java.util.HashSet;
import java.util.Set;

public class Solution771 {

  public int numJewelsInStones(String jewels, String stones) {
    Set<Character> jewelSet = new HashSet<>();
    int a = 0;
    for (char c : jewels.toCharArray()) {
      jewelSet.add(c);
    }

    for (char c : stones.toCharArray()) {
      if (jewelSet.contains(c)) {
        a++;
      }
    }

    return a;
  }
}
