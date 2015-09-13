package com.demo.constant;

public class Constants {

	private static int CHAIR_LEGS = 4;
	private static int TABLE_LEGS = 6;
	private static int NO = 0;
	
	public static int getLegs(Object obj){
		if (obj instanceof Chair )//is the object an instance of Chair? or is it of type Chair?
			{
			return CHAIR_LEGS;
		} else if (obj instanceof Table )//is the object an instance of Table or is it of type Table?
			{
			return TABLE_LEGS;
		}
		return NO;
	}
	
}

