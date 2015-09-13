package com.demo.loops;

/*
 * This program creates a String array.
 * 
 * It also sets the values and prints them
 */
public class ForLoop {

	public static void main(String[] args) {
		
		// Declare string array
		String[] vidur = new String[5];
		
		// Set array values
		vidur[0] = "Vidur";
		vidur[1] = "Suri";
		vidur[2] = "Arjun";
		vidur[3] = "Bawa";
		vidur[4] = "Java";
		
		// Print array values
		// for (initialize counter value; set final value of counter; how counter is incremented){
		
		// vvv finite loop. 
		// for (int counter = 0; counter<5; counter++){
		// System.out.println(vidur[counter]);
		
		// infinite loop below vv
		int counter = 0;
		for ( ; ;){
					
			System.out.println(vidur[counter++]);
		}
		
		/* this program will throw an exception at runtime. index array out of bounds: there are no more indexs in the array, therefore it cannot print them. 
		 * at compiling time, the only errors you can get are warnings and exceptions. the only errors you can get are runtime errors in the shape of exceptions. 
		 * 
		 */
	}

}
