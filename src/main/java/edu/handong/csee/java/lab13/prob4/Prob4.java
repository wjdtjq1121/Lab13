package edu.handong.csee.java.lab13.prob4; // set the package where this belongs to

import java.util.Scanner; // bring the scanner class from java library

public class Prob4 { // class which can access from other package

	public void feed(Pet pet) // void method has pet interface as input value
	{
		System.out.println("feed: " + pet.food()); // print the statement feed and call food method
	}


	public static void main(String[] args) { // a void method, invoked by the system.

		String catName, dogName; // declares two members

		Prob4 master = new Prob4(); // creating a thing so we can use prob 4 instance
		Cat cat = new Cat(); // creating a thing an instance from cat class
		Dog dog = new Dog(); // creaing a thing an instance from dog class

		Scanner keyboard = new Scanner(System.in); // creating a thing so we can get system input
		System.out.print("Enter the cat name and dog name: "); // print the statement to ask the user put cat and dog name
		catName = keyboard.next(); // getting cat name
		dogName = keyboard.next(); // getting dog name

		cat.setName(catName); // putting catname, call setname method
		cat.getName(); // getting cat's name call getname method
		master.feed(cat); //  call feed method, put cat instance as input value

		dog.setName(dogName); // call setname method, put dogname as input
		dog.getName(); // call getname method
		master.feed(dog); // call feed method, put dog instance as input value
	}

}
