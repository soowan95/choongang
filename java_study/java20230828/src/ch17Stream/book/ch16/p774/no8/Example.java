package ch17Stream.book.ch16.p774.no8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.function.Function.*;

public class Example {
  public static void main(String[] args) {
    List<Member> list = Arrays.asList(
      new Member("홍길동", "개발자"),
      new Member("김나리", "디자이너"),
      new Member("신용권", "개발자")
    );

    Map<String, List<Member>> groupingMap = list.stream()
            .collect(Collectors.groupingBy(Member::getJob));

    System.out.println("{개발자}");
/*    list.stream()
            .filter(e -> e.getJob().equals("개발자"))
            .toList()
            .forEach(System.out::println);*/
    groupingMap.get("개발자").forEach(System.out::println);

    System.out.println("{디자이너}");

    groupingMap.get("디자이너").forEach(System.out::println);
  }
}
