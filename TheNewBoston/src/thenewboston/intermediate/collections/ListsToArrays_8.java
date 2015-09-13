package thenewboston.intermediate.collections;

import java.util.Arrays;
import java.util.LinkedList;

public class ListsToArrays_8 {

	
	public static void main(String[] args) {
		
		String[] stuff = {"babies","watermelong","melOnz","fudge"}; //array
		
		
		LinkedList<String> theList = new LinkedList<String>(Arrays.asList(stuff)); //convert into list
		
		theList.add("pumpkinsdsf");
		theList.addFirst("thisisthefirstthinglol");
		
		stuff = theList.toArray(new String[theList.size()]); //back to array
		
		
		
		for (String s: stuff)
			System.out.printf("%s ",s);
		
		
	}
	
}
