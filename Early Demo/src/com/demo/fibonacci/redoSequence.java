package com.demo.fibonacci;

public class redoSequence {

	public static void main(String[] args) {
	
			
		
			int n = Integer.parseInt(args[0]);
			int[] fib = new int[n];
			
			fib[0] = 1;
			fib[1] = 1;
			
			for (int counter = 2; counter<n; counter++){
				fib[counter] = fib[counter-1] + fib[counter-2];
			}
			
			for (int counter = 0; counter<fib.length; counter++){
				System.out.println(fib[counter]);
			}
	}

}
