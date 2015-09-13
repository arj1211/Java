package thenewboston.intermediate;

public class StringMethods_1_2 {

	public static void main(String[] args) {

		String[] words = { "funk", "chunk", "furry", "baconator" };

		for (String s : words)
			if (s.startsWith("fu"))
				System.out.println(s + " starts with fu");
		for (String s : words)
			if (s.endsWith("unk"))
				System.out.println(s + " ends with unk");

		String s = "SOMETHINGSOMETHINGSOMETHING";

		System.out.println(s.indexOf("H"));
		System.out.println(s.indexOf("H", 9));
		System.out.println(s.indexOf("f"));
		System.out.println(s.indexOf("ETH", 5));

		String a = "Bacon";
		String b = "   Monster";

		System.out.println(a + b);
		System.out.println(a.concat(b));

		System.out.println(a.replace('B', 'F'));
		System.out.println(b.toUpperCase());
		System.out.println(b.trim());

	}

}
