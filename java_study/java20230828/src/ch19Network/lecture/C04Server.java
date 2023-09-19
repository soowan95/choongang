package ch19Network.lecture;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class C04Server {
  public static void main(String[] args) {
    try {
      ServerSocket serverSocket = new ServerSocket(3000);
      Socket socket = serverSocket.accept();

      OutputStream os = socket.getOutputStream();
      OutputStreamWriter osw = new OutputStreamWriter(os);
      BufferedWriter bw = new BufferedWriter(osw);

      try (socket; serverSocket; os; osw; bw){
        bw.write("안녕하세요 클라이언트");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
