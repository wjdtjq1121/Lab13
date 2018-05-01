package edu.handong.csee.java.lab13.prob1; // set the package where this belongs to

public class Prob1 { // a class which can access from other package

	public static void main(String[] args) { // a void method, invoked by the system

		Friend friend1 = new Friend(); // creating a thing friend1 in prob1 class
		SchoolFriend friend2 = new SchoolFriend(); // creating friend2 in prob1 class
		ClassFriend friend3 = new ClassFriend(); // creating friend3 in prob1 class

		InstanceOf.whatFriend(friend1); // calls whatfriend in instanceof class, put friend 1 as input
		InstanceOf.whatFriend(friend2); // calls whatfriend in instanceof class, put friend 2 as input
		InstanceOf.whatFriend(friend3); // calls whatfriend in instanceof class, put friend 3 as input


	}

}
