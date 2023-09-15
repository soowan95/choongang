package ch18Io.lecture;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

public class C15Reader {
  public static void main(String[] args) {
    String path = "C:/Temp/out7.txt";

    // 문자 단위 입력 스트림
    try (Reader reader = new FileReader(path)) {
      char c1 = (char) reader.read();
      char c2 = (char) reader.read();
      char c3 = (char) reader.read();

      System.out.println("c1 = " + c1);
      System.out.println("c2 = " + c2);
      System.out.println("c3 = " + c3);

      char[] chars = new char[3];
      int read = reader.read(chars);
      System.out.println("Arrays.toString(chars) = " + Arrays.toString(chars));
      int read1 = reader.read(chars);
      System.out.println("Arrays.toString(chars) = " + Arrays.toString(chars));
      int read2 = reader.read(chars);
      System.out.println("Arrays.toString(chars) = " + Arrays.toString(chars));

      System.out.println("read = " + read);
      System.out.println("read1 = " + read1);
      System.out.println("read2 = " + read2);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
