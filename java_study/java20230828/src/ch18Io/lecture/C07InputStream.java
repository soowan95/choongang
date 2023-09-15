package ch18Io.lecture;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class C07InputStream {
  public static void main(String[] args) {
    String path = "C:/Temp/out3.txt";

    try (InputStream is = new FileInputStream(path)) {

      int read = is.read();
      int read1 = is.read();
      int read2 = is.read();

      System.out.println("read = " + read);
      System.out.println("read1 = " + read1);
      System.out.println("read2 = " + read2);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
