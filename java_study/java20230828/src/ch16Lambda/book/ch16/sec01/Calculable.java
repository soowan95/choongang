package ch16Lambda.book.ch16.sec01;

@FunctionalInterface // 이 인터페이스가 추상 메소드가 하나인지 컴파일러를 통해 검증
public interface Calculable {
  void calculate(int x, int y);
}
