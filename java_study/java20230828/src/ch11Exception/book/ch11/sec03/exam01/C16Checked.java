package ch11Exception.book.ch11.sec03.exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C16Checked {
  public static void main(String[] args) {
    try {
      FileInputStream input = new FileInputStream("file");
      // checked exception은
      // 예외처리코드 꼭 작성
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }
}
