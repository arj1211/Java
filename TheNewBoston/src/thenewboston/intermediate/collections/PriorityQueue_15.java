package thenewboston.intermediate.collections;

import java.util.PriorityQueue;

public class PriorityQueue_15 {

	public static void main(String[] args) {

		PriorityQueue<String> queue = new PriorityQueue<String>();

		queue.offer("first");
		queue.offer("second");
		queue.offer("third");

		System.out.printf("%s ", queue);
		System.out.println();

		System.out.println(queue.peek());
		System.out.println();

		queue.poll();
		System.out.printf("%s ", queue);
		System.out.println();
		System.out.println(queue.peek());
	}
}
