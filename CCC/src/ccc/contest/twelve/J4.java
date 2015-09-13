package ccc.contest.twelve;

import java.util.Scanner;

public class J4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int k = Integer.parseInt(scan.nextLine().trim());
		String cipher = scan.nextLine();

		scan.close();

		char[] wordArray = cipher.toCharArray();

		for (int u = 0; u < cipher.length(); u++) {
			int shift = 3 * (u + 1) + k;
			char outputChar = (char) ((char) wordArray[u] - shift);

			if (outputChar < 'A') {
				char wrapAround = (char) ('Z' + 1 - ('A' - outputChar));
				System.out.print(wrapAround);
			} else
				System.out.print(outputChar);

		}
	}

}
