package ch15Collection.lectuer;

import java.util.HashSet;
import java.util.Set;

public class C20Modifiable {
  public static void main(String[] args) {
    Set<String> set = Set.of("java", "spring", "react");
    Set<String> set2 = new HashSet<>(set);

    set2.add("html");

    System.out.println(set.size());
    System.out.println(set2.size());

  }
}
