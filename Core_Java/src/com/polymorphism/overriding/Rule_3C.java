package com.polymorphism.overriding;


/* 
Overriding Rule-3=
Covarient return type concept---It is possible to change return type at class level

Meaning---
child class return type is child type and
parent class return type is parent type
 */

public class Rule_3C extends Rule_3P{

	
	Rule_3_Dog marry() //overriding method
  {
	System.out.println("red grl");
    return new Rule_3_Dog(); //child class return type is child type
  }
    
	public static void main(String[] args) 
	  {
          new Rule_3C().marry();
        
	  }

}

