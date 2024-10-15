package com.polymorphism.overriding;

public class Rule_3P  {
	Rule_3_Animal marry()  //overriden method
	{
		System.out.println("black grl");
		 return new Rule_3_Animal(); //parent class return type is parent type
	}
}
