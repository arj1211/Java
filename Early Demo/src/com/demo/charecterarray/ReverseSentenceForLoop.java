package com.demo.charecterarray;

public class ReverseSentenceForLoop {

	public static void main(String[] args) {
		
		String inString = "Java is awesome";
		String outString = "";
		
		int counter = inString.length();
		System.out.println(counter);
		
		char[] abc = inString.toCharArray();
		
		for (int i=counter-1; i>-1; i--){
			outString = outString + abc[i];
		}
		System.out.println(outString);
	}

}
