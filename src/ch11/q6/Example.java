package ch11.q6;

public class Example {
	public static void main(String[] args) {

		String[] strArray = { "10", "2A" };
		int value = 0;

		for (int i = 0; i <= 2; i++) {
			try {
				value = Integer.parseInt(strArray[i]);
			} catch (IndexOutOfBoundsException e) {
				System.out.println("�ε����� �ʰ�����");
			} catch (NumberFormatException e) {
				System.out.println("���ڷ� ��ȯ �Ҽ�����");
			} finally {
				System.out.println(value);
			}
		}
	}

}
// 10 (���� ����ǰ� fianlly ����)
// ���ڷ� ��ȯ�Ҽ� ���� 
// 10 (����ó���Ǿ��⶧���� �տ� value�� �״����! ����  fianlly ����)
// �ε����� �ʰ���
// 10 (���������� ����ó�� �Ǿ value �� �״��! ���� fianlly ����)