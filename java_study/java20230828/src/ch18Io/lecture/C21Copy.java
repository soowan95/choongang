package ch18Io.lecture;

import java.io.*;

public class C21Copy {
  public static void main(String[] args) {
    String path = "C:/Temp/test4.jpg";
    String path1 = "C:/Temp/test5.jpg";
    String path2 = "C:/Temp/test6.jpg";

    try {
      InputStream is = new FileInputStream(path);
      InputStream is1 = new FileInputStream(path);
      InputStream bis = new BufferedInputStream(is);
      OutputStream os = new FileOutputStream(path1);
      OutputStream bos = new BufferedOutputStream(os);
      OutputStream os1 = new FileOutputStream(path2);

      try (is; bis; os; bos; os1){
        byte[] chars = new byte[1024];
        int len = 0;

        long start = System.currentTimeMillis();
        while ((len = bis.read(chars)) != -1) {
          bos.write(chars, 0, len);
        }
        long end = System.currentTimeMillis();
        System.out.println("buf: " + (end-start) + "ms");
        bos.flush();

        byte[] chars1 = new byte[1024];
        int len1 = 0;

        long start1 = System.currentTimeMillis();
        while ((len1 = is1.read(chars1)) != -1) {
          os1.write(chars1, 0, len1);
        }
        long end1 = System.currentTimeMillis();
        System.out.println("norm: " + (end1 - start1) + "ms");
        os1.flush();
      }
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
