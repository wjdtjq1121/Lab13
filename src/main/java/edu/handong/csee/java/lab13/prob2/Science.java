package edu.handong.csee.java.lab13.prob2; // set the package where this belongs to

public class Science extends Book{ // a class which can access from other package, it inherits book class

	private String publisher; // decalres the string type publisher member

	public Science(String name, String publisher) // a constructor, has name, publisher
	{
		super(name); // calls parent constructor
		this.publisher = publisher; // stores publisher value in science publisher member
	}

	public String toString() // method no input value, has string type return value
	{
		return super.toString() + "\n\tPublisher: " + publisher; // calling tostring method and returns publisher value
	}

	public void show() // method no input, return value. 
	{
		System.out.println("<<Science>>" + this.toString()); // prints the statement science and call tostring method.
	}

}
