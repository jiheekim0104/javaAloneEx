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
					String inputData = "�ȳ��ϼ���";
					String message = "["+nickName+"]"+inputData;
					sendMessage(message);
				}
			}
		};
		
		chat.start();
	}
}

/* 1. String nickName = null; �� ���ú����� �ƴ� ������ ����������..
 	String nickName = null;
	void startChat(String chatID) {
		nickName = chatID;
		Chat chat = new Chat() {
			@Override
			public void start() {
				while(true) {
					String inputData = "�ȳ��ϼ���";
					String message = "["+nickName+"]"+inputData;
					sendMessage(message);
				}
			}
		};
*/

/* 2. finalString nickName = null; �� ���ų�, �� ��쿡�� nickName ������ ���� 

void startChat(String chatID) {
final String nickName = null;
	nickName = chatID;
	Chat chat = new Chat() {
		@Override
		public void start() {
			while(true) {
				String inputData = "�ȳ��ϼ���";
				String message = "["+nickName+"]"+inputData;
				sendMessage(message);
			}
		}
	};
*/	
// 3. ���� �� ���ó�� �������ְų�..! ( �߾Ⱦ��¹�� )