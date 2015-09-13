package ccc.contest.fourteen;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class S1_2014 {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner scann = new Scanner(new File("s1.2014.in"));

		// take first 2 inputs
		int k_totalFriendsNum = scann.nextInt();
		int m_roundsOfRemovalNum = scann.nextInt();
		// all other inputs
		ArrayList<Integer> removalMultiples = new ArrayList<>();
		for (int u = 0; u < m_roundsOfRemovalNum; u++) {
			removalMultiples.add(scann.nextInt());
		}

		// number all the friends (internal counter
		// variable used to append friends in increasing order from "1")
		ArrayList<Integer> friends1 = new ArrayList<>();
		for (int y = 1; y <= k_totalFriendsNum; y++) {
			friends1.add(y);
		}

		// each round
		for (int g : removalMultiples) {// for each integer in removalMultiples
			ArrayList<Integer> friends2 = new ArrayList<>();

			// for every person in current non-eliminated arraylist
			for (int l = 0; l < friends1.size(); l++) {
				if ((l + 1) % g != 0) {// if multiple of current removalMultiple
										// integer (using the remainder 0
										// property of multiples and factors)
					// add to 2nd friends arraylist (the non-eliminated list)
					friends2.add(friends1.get(l));
				}
			}

			// reset initial friends arraylist, in preparation to iterate
			// "round" process again
			friends1 = new ArrayList<Integer>();
			for (int d : friends2)
				// for each element in friends2
				friends1.add(d);// add into "new" initial list

		}

		// for each final friend in final initial list (friends1), print that
		// friend out
		for (int f : friends1)
			System.out.println(f);

		scann.close();
	}

}