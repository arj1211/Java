package com.demo.zpersonal;

import java.util.Scanner;
import java.math.BigInteger;

public class BigFactorial {
	public static void main(String[] args) {

		int n, c;
		BigInteger inc = new BigInteger("1");
		BigInteger fact = new BigInteger("1");

		Scanner input = new Scanner(System.in);

		System.out.println("Input an integer");
		n = input.nextInt();

		if (n < 300000 && n > 10111)
			System.out.println("This may take a minute or two...");
		else if (n > 300000 && n < 800000)
			System.out.println("This may take a long time...");
		else if (n > 800000)
			System.out
					.println("This computation may not finish today, or at all...");

		for (c = 1; c <= n; c++) {
			fact = fact.multiply(inc);
			inc = inc.add(BigInteger.ONE);
		}

		System.out.println(n + "! = " + fact);
		System.out.println("Digits:" + fact.toString().trim().length());

	}
}