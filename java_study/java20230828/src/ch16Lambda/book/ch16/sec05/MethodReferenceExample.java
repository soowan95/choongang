package ch16Lambda.book.ch16.sec05;

public class MethodReferenceExample {
  public static void main(String[] args) {
    Person person = new Person();
    person.ordering(String::compareToIgnoreCase);
  }
}
