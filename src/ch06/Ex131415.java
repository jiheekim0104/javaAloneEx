package ch06;

public class Ex131415 {

	public static void main(String[] args) {
		Member user1 = new Member();
		user1.setuser("홍길동","hong");
		
		MemberService memberService = new MemberService(); 
		boolean result = memberService.login("hong","12345");
		if(result) {
			System.out.println("로그인 되었습니다.");
			memberService.logout("hong");
		} else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
		
		
		
	}

}//class end
class Member { //13번
	String name;
	String id;
	String password;
	int age;
	
	
	void setuser (String name,String id) { //14번
		this.name=name;
		this.id=id;
	}
	
	
}



class MemberService { //15번 -1
	boolean login (String id,String password) {
		if(id.equals("hong")&&password.equals("12345")) {
			return true;
		} else {
			return false;
			}
	}
	
	
	void logout(String id) { //15번-2
		System.out.println(id+"님이 로그아웃 되었습니다.");
	}
}


