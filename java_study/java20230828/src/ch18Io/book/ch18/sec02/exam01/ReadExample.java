package ch18Io.book.ch18.sec02.exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {
  public static void main(String[] args) {
    int data;
    try (InputStream is = new FileInputStream("C:/Temp/test1.db")) {

      while (true) {
        data = is.read();
        if(data == -1) break;
        System.out.println(data);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
