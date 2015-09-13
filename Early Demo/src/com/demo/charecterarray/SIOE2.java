package com.demo.charecterarray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SIOE2 {

	public String readInput() throws IOException {
		System.out.println("Sentence?");
		BufferedReader stdin = new BufferedReader(new InputStreamReader(
		System.in));
		String inSentence = stdin.readLine().trim();
		return inSentence;
	}

	public boolean validateCharCount(String inSentence, int limit) {
		if (inSentence.length() > limit) {
			return true;
		} else {
			return false;
		}
	}

	public void printBackwards(String inSentence) {
		System.out.print("Your String Backwards Is: ");
		char[] abc = inSentence.toCharArray();
		int counter = inSentence.length();
		int i = counter  - 1;
		while (i > -1) {
			System.out.print(abc[i]);
			i--;
		}
	}
}
