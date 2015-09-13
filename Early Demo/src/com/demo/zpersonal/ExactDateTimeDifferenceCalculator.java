package com.demo.zpersonal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ExactDateTimeDifferenceCalculator {

	public static void main(String[] args) {

		System.out
				.println("Welcome to Arjun's Date-Time Difference Calculator!");
		System.out
				.println("Enter First Date in format MM/DD/YYYY_HH:MM (hours in 24h format, underscore needed): ");

		Scanner scan1 = new Scanner(System.in);
		SimpleDateFormat myFormat1 = new SimpleDateFormat("MM/dd/yyyy_HH:mm");
		String inDateString1 = scan1.nextLine();

		System.out
				.println("Enter Second Date in format MM/DD/YYYY_HH:MM (hours in 24h format, underscore needed): ");

		Scanner scan2 = new Scanner(System.in);
		SimpleDateFormat myFormat2 = new SimpleDateFormat("MM/dd/yyyy_HH:mm");
		String inDateString2 = scan2.nextLine();

		Date myDater1 = null, myDater2 = null;

		try {
			myDater1 = myFormat1.parse(inDateString1);
			myDater2 = myFormat2.parse(inDateString2);
			scan1.close();
			scan2.close();

		} catch (ParseException | NullPointerException e) {
			System.out
					.println("Wrong Date Format! use MM/DD/YYYY_HH:MM (hours in 24h format)");

		}

		System.out.println(myDater1);
		System.out.println(myDater2);

		float diff = myDater2.getTime() - myDater1.getTime();

		System.out.println("Milliseconds: " + diff);

		float millisInYear = (long) (1000 * 60 * 60 * 24 * 365.25);
		float millisInDay = 1000 * 60 * 60 * 24;
		float millisInHour = 1000 * 60 * 60;
		float millisInMinute = 1000 * 60;

		float diffYear = diff / millisInYear;

		float diffYearRem = diff % millisInYear;

		float diffDay = (diffYearRem / millisInDay);

		if (diffDay > 364) {
			diffYear++;
			diffDay = diffDay - 365;
		} 
		
		//else if (diffDay < 0) {
			//diffDay = 0;
		//}

		float diffDayRem = diff % millisInDay;

		float diffHour = (diffDayRem / millisInHour);

		float diffHourRem = diff % millisInHour;

		float diffMinute = (diffHourRem / millisInMinute);

		System.out.println("Years: " + (long) diffYear);
		System.out.println("Days: " + (long) diffDay);
		System.out.println("Hours: " + (long) diffHour);
		System.out.println("Minutes: " + (long) diffMinute);

	}

}
