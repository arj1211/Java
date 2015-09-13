package thenewboston.intermediate.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Methods_Reverse_Copy_Fill_10_11 {

	public static void main(String[] args) {

		Character[] array = { 'p', 'w', 'n' };

		List<Character> l = Arrays.asList(array);
		System.out.println("list: ");

		output(l);

		Collections.reverse(l);
		System.out.println("reversed list: ");
		output(l);

		Character[] newCharrry = new Character[3];

		List<Character> lCopy = Arrays.asList(newCharrry);

		Collections.copy(lCopy, l);
		System.out.println("copy of list: ");
		output(lCopy);

		Collections.fill(l, 'X');
		System.out.println("after fill with x: ");
		output(l);
	}

	private static void output(List<Character> l) {
		for (Character c : l)
			System.out.printf("%s ", c);
		System.out.println();

	}
}
