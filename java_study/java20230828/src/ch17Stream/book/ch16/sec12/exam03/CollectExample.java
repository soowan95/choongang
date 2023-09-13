package ch17Stream.book.ch16.sec12.exam03;

import ch17Stream.book.ch16.sec12.exam02.Student;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class CollectExample {
  public static void main(String[] args) {

    List<Student> totalList = List.of(
      new Student("홍길동", "남", 92),
      new Student("김수영", "여", 87),
      new Student("김자바", "남", 95),
      new Student("오해영", "여", 93)
    );

    Map<String, Double> map = totalList.stream()
            .collect(groupingBy(Student::getSex, averagingDouble(Student::getScore)));

    map.entrySet()
            .forEach(System.out::println);
  }
}
