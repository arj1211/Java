package com.demo.timers;
import java.util.Timer;

public class Reminder {
/*
 * Simple demo that uses java.util.Timer to schedule a task
 * to execute once 5 seconds have passed.
 * @param args
 */
	

	Timer timer;
	
	public Reminder(int seconds, ReminderTask task){
		timer = new Timer();
		timer.schedule(task, seconds*1000);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReminderTask task = new ReminderTask();
		Reminder reminder = new Reminder(5, task);
		System.out.println("Task Scheduled.");
	}

}
