package edu.handong.csee.java.lab13.prob2; //set the package where this belongs to

public class Book { // a class which can access from other package

	private static int idCount = 0; // static idcount member has 0 value
	private String bookName; // declare string bookname member
	private int id; // decalre private int id member
	public Book(String Name) // constructor, executes when there is a new instance in book class, has input value string name
	{ 
		this.bookName = Name; // stores input name value in bookname member;
		idCount++; // increases size 1 idcount
		id = idCount; // stores the idcount value in id;
	}

	public String toString() // this method has string return value, and no input value for this method
	{
		return "\n\tId: " + id + "\n\tBook Name: " + bookName;	//return the statement id and id value and book name and book name value;
	}

	public void show() // method has no input value and return value
	{
		System.out.println("<<Book>>" + this.toString()); // print the statement book and calls tostring method
	}

}
