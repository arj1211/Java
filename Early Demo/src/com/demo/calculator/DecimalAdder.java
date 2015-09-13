package com.demo.calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DecimalAdder {
	public static void main(String[] args) throws IOException {

		String fNstr;
		String sNstr;

		double fN;
		double sN;
		double sum;

		BufferedReader stdin = new BufferedReader(new InputStreamReader(
				System.in));

		for (int counter = 0; counter < 6; counter++) {

			System.out.println("Enter first number: ");

			fNstr = stdin.readLine().trim();
			fN = Double.parseDouble(fNstr);

			// prints
			System.out.println("Enter second number: ");

			sNstr = stdin.readLine().trim();
			sN = Double.parseDouble(sNstr);

			sum = (fN + sN);

			System.out.println("Sum: " + sum);

		}
	}
}