package ch17Stream.lecture;

import java.util.List;

public class C05Terminal {
  public static void main(String[] args) {
    List<String> list = List.of("css", "html", "spring");
    long count = list.stream()
            .count();

    System.out.println("count = " + count);
  }
}
