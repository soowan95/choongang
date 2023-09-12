package ch17Stream.lecture;

import java.util.List;

public class C14Map {
  public static void main(String[] args) {
    List<String> list = List.of("java", "css", "react", "spring");

    list.stream()
            .map(x -> x.length())
            .forEach(System.out::println);
  }
}
