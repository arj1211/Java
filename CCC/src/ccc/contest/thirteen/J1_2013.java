package ccc.contest.thirteen;

import java.util.Scanner;

public class J1_2013 {

	public static void main(String[] args) {

		int child1;
		int child2;
		int child3;

		Scanner scanner = new Scanner(System.in);

		child1 = scanner.nextInt();
		child2 = scanner.nextInt();
		scanner.close();

		child3 = child2 + (child2 - child1);

		if (child3 < 0)
			System.out.println("Error");
		else
			System.out.println(child3);

	}

}
