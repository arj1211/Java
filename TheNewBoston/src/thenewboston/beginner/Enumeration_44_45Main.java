package thenewboston.beginner;

import java.util.EnumSet;

public class Enumeration_44_45Main {

	public static void main(String[] args) {
		for (Enumeration_44_45 en0 : Enumeration_44_45.values())
			System.out
					.printf("%s\t%s\t%s\n", en0, en0.getDesc(), en0.getYear());

		System.out.println("\nAnd Now for the range of constants...\n");

		for (Enumeration_44_45 en0 : EnumSet.range(Enumeration_44_45.man,
				Enumeration_44_45.girl))
			System.out
					.printf("%s\t%s\t%s\n", en0, en0.getDesc(), en0.getYear());

	}
}