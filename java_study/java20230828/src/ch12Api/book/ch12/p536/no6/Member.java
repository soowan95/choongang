package ch12Api.book.ch12.p536.no6;

public class Member {
  private String id;
  private String name;

  public Member(String id, String name) {
    this.id = id;
    this.name = name;
  }

  @Override
  public String toString() {
    return this.id + ": " + this.name;
  }
}
