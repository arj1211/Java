package ccc.contest.fourteen;
import java.util.Scanner;

public class S2_2014 {

	static int studentNum;
	static String[] firstNamesArr;
	static String[] secondNamesArr;
	static boolean ftft;
	static int gogo = 0;

	public static void main(String[] args) {

		Scanner scantirr = new Scanner(System.in);
		String studentNumStr = scantirr.nextLine().trim();
		String firstNames = scantirr.nextLine().trim();
		String secondNames = scantirr.nextLine().trim();
		scantirr.close();
		studentNum = Integer.parseInt(studentNumStr);
		firstNamesArr = firstNames.split(" ", studentNum);
		secondNamesArr = secondNames.split(" ", studentNum);

		for (int i = 0; i < studentNum; i++) {

			if (verify(firstNamesArr[i], secondNamesArr[i]) == false) {
				System.out.println("bad");
				ftft = false;
				break;
			}

			if (verify(firstNamesArr[i], secondNamesArr[i]) == true
					&& i == studentNum - 1) {
				gogo += 1;
				ftft = true;
				continue;
			}
		}

		if (ftft == true && gogo > 0) {
			System.out.println("good");
		}

	}

	private static boolean verify(String first, String second) {
		boolean isPaired1 = false;
		boolean isPaired2 = false;

		for (int i = 0; i < studentNum; i++) {

			if (firstNamesArr[i].equals(first)
					&& !secondNamesArr[i].equals(second))
				return false;

			if (firstNamesArr[i].equals(second)
					&& !secondNamesArr[i].equals(first))
				return false;

			if (secondNamesArr[i].equals(first)
					&& !firstNamesArr[i].equals(second))
				return false;

			if (secondNamesArr[i].equals(second)
					&& !firstNamesArr[i].equals(first))
				return false;

			if (firstNamesArr[i].equals(first)
					&& secondNamesArr[i].equals(second))
				isPaired1 = true;
			if (firstNamesArr[i].equals(second)
					&& secondNamesArr[i].equals(first))
				isPaired1 = true;
			if (secondNamesArr[i].equals(first)
					&& firstNamesArr[i].equals(second))
				isPaired2 = true;
			if (secondNamesArr[i].equals(second)
					&& firstNamesArr[i].equals(first))
				isPaired2 = true;

			if (firstNamesArr[i].equals(secondNamesArr[i]))
				return false;

			if (secondNamesArr[i].equals(firstNamesArr[i]))
				return false;

		}

		if (isPaired1 == true && isPaired2 == true)
			return true;
		else
			return false;

	}

}
