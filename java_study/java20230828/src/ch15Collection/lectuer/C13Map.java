package ch15Collection.lectuer;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class C13Map {
  public static void main(String[] args) {
    // map 전체 탐색
    Map<String, String> map = new HashMap<>();

    map.put("학생1", "흥민");
    map.put("학생2", "강인");
    map.put("학생3", "민재");
    // 향산된 for
    System.out.println("향상된 for로 전체탐색");

    Set<Map.Entry<String, String>> entries = map.entrySet();

    for (Map.Entry<String, String> entry : entries) {
      System.out.println(entry.getKey() + ":" + entry.getValue());
    }
    //keySet
    System.out.println("keySet 사용해서 전체탐색");
    Set<String> keys = map.keySet();
    for(String key : keys) {
      System.out.println(key + ":" + map.get(key));
    }
    // forEach
    System.out.println("forEach 메소드로 전체탐색");
    map.forEach((key, value) -> System.out.println(key + ":" + value));
  }
}
