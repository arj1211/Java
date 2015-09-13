package com.demo.loops;

		public class DoWhileLoop {

			public static void main(String[] args) {
				
	String[] troll= new String[2];			
	int i = 0;
	
	troll[0] = "lol";
	troll[1] = "trolololo";
	
	do {
		System.out.println(troll[i]);
		i++;
		System.out.println(troll[i]);
		if (i == 1){
			i = 0;
		}
		
		} while (i<2);
	
			
	}

}			
