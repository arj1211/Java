package com.demo.charecterarray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringInputOutputError {

	public static void main(String[] args) throws IOException {

		BufferedReader stdin = new BufferedReader(new InputStreamReader(
				System.in));

		System.out.println("Sentence?");

		String inSentence = stdin.readLine().trim();

		int counter = inSentence.length();

		char[] abc = inSentence.toCharArray();

		int i = counter - 1;

		if (inSentence.length() > 35) {

			System.out.println("Sentence Longer Than 35 chars. TOO LONG!!");

		} else if (inSentence.length() <= 35) {

			System.out.print("Your String Backwards Is: ");

			while (i > -1) {
				System.out.print(abc[i]);
				i--;
			}

		}
	}
}
