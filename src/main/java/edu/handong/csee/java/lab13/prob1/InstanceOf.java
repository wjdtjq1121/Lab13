package edu.handong.csee.java.lab13.prob1; // set the package where this belongs to

public class InstanceOf { // a class which can access from other package


	public static void isWhatFriend(Friend friend)  // static void method whatfriend, has input as a class and it has no return value
	{

		if(friend instanceof ClassFriend) // a condition if friend is a type of classfriend
			((ClassFriend)friend).isClassFriend(); // calls classfriend method in classfriend class
		else if(friend instanceof SchoolFriend) // a condition if friend is a type of schoolfriend 
			((SchoolFriend)friend).isSchoolFriend(); // calls schoolfriend method in schoolfriend class
		else friend.isJustFriend(); // otherwise, call justfriend method


	}



}
