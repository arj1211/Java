package thenewboston.beginner;

public enum Enumeration_44_45 {
	boy("small", "5"), 
	man("big", "26"), 
	girl("small", "6"), 
	woman("big", "25");

	private final String desc;
	private final String year;

	Enumeration_44_45(String description, String old) {
		desc = description;
		year = old;
	}

	public String getDesc() {
		return desc;
	}

	public String getYear() {
		return year;
	}

}
