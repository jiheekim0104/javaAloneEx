package ch06;

public class Ex18 {

	public static void main(String[] args) {
		/*
		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();
		
		if (obj1==obj2) {
			System.out.println("같은 ShopService 객체입니다.");
		} else {
			System.out.println("다른 ShopService 객체입니다.");
		}
		*/
	}

} //CLASS END

class ShopService {

	String instance;

	public String getInstance() {
		return instance;
	}

	public void setInstance(String instance) {
		this.instance = instance;
	}
}
