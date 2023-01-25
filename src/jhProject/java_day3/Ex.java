package jhProject.java_day3;

class Ex {
	int length1;
	
	int number1;
	int number2;
	
	double length2;
	
	
	int area(int length1) {
		return length1*length1;
	}
	
	int gcd (int number1, int number2) {
		for(int i=0;i<=number1&&i<=number2;i++) {
			if(number1%i==0&&number2%i==0) {
				return i;
			}
		} return 0; //...?
		
	}
	
	double volume(double length2) {
		return 4*3.14*length2*length2*length2/3;
	}
}

