package ch06.q15;

public class Main {

	public static void main(String[] args) {
	
		
		MemberService memberService = new MemberService(); 
		boolean result = memberService.login("hong","12345");
		if(result) {
			System.out.println("�α��� �Ǿ����ϴ�.");
			memberService.logout("hong");
		} else {
			System.out.println("id �Ǵ� password�� �ùٸ��� �ʽ��ϴ�.");
		}
		
		
		
	}

}//class end



class MemberService { //15�� -1
	boolean login (String id,String password) {
		if(id.equals("hong")&&password.equals("12345")) {
			return true;
		} else {
			return false;
			}
	}
	
	
	void logout(String id) { //15��-2
		System.out.println(id+"���� �α׾ƿ� �Ǿ����ϴ�.");
	}
}
