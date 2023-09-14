package ch11Exception.book.ch11.p485.no7;

public class WrongPasswordException extends Exception {
  public WrongPasswordException() {}

  public WrongPasswordException(String message) {
    super(message);
  }
}
