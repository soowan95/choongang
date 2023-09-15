package ch18Io.lecture;

import java.io.*;

public class C18Filter {
  public static void main(String[] args) {
    // 보조스트림 (filter Stream)
    // : 다른 스트림을 변환하는 스트림

    try {
      OutputStream os = getOutputStream("C:/Temp/out8.txt");
      OutputStreamWriter osw = new OutputStreamWriter(os);

      try (os; osw;){
        osw.write('손');
        osw.write('흥');
        osw.write('민');

        osw.flush();
      } catch (IOException e) {
        e.printStackTrace();
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static OutputStream getOutputStream(String file) throws FileNotFoundException {
    return new FileOutputStream(file);
  }
}
