package ch05;

public class Sort {
	public static void main(String[] args) {
		int[] numbers = new int[] {5,63,1,455,12,4412, 12, 12, 1, 5};
		
		print(numbers);
		
		sort2(numbers);
		
		print(numbers);
		
		
	}
	
	public static void sort(int[] numbers) {
		int[] origin = numbers;
		int[] sorted = new int[numbers.length];
		int min;
		int minIndex=0;
		int[] nextNumbers;
		for(int i=0;i<sorted.length;++i) {
			min=Integer.MAX_VALUE;
			for(int j=0;j<numbers.length;++j) {
				if(numbers[j]<min) {
					min=numbers[j];
					minIndex=j;
				}
			}
			
			nextNumbers=new int[numbers.length-1];
			for(int a=0;a<minIndex;a++) {
				nextNumbers[a]=numbers[a];
			}
			for(int a=minIndex+1;a<numbers.length;a++) {
				nextNumbers[a-1]=numbers[a];
			}
			numbers=nextNumbers;
			

			sorted[i]=min;
		}
		for(int i=0;i<sorted.length;++i)
			origin[i] = sorted[i];
	}

	public static void sort2(int[] numbers) {
		int target;
		for(int i = 1;i<numbers.length;++i) {
			target = numbers[i];
			//비교대상반복
			for(int j=0;j<i;j++) {
				if(numbers[i-j-1]  >  target ) {
					numbers[i-j]=numbers[i-j-1];
					if(i-j-1==0)
						numbers[0]=target;
				} else {
					numbers[i-j]=target;
					break;
				}
			}
		}
	}
	
	public static void print(int[] numbers) {
		if(numbers==null||numbers.length==0)
			return;
		System.out.print(numbers[0]);
		for(int i=1;i<numbers.length;++i) {
			System.out.print(", ");
			System.out.print(numbers[i]);
		}
		System.out.println();
	}
}
