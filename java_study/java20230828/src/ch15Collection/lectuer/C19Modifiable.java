package ch15Collection.lectuer;

import java.util.ArrayList;
import java.util.List;

public class C19Modifiable {
  public static void main(String[] args) {
    List<String> list1 = List.of("html", "css", "react", "js");

//    list1.add("java");

    ArrayList<String> list2 = new ArrayList<>(list1);

    list2.add("java");
  }
}
