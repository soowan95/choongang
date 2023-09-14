package ch11Exception.book.ch11.p485.no7;

public class NotExistIDException extends Exception {
  public NotExistIDException() {}
  public NotExistIDException(String message) {
    super(message);
  }
}
