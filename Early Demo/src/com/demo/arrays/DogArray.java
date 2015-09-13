package com.demo.arrays;

public class DogArray {

	public static void main(String[] args) {
		// Declare a array of Dog
		
		Dog[] aDogArray = new Dog[3];
		
		// Create a dog
		Dog aDog = new Dog();
		aDog.setLegs(4);
		aDog.setBreed("German Sheppard");
		
		aDogArray[0] = aDog;
		
		// Create another dog
		Dog bDog = new Dog();
		bDog.setLegs(3);
		bDog.setBreed("Golden Retriever");
	
		aDogArray[1] = bDog;
		
		// Create 3rd khuta
		Dog vidurDog = new Dog();
		vidurDog.setLegs(4000);
		vidurDog.setBreed("Poodle");
		
		aDogArray[2] = vidurDog;
		
		System.out.println("Dog 0");
		Dog printDog = aDogArray[0];
		System.out.println(printDog.getLegs());
		System.out.println(printDog.getBreed());
		
		System.out.println("Dog 1");
		System.out.println(aDogArray[1].getLegs());
		System.out.println(aDogArray[1].getBreed());
		
		System.out.println("Dog 2");
		System.out.println(aDogArray[2].getLegs());
		System.out.println(aDogArray[2].getBreed());
		
		
	}

}
