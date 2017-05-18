import java.io.*;
import java.util.*;

public class ParseSomething {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner sc = new Scanner(new FileReader(new File(
				"C:\\Users\\Arjun\\Downloads\\somedata2.txt")));

		while(sc.hasNextLine()){
			String s[] = sc.nextLine().split(" ");
			
			System.out.println(s[1]);
			
		}
		
		
	}

}
