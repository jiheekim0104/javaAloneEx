package ch12.p504;

public class ToStringExample {

	public static void main(String[] args) {
		SmartPhone smartPhone = new SmartPhone("�Ｚ����", "�ȵ���̵�");
		
		String strObj = smartPhone.toString();
		System.out.println(strObj);
		
		System.out.println(smartPhone); // �Ű����� ��ü�ΰ�쿡�� toString() �޼ҵ尡 ȣ��ȴ�! ���⼭�� �������̵��س��� ���ڰ�����~~

	}

}
