package ch06;

public class Ex131415 {

	public static void main(String[] args) {
		Member user1 = new Member();
		user1.setuser("ȫ�浿","hong");
		
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
class Member { //13��
	String name;
	String id;
	String password;
	int age;
	
	
	void setuser (String name,String id) { //14��
		this.name=name;
		this.id=id;
	}
	
	
}



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


