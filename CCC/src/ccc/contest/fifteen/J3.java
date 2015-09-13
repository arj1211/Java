import java.util.Scanner;


 class Main {

	public static char vowelOf(char inputLetter){
		
		switch (inputLetter){
			case 'a': return 'a';
			case 'b': return 'a';
			case 'c': return 'a';
			case 'd': return 'e';
			case 'e': return 'e';
			case 'f': return 'e';
			case 'g': return 'e';
			case 'h': return 'i';
			case 'i': return 'i';
			case 'j': return 'i';
			case 'k': return 'i';
			case 'l': return 'i';
			case 'm': return 'o';
			case 'n': return 'o';
			case 'o': return 'o';
			case 'p': return 'o';
			case 'q': return 'o';
			case 'r': return 'o';
			case 's': return 'u';
			case 't': return 'u';
			case 'u': return 'u';
			case 'v': return 'u';
			case 'w': return 'u';
			case 'x': return 'u';
			case 'y': return 'u';
			case 'z': return 'u';
			
		
		
		
		}
		return ' ';
		
	}

	public static char consonance(char inputLetter){
		switch (inputLetter){
		case 'a': return 'a';
		case 'b': return 'c';
		case 'c': return 'd';
		case 'd': return 'f';
		case 'e': return 'e';
		case 'f': return 'g';
		case 'g': return 'h';
		case 'h': return 'j';
		case 'i': return 'i';
		case 'j': return 'k';
		case 'k': return 'l';
		case 'l': return 'm';
		case 'm': return 'n';
		case 'n': return 'p';
		case 'o': return 'o';
		case 'p': return 'q';
		case 'q': return 'r';
		case 'r': return 's';
		case 's': return 't';
		case 't': return 'v';
		case 'u': return 'u';
		case 'v': return 'w';
		case 'w': return 'x';
		case 'x': return 'y';
		case 'y': return 'z';
		case 'z': return 'u';
	}
		return ' ';
	
	}
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String input = scan.nextLine().trim();
		scan.close();
		
		String output="";
		
		
		forLoop:
		for (int w=0; w<input.length();w++){
			if (input.charAt(w)!='a'||input.charAt(w)!='e'||input.charAt(w)!='i'||input.charAt(w)!='o'||input.charAt(w)!='u'){
				
				output+=""+input.charAt(w);
				output+=""+vowelOf(input.charAt(w));
				output+=""+consonance(input.charAt(w));
			
			
			}else /*if (input.charAt(w)=='a'||input.charAt(w)=='e'||input.charAt(w)=='i'||input.charAt(w)=='o'||input.charAt(w)=='u')
			*/	output+=""+input.charAt(w);
		}
		
		output= output.replaceAll("aa", "");
		output= output.replaceAll("ee", "");
		output= output.replaceAll("ii", "");
		output= output.replaceAll("oo", "");
		output= output.replaceAll("uu", "");
		
		
		
		
		System.out.println(output);
		
		
		
		
	}

}
