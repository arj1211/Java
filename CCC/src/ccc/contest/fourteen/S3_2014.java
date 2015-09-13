package ccc.contest.fourteen;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class S3_2014 {

	static ArrayList<Integer> branch = new ArrayList<>();
	static ArrayList<Integer> lake = new ArrayList<>();
	public static void main(String[] args) throws IOException,
			NumberFormatException, NullPointerException {
		Scanner readinger = new Scanner(new File("s3.2014.in"));
		// take in #of tests
		int tests = readinger.nextInt();
		int[] carsNum = { 0 };
		boolean state = false;
		for (int t = 0; t < tests; t++) {
			carsNum[t] = readinger.nextInt();
			int[] mountainTop = new int[carsNum[t]];
			for (int i = 0; i < carsNum[t]; i++) {
				mountainTop[i] = readinger.nextInt();
			}
			process(carsNum[t], mountainTop, lake, branch);
			if (sortedOrNah(lake) == true) {
				state = true;
			} else if (sortedOrNah(lake) == false) {
				state = false;
			}
			continue;
		}
		readinger.close();
		if (state == true)
			System.out.println("Y");
		else if (state == false)
			System.out.println("N");
	}
	public static void process(int carsNum, int[] mountainTop,
			ArrayList<Integer> lake, ArrayList<Integer> branch) {
		int nnn = 0;
		// mountain --> lake if latest number is >
		// mountain --> branch if latest number is <
		while (nnn < carsNum) {
			if (mountainTop[carsNum - 1] > mountainTop[carsNum - 2]) {
				lake.add(mountainTop[carsNum - 1]);
			}
			if (mountainTop[carsNum - 1] < mountainTop[carsNum - 2]) {
				branch.add(mountainTop[carsNum - 1]);
			}
		}
		lake.addAll(branch);
	}
	public static boolean sortedOrNah(ArrayList<Integer> list_lake) {
		int[] listArr = { 0 };
		for (int r = 0; r < list_lake.size() - 1; r++)
			listArr[r] = list_lake.get(r).intValue();
		for (int g = 0; g < list_lake.size() - 1; g++) {
			if (listArr[g] < listArr[g + 1]) {
				return false;
			}
		}
		return true;
	}
}