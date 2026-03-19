package Day1;

public class program1 {
	public static void main(String[] args) {
		boolean isPrime = true;
		int num = 7;
		for(int i =2; i<num; i++) {
			if(num%i==0) {
				isPrime =false;
			}
		}
		if(isPrime) {
			System.out.println("prime");
		}else {
			System.out.println("not prime");
		}
	}

}
