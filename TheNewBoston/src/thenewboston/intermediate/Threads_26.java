package thenewboston.intermediate;

import java.util.Random;

public class Threads_26 implements Runnable {

	String name;
	int time;
	Random rand = new Random();;

	public Threads_26(String x) {
		name = x;
		time = rand.nextInt(999);

	}

	@Override
	public void run() {
		try {
			System.out.printf("%s is sleeping for %d\n", name, time);
			Thread.sleep(time);
			System.out.printf("%s is done sleeping\n", name);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
