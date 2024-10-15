package com.polymorphism.overriding;

/* 
Overriding Rule-2=
      overriden method return type & overriding method retuen must be same
 at primitive data type level, at class level it can be different
 */


public class Rule_2C extends Rule_2P{
float marry() //overriden method
// in above method instead of float marry() we use  int marry() it will give error
{
	System.out.println("red grl");
    return 10.5f;
}
	
	public static void main(String[] args)
	  {
	       new Rule_2C().marry();
      }
}