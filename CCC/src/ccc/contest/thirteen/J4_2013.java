//package ccc.contest.thirteen;

import java.util.Arrays;
import java.util.Scanner;

 class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int totalMins = scan.nextInt();
		int totalChores = scan.nextInt();
		int[] chores = new int[totalChores];

		for (int count = 0; count < totalChores; count++)
			chores[count] = scan.nextInt();

		scan.close();
		Arrays.sort(chores);

		maxChores(chores, totalMins);

	}

	static int maxChores(int[] chores, int totalMins) {
		int sum = 0;
		int choresNum = 0;
		while (choresNum < chores.length && sum <= totalMins) {
			sum += chores[choresNum];
			choresNum++;
		}

		if (sum > totalMins) {
			System.out.println(choresNum - 1);
			return (choresNum - 1);
		} else {
			System.out.println(choresNum);

			return (choresNum);
		}
	}

}
