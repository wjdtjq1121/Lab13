package edu.handong.csee.java.lab13.prob5; // set the package where this belongs to 

import java.util.Scanner; // bring the scanner class from java library

public class Prob5 { // a class which can access from other package

	public static boolean equals(int[][] m1, int[][] m2) { // static boolean method, has two 2d array input
		int count=0; // declares count member as zero
		if(m1.length != m2.length) // if the number of row is different, return false
			return false; // if condition is true return false
		
		for(int i=0; i < m1.length; i++) // executing for loop starting from 0 to m1.length
		{
			for(int j=0; j < m1[i].length; j++) // executing for loop start
			{
				if(m1[i][j] != m2[i][j]) // condition if 2d array are same or not
					count++; // not same add 1 value
			}
		}
		if(count <= 3) // condition if count is less than 3
			return true; // return true
		else return false; // otherwise false
		
	}
		
	public static void main(String[] args) { // a void method, invoked by the system
		int n1, n2 = 0; // declares two member type int
		Scanner keyboard = new Scanner(System.in); // creating a thing so the program can accept keyboard input
		System.out.print("Enter row size(maximum 5): "); // print the statement max 5 row size
		n1 = keyboard.nextInt(); // getting n1 member value
		System.out.print("Enter column size(maximum 5): "); // print the statement max 5 size colum
		n2 = keyboard.nextInt(); // getting n2 member value
		int[][]m1 = new int[n1][n2]; // declare an 2d array with the size of n1 and n2
		
		System.out.print("Enter row size(maximum 5): "); // ask user to put row value max 5
		n1 = keyboard.nextInt(); // getting n1 value
		System.out.print("Enter column size(maximum 5): "); // ask user to put column value max 5
		n2 = keyboard.nextInt(); // getting n2 value
		int[][] m2 = new int[n1][n2]; // declare an 2d array with the size of n1 and n2
		System.out.print("Enter List1: "); // ask user to put list
		for(int i=0; i < m1.length; i++) // executing for loop starting from 0 to m1.length
			for(int j=0; j < m1[i].length; j++) // executing for loop starting from 0 to m1[i].length
				m1[i][j] = keyboard.nextInt(); // getting list value
		System.out.print("Enter list2: "); // ask user to put list2 
		for(int i=0; i < m2.length; i++) { // executing for loop starting from 0 to m2.length
			for(int j=0; j < m2[i].length; j++) // executing for loop starting from 0 to m2[i].length
				m2[i][j] = keyboard.nextInt(); // getting list2 value
		}
		for(int i=0; i < m1.length; i++) { // executing for loop starting from 0 to m1.length
			for(int j=0; j < m1[i].length; j++) // executing for loop starting from 0 to m1[i].length
				System.out.print(m1[i][j] + " "); // print the list value with space
			System.out.println(); // prints new line
		}
		System.out.println(); // prints new line
		for(int i=0; i < m2.length; i++) { // executing for loop from 0 to m2.length
			for(int j=0; j < m2[i].length; j++) // executing for loop from 0 to m2[i].length
				System.out.print(m2[i][j] + " "); // print list2 value with space
			System.out.println(); // print new line
		}
		System.out.println(); // print new line
		
		if(equals(m1, m2)) // condition if m1 and m2 are equal
			System.out.println("The two arrays are approximately identical."); // print the specific statement
		else // otherwise
			System.out.println("The two arrays are not identical");	// print the specific statement
	}
}
