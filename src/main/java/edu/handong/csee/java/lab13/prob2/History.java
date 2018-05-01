package edu.handong.csee.java.lab13.prob2; // set the package where this belongs to 

public class History extends Book{ // a class history inherits book, this can access from other package

	private String author; // declares the member author string type

	public History(String name, String author) { // constructor executes when this instance is created has name, author input value
		super(name); // executes parent class constructor
		this.author = author;  // stores author input value in author value in history.
	}

	public String toString() // this method no input value and has string type return value
	{
		return super.toString() + "\n\tAuthor: " + author; // returns parent tostring method and author value 
	}

	public void show() // method no return value and input value
	{
		System.out.println("<<History>>" + this.toString()); // print the statement and call tostring method
	}

}
