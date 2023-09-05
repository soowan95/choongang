package ch12Api.book.ch12.p562.no5;

import java.util.HashSet;

public class StudentExample {
  public static void main(String[] args) {
    HashSet<Student> hashSet = new HashSet<>();

    hashSet.add(new Student("1"));
    hashSet.add(new Student("1"));
    hashSet.add(new Student("2"));

    System.out.println("저장된 Student 수: " + hashSet.size());
  }
}