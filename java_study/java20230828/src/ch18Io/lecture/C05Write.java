package ch18Io.lecture;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C05Write {
  public static void main(String[] args) {
    String path = "C:/Temp/out2.txt";
    try (OutputStream os = new FileOutputStream(path)) {
      byte[] b = new byte[100];

      os.write(b);
      os.write(b);

      os.flush();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
