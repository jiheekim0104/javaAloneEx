package ch13.q4;

public class UntilMain {

	public static void main(String[] args) {
		Pair<String,Integer> pair = new Pair<String, Integer>("홍길동", 35);
		Integer age = Util.getValue(pair, "홍길동");
		System.out.println(age);

		ChildPair<String,Integer> childPair = new ChildPair<String, Integer>("홍삼원", 20);
		Integer childAge = Util.getValue(childPair, "홍삼순");
		System.out.println(childAge);
	}

}

class Util<T>{
//	public T kind;
//	
//	public Util(T kind) {
//		this.kind = kind;
//	}
//	
//	public static Integer getValue(Pair pair, String name){
//		if(pair.getKey().equals(name)) {
//			return (Integer) pair.getValue();
//		}
//		return null;
//	}
//	
//	
//	public static Integer getValue(ChildPair childPair, String name){
//		if(childPair.getKey().equals(name)) {
//			return (Integer) childPair.getValue();
//		}
//		return null;
//	}
//	Base 7에서 사용한건 쓸수없나?
	static <P extends Pair<K,V>,K,V> V getValue(P p, K k) { //<자료형이 P라는거하나, K,V까지 총 세개로 표현함> 리턴타입은 V고 뒤에는 메소드임
		if(p.getKey()==k) {
			return p.getValue();
		} else {
			return null;
		}
	}
	
}
