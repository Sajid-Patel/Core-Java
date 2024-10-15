package com.polymorphism.overriding;
/* 
Overriding Rule-4=
    final methods overriding is not allowed
 */

public class Rule_4C extends Rule_4P{
	
	void marry() //overriding method
	    {
		System.out.println("red grl");
		}

	public static void main (String [] args) {
	    {
	    	new Rule_4C().marry();
	    	
	}
}
	}
