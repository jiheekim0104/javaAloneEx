package jhProject.java_day3;

public class PigDie {

	public static void main(String[] args) {
		int mount = 134300;
		int money50000 = 134300/50000;
		int last50000 = 134300%50000;
		
		int money10000= (last50000)/10000;
		int last10000 = (last50000)%10000;
		
		int money5000= (last10000)/5000;
		int last5000 = (last10000)%5000;
		
		int money1000= (last5000)/1000;
		int last1000 = (last5000)%1000;
		
		int money500= (last1000)/500;
		int last500 = (last1000)%500;
		
		int money100= (last500)/100;
		
		System.out.println(money50000 + " " + money10000 + " " +money5000 + " " +money1000 + " " +money500 + " " +money100 );
		

	}

}
