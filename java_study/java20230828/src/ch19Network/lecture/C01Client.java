package ch19Network.lecture;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.Socket;

public class C01Client {
  public static void main(String[] args) {
    try {
      Socket socket = new Socket("172.30.1.36", 3000);
      Writer writer = new OutputStreamWriter(socket.getOutputStream());
      BufferedWriter bw = new BufferedWriter(writer);

      try (socket; writer; bw) {
        bw.write("안녕하세요!!!!");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
