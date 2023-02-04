package ch09.q7;

public class Chatting {
	class Chat{
		void start() {}
		void sendMessage(String message) {}
	}
	
	void startChat(String chatID) {
		String nickName = null;
		nickName = chatID;
		final String finalNickName = nickName;
		Chat chat = new Chat() {
			String nickName=finalNickName;
			@Override
			public void start() {
				while(true) {
					String inputData = "안녕하세요";
					String message = "["+nickName+"]"+inputData;
					sendMessage(message);
				}
			}
		};
		
		chat.start();
	}
}

/* 1. String nickName = null; 를 로컬변수가 아닌 밖으로 빼버리던가..
 	String nickName = null;
	void startChat(String chatID) {
		nickName = chatID;
		Chat chat = new Chat() {
			@Override
			public void start() {
				while(true) {
					String inputData = "안녕하세요";
					String message = "["+nickName+"]"+inputData;
					sendMessage(message);
				}
			}
		};
*/

/* 2. finalString nickName = null; 로 쓰거나, 이 경우에는 nickName 고정됨 ㅇㅇ 

void startChat(String chatID) {
final String nickName = null;
	nickName = chatID;
	Chat chat = new Chat() {
		@Override
		public void start() {
			while(true) {
				String inputData = "안녕하세요";
				String message = "["+nickName+"]"+inputData;
				sendMessage(message);
			}
		}
	};
*/	
// 3. 지금 쓴 방법처럼 전달해주거나..! ( 잘안쓰는방법 )