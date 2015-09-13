package thenewboston.intermediate.collections;

import java.util.Stack;

public class Stacks_Push_Pop_14 {

	public static void main(String[] args) {

		Stack<String> stack = new Stack<String>();

		System.out.println("Stack1:");
		stack.push("item1");
		printStack(stack);
		System.out.println("\nStack2:");
		stack.push("item2");
		printStack(stack);

		System.out.println("\nStack3:");
		stack.push("item3");
		printStack(stack);

		System.out.println("\nStack4:");
		stack.pop();
		printStack(stack);
		System.out.println("\nStack5:");
		stack.pop();
		printStack(stack);
		System.out.println("\nStack6:");
		stack.pop();
		printStack(stack);

	}

	private static void printStack(Stack<String> stack) {

		if (stack.isEmpty())
			System.out.println("Stack Empty");
		else
			System.out.printf("%s<--TOP\n", stack);

	}

}
