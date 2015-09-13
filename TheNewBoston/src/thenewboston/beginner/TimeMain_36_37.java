package thenewboston.beginner;

public class TimeMain_36_37 {

	public static void main(String[] args) {
			Time_36_37 timeObj = new Time_36_37();
			System.out.println(timeObj.toMilitary());
			timeObj.setTime(13, 27, 6);
			System.out.println(timeObj.toMilitary());
			
			Time_36_37 timeObj2 = new Time_36_37();
			System.out.println(timeObj2.toString());
			timeObj2.setTime(13,27,6);
			System.out.println(timeObj2.toString());
			
	}

}
