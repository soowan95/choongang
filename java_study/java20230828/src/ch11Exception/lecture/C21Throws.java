package ch11Exception.lecture;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C21Throws {
  public static void main(String[] args) {
    try {
      FileInputStream input = new FileInputStream("file");
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }
}
