package thenewboston.intermediate.collections;

import java.util.*;

public class Collections_ArrayList_4_5 {

	public static void main(String[] args) {

		/*
		 * 
		 */

		String[] arr = { "eggs", "lasers", "hats", "pie" };

		List<String> list = new ArrayList<>();

		for (String x : arr)
			list.add(x);

		/*
		 * 
		 */

		String[] morearr = { "lasers", "hats" };

		List<String> list2 = new ArrayList<>();

		for (String y : morearr)
			list2.add(y);

		/*
		 * 
		 */

		System.out.println("List 1:");
		for (int i = 0; i < list.size(); i++)
			System.out.printf("%s ", list.get(i));

		//
		System.out.println("\n");
		//

		System.out.println("List 2:");
		for (int i = 0; i < list2.size(); i++)
			System.out.printf("%s ", list2.get(i));

		//
		System.out.println("\n");
		//

		System.out.println("List 1 minus 2:");
		editList(list, list2);

		for (int i = 0; i < list.size(); i++)
			System.out.printf("%s ", list.get(i));

	}

	private static void editList(Collection<String> list,
			Collection<String> list2) {

		// goes through each list-item in said collection
		Iterator<String> it = list.iterator();

		// while there is another item in the list
		while (it.hasNext())
			if (list2.contains(it.next())) // if the second list has the current
				it.remove(); // item being iterated upon from list 1,
								// remove it from the first list

	}

}
