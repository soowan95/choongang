package ch11Exception.lecture;

import java.util.List;

public class C15Unchecked {
  public static void main(String[] args) {
    List<Integer> list = List.of(4, 5, 1);
    list.get(0);
    list.get(1);
    list.get(2);
    list.get(3);
  }
}
