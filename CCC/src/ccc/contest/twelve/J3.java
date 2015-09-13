package ccc.contest.twelve;

import java.util.Scanner;

public class J3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int lines = scan.nextInt();
		scan.close();

		String space = "";
		String x = "";
		String star = "";

		int i = 0;
		while (i < lines) {

			star += "*";
			x += "x";
			space += " ";
			i++;
		}

		for (int w = 0; w < lines; w++)
			System.out.println(star + x + star);
		for (int w = 0; w < lines; w++)
			System.out.println(space + x + x);
		for (int w = 0; w < lines; w++)
			System.out.println(star + space + star);

	}

}