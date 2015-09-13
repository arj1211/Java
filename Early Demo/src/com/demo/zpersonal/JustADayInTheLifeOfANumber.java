package com.demo.zpersonal;

import java.util.Scanner;

public class JustADayInTheLifeOfANumber {

	public static void main(String[] args) {
		System.out.println("Yo, enter 3 nums");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if ((a + b + c) % 2 == 0)
			System.out.println("Guud even number, sum " + (a + b + c));
		if ((a + b + c) % 2 != 0)
			System.out.println("Ohw dayum nut evenn, sum " + (a + b + c));
		if ((a - b - c) > 0)
			System.out.println("Biiig numbre, diff " + (a - b - c));
		if ((a - b - c) <= 0)
			System.out.println("smalll nombre, diff" + (a - b - c));

		System.out.println("woahhh....bruhhhhhhh");
		sc.close();
	}
}
