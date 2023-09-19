package ch19Network.lecture;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class C09Client {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = "";
    Socket socket = null;
    OutputStream os = null;
    OutputStreamWriter osw = null;
    BufferedWriter bw = null;
    try {
      socket = new Socket("172.30.1.81", 7000);

      os = socket.getOutputStream();
      osw = new OutputStreamWriter(os);
      bw = new BufferedWriter(osw);

      while (!str.equals("exit")) {

        str = sc.nextLine();
        try {
          bw.write(str);
          bw.newLine();
          bw.flush();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        socket.close();
        os.close();
        osw.close();
        bw.close();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }

  }
}
