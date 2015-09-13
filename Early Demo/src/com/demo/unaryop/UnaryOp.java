package com.demo.unaryop;

public class UnaryOp {

	public static void main(String[] args) {
	
		int q = 3;
		int w = 3;
		int res;
		System.out.println(q + " " + w);
		
		res = (q == w) ? q++ : (q = 3);
			
			System.out.println("mind = blown   " + res);
		
	
		if (!(q == w)){
			System.out.println("q /= w");
		}
		
		if (q == w){
			System.out.println("q = w");
		}
	}
}
		
	


	


