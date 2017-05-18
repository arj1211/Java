import java.util.ArrayList;
import java.util.Collections;

public class Test1 {
	public static void main(String[] args) {

		ArrayList<String> aman = new ArrayList<String>(Collections.nCopies(
				1000, "aman kys"));
		for (String s:aman){
			System.out.println(s);
		}

	}
}
