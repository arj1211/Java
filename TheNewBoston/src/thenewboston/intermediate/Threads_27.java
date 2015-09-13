package thenewboston.intermediate;

public class Threads_27 {

	public static void main(String[] args) {

		Thread t1 = new Thread(new Threads_26("one"));
		Thread t2 = new Thread(new Threads_26("two"));
		Thread t3 = new Thread(new Threads_26("three"));
		Thread t4 = new Thread(new Threads_26("four"));

		t1.start();
		t2.start();
		t3.start();
		t4.start();

		
		
		
	}

}
