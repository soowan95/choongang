package ch19Network.lecture;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class C06Server {
  public static void main(String[] args) {

    try {
      ServerSocket serverSocket = new ServerSocket(3000);
      Socket socket = serverSocket.accept();

      InputStream is = socket.getInputStream();
      BufferedInputStream bis = new BufferedInputStream(is);

      String path = "C:/Temp/test-client.png";

      FileOutputStream fos = new FileOutputStream(path);
      BufferedOutputStream bos = new BufferedOutputStream(fos);

      try (socket; serverSocket; is; bis; fos; bos) {
        byte[] bytes = new byte[1024];
        int len = 0;

        while ((len = bis.read(bytes)) != -1) {
          bos.write(bytes, 0, len);
        }

        bos.flush();
        System.out.println("received file");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
