package com.multithreading;
//Approach 1> Class Extends 

//To reduce length of code we have Anonymous Inner Class Concept 

public class AnonymousInnerClass1 {

	public static void main(String[] args) {

		Thread t1 = new Thread();
		{
			System.out.println("First Thread");
		}
		; // semicolon is mandatory here

		Thread t2 = new Thread();
		{
			System.out.println("Second Thread");
		}
		; // semicolon is mandatory here

		t1.start();
		t2.start();

	}

}
