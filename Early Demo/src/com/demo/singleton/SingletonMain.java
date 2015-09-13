package com.demo.singleton;

public class SingletonMain {

	public static void main(String[] args) {
		
		Singleton singleton = Singleton.getInstance();
		System.out.println(singleton.work());
		
		Singleton singleton2 = Singleton.getInstance();
		System.out.println(singleton2.work());
	}

}
