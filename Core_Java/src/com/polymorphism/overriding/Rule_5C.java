package com.polymorphism.overriding;


/* Overriding Rule-5= [Method hiding concept]
Static method overriding is not possible because static methods are specific 
to class but not specific to objects
*/

/*
IMP NOTE---
class Parent{
}

class Child{
}

Parent p = new Parent(); //valid
Child  c = new Child(); //valid
Parent p = new Child(); //valid      --Parent class reference variable is able to hold Child class object 
Child  c = new Parent(); //invalid   -- Child class reference variable is unable to hold Parent class object
*/

public class Rule_5C extends Rule_5P {

	static void m1() //overriding method
    {
	System.out.println("Child m1 method");  
	}
	public static void main(String[] args) {
		
		Rule_5P P= new Rule_5C();
		P.m1();
	}

}
