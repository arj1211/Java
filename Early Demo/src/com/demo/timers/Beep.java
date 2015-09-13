package com.demo.timers;
import java.util.Timer;
//import java.awt.Toolkit;
/*
 * Schedule a task that executes once every second.
 */
public class Beep {
	//Toolkit toolkit;
	Timer timer;
	
	public Beep(){
		//toolkit = Toolkit.getDefaultToolkit();
		timer = new Timer();
		timer.scheduleAtFixedRate(new BeepTask(), 2 /* Initial delay) */, 1*1000 /* subsequent delay rate */);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("About to schedule task.");
		new Beep();
		System.out.println("Task Scheduled.");
	}
	

}
