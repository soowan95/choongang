package ch18Io.lecture;

import java.io.*;

public class C22Filter {
  public static void main(String[] args) {
    try {
      InputStream is = new FileInputStream("");
      InputStreamReader isr = new InputStreamReader(is);
      BufferedReader br = new BufferedReader(isr);
    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    }

    try {
      OutputStream os = new FileOutputStream("");
      BufferedOutputStream bos = new BufferedOutputStream(os);
      OutputStreamWriter osw = new OutputStreamWriter(bos);
    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    }
  }
}
