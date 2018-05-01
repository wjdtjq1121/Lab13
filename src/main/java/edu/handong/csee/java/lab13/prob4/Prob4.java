package edu.handong.csee.java.lab13.prob4;

import java.util.Scanner;

public class Prob4 {

	public void feed(Pet pet)
	{
		System.out.println("feed: " + pet.food());
	}


	public static void main(String[] args) {

		String catName, dogName;

		Prob4 master = new Prob4();
		Cat cat = new Cat();
		Dog dog = new Dog();

		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the cat name and dog name: ");
		catName = keyboard.next();
		dogName = keyboard.next();

		cat.setName(catName);
		cat.getName();
		master.feed(dog);

		dog.setName(dogName);
		dog.getName();
		master.feed(dog);
	}

}
