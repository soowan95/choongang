package ch19Network.lecture;

import java.io.*;
import java.net.Socket;

public class C05Client {
  public static void main(String[] args) {
    // client 가 서버에게 파일 보내기
    try {
      Socket socket = new Socket("172.30.1.36", 3000);

      String path = "C:/Temp/test.png";
      FileInputStream fi = new FileInputStream(path);
      BufferedInputStream bis = new BufferedInputStream(fi);

      OutputStream os = socket.getOutputStream();
      BufferedOutputStream bos = new BufferedOutputStream(os);

      try (fi; bis; os; bos; socket) {
        byte[] bytes = new byte[1024];
        int len = 0;

        while ((len = bis.read(bytes)) != -1) {
          bos.write(bytes, 0, len);
        }

        bos.flush();
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
