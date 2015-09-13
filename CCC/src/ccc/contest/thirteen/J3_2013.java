//package ccc.contest.thirteen;

import java.util.Arrays;
import java.util.Scanner;

 class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int Y = scan.nextInt();
		scan.close();
		Y++;
		while (distinctDigits(Y) == false) {
			Y++;
		}
		System.out.println(Y);
	}

	static boolean distinctDigits(int arrayNum) {
		int[] array = new int[Integer.toString(arrayNum).length()];

		for (int un = 0; un < Integer.toString(arrayNum).length(); un++)
			array[un] = Integer.toString(arrayNum).charAt(un);

		Arrays.sort(array);

		for (int count = 0; count < array.length - 1; count++) {

			if (array[count] == array[count + 1]) {
				return false;
			} else {
				continue;
			}
		}
		return true;
	}

}
