package ch19Network.lecture;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class C08Server {
  public static void main(String[] args) {

      ServerSocket serverSocket = null;
    try {
      serverSocket = new ServerSocket(5000);

      for (int i = 0; i < 50; i++) {
        Socket socket = serverSocket.accept();

        String path = "C:/Temp/test.png";

        FileInputStream fis = new FileInputStream(path);
        BufferedInputStream bis = new BufferedInputStream(fis);

        OutputStream os = socket.getOutputStream();
        BufferedOutputStream bos = new BufferedOutputStream(os);

        try (socket; fis; bis; os; bos) {
          byte[] bytes = new byte[1024];
          int len = 0;

          while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
          }

          bos.flush();
        }
      }
    } catch (IOException e) {
      throw new RuntimeException(e);
    } finally {
      try {
        serverSocket.close();
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }
  }
}
