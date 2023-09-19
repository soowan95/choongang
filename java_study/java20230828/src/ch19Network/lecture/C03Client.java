package ch19Network.lecture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class C03Client {
  public static void main(String[] args) {

    try {
      Socket socket = new Socket("172.30.1.36", 3000);

      InputStream is = socket.getInputStream();
      InputStreamReader isr = new InputStreamReader(is);
      BufferedReader br = new BufferedReader(isr);

      try (socket; is; isr; br) {
        String line = br.readLine();
        System.out.println("서버가 보낸 내용 = " + line);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
