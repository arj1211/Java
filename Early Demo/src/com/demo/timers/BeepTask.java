package com.demo.timers;
import java.awt.Toolkit;
import java.util.TimerTask;
public class BeepTask extends TimerTask {
	Toolkit toolkit;
	int numWarningBeeps = 3;
	
	public void run() {
		toolkit = Toolkit.getDefaultToolkit();
		if (numWarningBeeps > 0){
		toolkit.beep();
		System.out.println("Beep!");
		numWarningBeeps--;
		}
		else {
		toolkit.beep();
		System.out.println("Time's Up!");
		System.exit(0);
		
		}
	}	
}


