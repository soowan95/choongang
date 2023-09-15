package ch18Io.lecture;

import java.io.*;

public class C17Copy {
  public static void main(String[] args) {
    String src = "java_study/java20230828/src/ch18Io/lecture/C17Copy.java";
    String des = "C:/Temp/C17Copy.java";

    try {
      InputStream is = new FileInputStream(src);
      OutputStream os = new FileOutputStream(des);

      try (is; os) {
        byte[] buf = new byte[100];
        int len = 0;

        while((len = is.read(buf)) != -1) {
          os.write(buf, 0, len);
        }
      }

      os.flush();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
