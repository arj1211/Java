package thenewboston.intermediate.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsMethodSort_9 {

	public static void main(String[] args) {
		
		String[] crap = {"apples","lemons","geese","bacon","youtube"};
		
		List<String> l1 = Arrays.asList(crap);
		
		Collections.sort(l1);
		System.out.printf("Alphabetical: %s\n",l1);
		
		
		Collections.sort(l1, Collections.reverseOrder());
		System.out.printf("Reverse Alphabetical: %s\n",l1);
		
		
		
	}
	
	
}
