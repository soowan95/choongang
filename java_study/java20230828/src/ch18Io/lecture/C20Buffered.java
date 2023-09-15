package ch18Io.lecture;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class C20Buffered {
  public static void main(String[] args) {
    String path = "C:/Temp/out9.txt";
    long start = 0;
    long end = 0;
    try {
      Writer writer = new FileWriter(path);

      start = System.currentTimeMillis();
      for (int i = 0; i < 10000; i++) {
        writer.write('가');
      }
      end = System.currentTimeMillis();

      writer.flush();
      writer.close();
    } catch (IOException e) {
      e.printStackTrace();
    }

    long start1 = 0;
    long end1 = 0;
    try {
      String path2 = "C:/Temp/out10.txt";
      Writer writer1 = new FileWriter(path2);
      Writer writer2 = new BufferedWriter(writer1);

      start1 = System.currentTimeMillis();
      for (int i = 0; i < 10000; i++) {
        writer2.write('나');
      }
      end1 = System.currentTimeMillis();

      writer2.flush();
      writer2.close();
    } catch (IOException e) {
      e.printStackTrace();
    }

    System.out.println("그냥: " + (end - start) + "ms");
    System.out.println("버퍼: " + (end1 - start1) + "ms");
  }
}
