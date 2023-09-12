package ch17Stream.lecture;

import java.util.List;
import java.util.stream.Stream;

public class C03Stream {
  public static void main(String[] args) {
    List<String> list = List.of("java", "css", "spring");
    Stream<String> stream = list.stream();

    stream.count();

//    stream.count(); // exception
    Stream<String> stream1 = list.stream();

    stream1.count();

    System.out.println("프로그램 실행 중....");
  }
}
