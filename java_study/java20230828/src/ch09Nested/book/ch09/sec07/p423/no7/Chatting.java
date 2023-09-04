package ch09Nested.book.ch09.sec07.p423.no7;

public class Chatting {
  class Chat {
    void start() {}
    void sendMessage(String message) {}
  }

  void startChat(String chatId) {
    String nickName = null;
    nickName = chatId;

    Chat chat = new Chat() {
      @Override
      public void start() {
        while(true) {
          String inputData = "안녕하세요";
//          String message = "[" + nickName + "]" + inputData; // 로컬클래스에서 지역변수 nickName을 사용하려면 final 이어야 함.
//          sendMessage(message);
        }
      }
    };

    chat.start();
  }
}
