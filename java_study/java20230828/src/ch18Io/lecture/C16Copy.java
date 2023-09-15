package ch18Io.lecture;

import java.io.*;

public class C16Copy {
  public static void main(String[] args) {
    String src = "java_study/java20230828/src/ch18Io/lecture/C16Copy.java";
    String des = "C:/Temp/C16Copy.java";

    try {
      Reader reader = new FileReader(src);
      Writer writer = new FileWriter(des);

      try (reader; writer) {
        char[] chars = new char[100];
        int len = 0;

        while ((len = reader.read(chars)) != -1) {
          writer.write(chars, 0, len);
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
