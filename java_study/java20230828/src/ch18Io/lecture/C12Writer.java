package ch18Io.lecture;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class C12Writer {
  public static void main(String[] args) {
    String path = "C:/Temp/out4.txt";

    try (Writer writer = new FileWriter(path)) {

      writer.write('손'); // char 은 int 로 자동형변환 됨
      writer.write('흥');
      writer.write(48124);

      writer.flush();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
