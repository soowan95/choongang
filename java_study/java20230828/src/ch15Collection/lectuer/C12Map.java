package ch15Collection.lectuer;

import java.util.HashMap;
import java.util.Map;

import static java.lang.Character.isUpperCase;

public class C12Map {
  public static void main(String[] args) {
    // Map : key, value 쌍(entry)를 저장
    // key가 중복된 entry가 있을 수 없음.

    Map<String, String> map = new HashMap<>();

    // entry 추가 메소드
    map.put("student1", "손흥민");
    map.put("student2", "이강인");
    map.put("student3", "김민재");
    // entry 갯수 확인 메소드
    System.out.println("map.size() = " + map.size());
    // entry 교체 메소드
    map.put("student3", "박지성");
    // entry 삭제 메소드
    map.remove("student2");
    // entry 호출 메소드
    String s = map.get("student1");
    System.out.println("s = " + s);
    System.out.println("map.get(\"student3\") = " + map.get("student3"));
  }
}
