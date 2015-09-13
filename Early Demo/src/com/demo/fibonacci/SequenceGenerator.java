package com.demo.fibonacci;

public class SequenceGenerator {

	public int[] fibSequenceGen(int size) {

		int[] fib = new int[size];

		fib[0] = 1;
		fib[1] = 1;

		for (int counter = 2; counter < size; counter++) {
			fib[counter] = fib[counter - 1] + fib[counter - 2];
		}

		for (int counter = 0; counter < fib.length; counter++) {
			System.out.println(fib[counter]);
		}
		return fib;
	}
}
