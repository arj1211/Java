package com.demo.timers;
import java.util.TimerTask;

public class ReminderTask extends TimerTask {

	
	public void run(){
		System.out.println("Time's Up!");
		System.exit(0);
		
	}
}
