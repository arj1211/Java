package com.demo.charecterarray;

public class ReverseSentenceWhileLoop {

	public static void main(String[] args) {
		
		String inString = "Java is awesome";
		
		
		int counter = inString.length();
		System.out.println(counter);
		
		char[] abc = inString.toCharArray();
		int i=counter-1;
		
		while (i>-1){
			System.out.print(abc[i]);
			i--;
		}
		
	}

}
