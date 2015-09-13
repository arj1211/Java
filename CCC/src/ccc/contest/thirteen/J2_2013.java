//package ccc.contest.thirteen;

import java.util.Scanner;

 class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String input = scanner.nextLine().trim();
		scanner.close();

		if (input.contains("A") || input.contains("B") || input.contains("C")
				|| input.contains("D") || input.contains("E")
				|| input.contains("F") || input.contains("G")
				|| input.contains("J") || input.contains("K")
				|| input.contains("L") || input.contains("M")
				|| input.contains("P") || input.contains("Q")
				|| input.contains("R") || input.contains("T")
				|| input.contains("U") || input.contains("V")
				|| input.contains("W") || input.contains("Y")

		) {
			System.out.println("NO");
		} else
			System.out.println("YES");

	}

}
