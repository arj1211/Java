package thenewboston.intermediate.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AddAll_Frequency_Disjoint_12_13 {

	public static void main(String[] args) {

		String[] stuff = { "apples", "beef", "corn", "ham" };

		List<String> list1 = Arrays.asList(stuff);

		ArrayList<String> list2 = new ArrayList<String>();

		list2.add("utube");
		list2.add("google");
		list2.add("idk");

		System.out.println("list1:");
		for (String s : list2)
			System.out.printf("%s ", s);
		System.out.println();
		Collections.addAll(list2, stuff);

		System.out.println("list2:");
		for (String s : list2)
			System.out.printf("%s ", s);
		System.out.println();

		// number of times 'idk' appears in list2
		String testme = "idk";
		System.out.printf("freq of %s: ", testme);
		System.out.println(Collections.frequency(list2, testme));

		// true if list1 & list2 have no elements in common
		System.out.print("have nothing in common?: ");
		boolean torf = Collections.disjoint(list1, list2);
		System.out.println(torf);

		if (torf)
			System.out.println("lists dont have anything in common");
		else
			System.out.println("lists have something in common");

	}

}
