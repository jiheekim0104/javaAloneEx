package ch06.q18;

public class ShopService {
	static ShopService instance;

	public static ShopService getInstance() {
		return instance;
	}

	public void setInstance(ShopService instance) {
		this.instance = instance;
	}
}
