package ch11Exception.lecture;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;

public class C22Throws {
  public static void main(String[] args) throws Exception{
    Connection connection = DriverManager.getConnection("", "", "");
    FileInputStream fileInputStream = new FileInputStream("");
    Class.forName("");
  }
}
