package com.demo.charecterarray;

import java.io.IOException;

public class SIOE2Main {

	public static void main(String[] args) throws IOException {
		
		SIOE2 runner = new SIOE2();
		
		String inSentence = runner.readInput();
		runner.validateCharCount(inSentence, 120);
		runner.printBackwards(inSentence);
		
		
	}

}
