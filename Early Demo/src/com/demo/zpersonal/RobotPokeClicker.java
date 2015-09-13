package com.demo.zpersonal;

import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RobotPokeClicker {

	public static void main(String[] args) throws AWTException, IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(
				System.in));

		System.out.println("How many repetitions?");
		int repetitions = Integer.parseInt(read.readLine());
		System.out.println("Delay between them in millis?");
		int delay = Integer.parseInt(read.readLine());

		System.out
				.println("\n***READ***\n1. type 'OK' into this commandline window, DO NOT CLICK ENTER.\n2. hover your mouse over the EXACT spot you want the clicker to be at, ONLY HOVER, DO NOT CLICK\n3. with this commandline window still 'active', the word 'OK' typed in this window, AND your mouse HOVERING\n over the spot you want it to be at, FINALLY click enter button. \n **WARNING!** this program cannot terminate until all repetitions have been fullfilled, be VERY cautious;\n computer malfuction can arise. I, the creator of the program take no responsibility for any mishaps. \n*STRONG SUGGESTION*: set the # of repititions NO HIGHER than 1000 at a time, and the delay 500ms or higher");

		String answer = read.readLine();

		if (answer.equalsIgnoreCase("ok")) {

			PointerInfo pointer = MouseInfo.getPointerInfo();

			Point point = pointer.getLocation();
			Robot robot = new Robot();

			int x = (int) point.getX();
			int y = (int) point.getY();

			int counter;

			for (counter = 0; counter < repetitions; counter++) {

				robot.delay(10);
				robot.mouseMove(x, y);
				robot.mousePress(InputEvent.BUTTON1_MASK);
				robot.delay(2);
				robot.mouseRelease(InputEvent.BUTTON1_MASK);

				
				
				
				robot.delay(delay);
			}

			System.out.println("Thank you for using Arjun's automated poker!");
			robot.delay(5000);
			
		}

	}
}
