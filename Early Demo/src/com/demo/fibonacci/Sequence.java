package com.demo.fibonacci;

public class Sequence {

	public static void main(String[] args) {
	
		int[] fib = new int[10];
		
		/*
		fib[0] = 1;
		fib[1] = 1;
		fib[2] = (fib[0]+fib[1]);
		fib[3] = (fib[1]+fib[2]);
		fib[4] = (fib[2]+fib[3]);
		fib[5] = (fib[3]+fib[4]);
		fib[6] = (fib[4]+fib[5]);
		fib[7] = (fib[5]+fib[6]);
		fib[8] = (fib[6]+fib[7]);
		fib[9] = (fib[7]+fib[8]);
		*/
		
		
		for (int counter = 0; counter<fib.length; counter++) {
			System.out.println(fib[counter]);
		}
	}

}
