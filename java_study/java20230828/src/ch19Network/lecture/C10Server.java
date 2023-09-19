package ch19Network.lecture;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class C10Server {
  public static void main(String[] args) {
    try (ServerSocket serverSocket = new ServerSocket(8080);) {

      while (true) {

        Socket socket = serverSocket.accept();

        Thread thread = new Thread(() -> {
          try {

            OutputStream os = socket.getOutputStream();
            PrintStream ps = new PrintStream(os);

            try (socket; os; ps) {

              String html = """
                      <h1>내가 직접 만든 서버에서 보내는 html</h1>
                      """;

              ps.println("http/1.1 200");
              ps.println("content-type: text/html; charset=utf-8");
              ps.println("content-length: " + html.getBytes().length);
              ps.println();
              ps.println(html);
            }
          } catch (Exception e) {
            e.printStackTrace();
          }
        });
        thread.start();
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
