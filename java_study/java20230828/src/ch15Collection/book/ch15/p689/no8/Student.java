package ch15Collection.book.ch15.p689.no8;

import java.util.Objects;

public class Student {

  public int studentNum;
  public String name;

  public Student(int studentNum, String name) {
    this.studentNum = studentNum;
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Student student = (Student) o;

    if (studentNum != student.studentNum) return false;
    return Objects.equals(studentNum, student.studentNum);
  }

  @Override
  public int hashCode() {
    return studentNum;
  }
}
