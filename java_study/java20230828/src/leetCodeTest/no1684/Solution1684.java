package leetCodeTest.no1684;

import java.util.HashSet;
import java.util.Set;

public class Solution1684 {

  public int countConsistentStrings(String allowed, String[] words) {

    int a = 0;

    for(String s : words) {
      if(s.matches("[" + allowed + "]*")) a++;
    }
    return a;
  }
}
