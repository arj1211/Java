package com.demo.arrays;

/*
 * This program creates a String array.
 * 
 * It also sets the values and prints them
 */
public class ArrayDemo {

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
		System.out.println(vidur[0]);
		System.out.println(vidur[1]);		
		System.out.println(vidur[2]);
		System.out.println(vidur[3]);
		System.out.println(vidur[4]);

		System.out.println(vidur.length);
	}

}
