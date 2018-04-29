package edu.handong.csee.java.lab13.prob2;

public class Book {

	private static int idCount = 0;
	private String bookName;
	private int id;
	public Book(String Name)
	{
		this.bookName = Name;
		idCount++;
		id = idCount;
	}
	
	public String toString() 
	{
	return "\n\tId: " + id + "\n\tBook Name: " + bookName;	
	}

	public void show()
	{
		System.out.println("<<Book>>" + this.toString());
	}
	
}
