import java.util.Scanner;


 class Main {

	public static int countSubs(String substr, String string){
		return (string.length() - string.replace(substr, "").length()) / substr.length();
	}
	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String input = scan.nextLine();
		scan.close();
		
		String happy = ":-)";
		String sad = ":-(";
		

		if (countSubs(happy,input)>countSubs(sad,input)){
			System.out.println("happy");
		} else if (countSubs(happy,input)<countSubs(sad,input)){
			System.out.println("sad");
		} else if (countSubs(happy,input)==countSubs(sad,input) && countSubs(happy,input)!=0 || countSubs(sad,input)!=0){
			System.out.println("unsure");
		} else if (countSubs(happy,input)==0 && countSubs(sad,input)==0){
			System.out.println("none");
		}
		
		
		
	}

}
