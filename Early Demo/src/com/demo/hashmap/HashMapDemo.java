package com.demo.hashmap;

import java.util.HashMap;

import com.demo.animals.Cat;
import com.demo.animals.Dog;

public class HashMapDemo {

	public static void main(String[] args) {

		// Declare HashMap
		HashMap animalMap = new HashMap();

		// Create objects
		// Create a dog
		Dog aDog = new Dog();
		aDog.setLegs(4);
		aDog.setBreed("German Sheppard");

		// Create a cat
		Cat aCat = new Cat();
		aCat.setLegs(4);
		aCat.setName("Richard Parker");

		// Set value in HashMap
		animalMap.put("dog", aDog);
		animalMap.put("cat", aCat);

		// Print HashMap values
		Dog dogOut = (Dog)animalMap.get("dog");
		Cat catOut = (Cat)animalMap.get("cat");
		System.out.println("Dog Breed:" + dogOut.getBreed());
		System.out.println("Cat Name:" + catOut.getName());

	}
}
