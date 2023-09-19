package ch19Network.lecture;

import java.io.*;
import java.net.Socket;

public class C07Client {
  public static void main(String[] args) {
    // server 가 client 에게 파일 보내기
    try {
      Socket socket = new Socket("172.30.1.36", 5000);

      InputStream is = socket.getInputStream();
      BufferedInputStream bis = new BufferedInputStream(is);

      String path = "C:/Temp/test-server.png";

      FileOutputStream fos = new FileOutputStream(path);
      BufferedOutputStream bos = new BufferedOutputStream(fos);

      try (socket; is; bis; fos; bos) {
        byte[] bytes = new byte[1024];
        int len = 0;

        while ((len = bis.read(bytes)) != -1) {
          bos.write(bytes, 0, len);
        }

        bos.flush();
      }
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
