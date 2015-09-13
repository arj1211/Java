package thenewboston.intermediate;

public class Recursion_3 {
	
	
	
	public static void main(String[] args) {
		System.out.println(factorial(10));
	}
	
	
	
	private static long factorial(long num){
		if (num<=1)
			return 1;
		else
			return num*factorial(num-1);
	}
	
	
	
}
