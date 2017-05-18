import java.io.*;
public class AmanShit {
	static String first, second;
	static BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		System.out.println("Give first string");
		first = scan.readLine().trim();
		System.out.println("Give second string");
		second = scan.readLine().trim();
		if (first.compareToIgnoreCase(second) < 0)
			System.out.println(first+" "+second);
		else
			System.out.println(second+" "+first);		
		System.out.println(first.length()+second.length());
		System.out.println(first.toString().toUpperCase()+" "+second.toString().toLowerCase());
	}
}
