package ch12Api.book.ch12.p562.no5;

import java.util.Objects;

public class Student {
  private String studentNum;

  public Student(String studentNum) {
    this.studentNum = studentNum;
  }

  public String getStudentNum() {
    return studentNum;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Student student = (Student) o;

    return Objects.equals(studentNum, student.studentNum);
  }

  @Override
  public int hashCode() {
    return studentNum != null ? studentNum.hashCode() : 0;
  }
}
