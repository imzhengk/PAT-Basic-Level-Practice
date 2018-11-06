package Algorithm;

public class Factorial {

	public static void main(String[] args) {
		System.out.println(factorial(5));
		System.out.println(sum(1234));
	}
	
	public static int factorial(int n) {
		if(n==0)
			return 1;
		return n * factorial(n-1);
	}

	public static int sum(int n) {
		if(n<10)
			return n;
		return n%10 + sum(n/10);
	}
}
