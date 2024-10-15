package com.polymorphism.overriding;

       //Total 8 rules of overriding
/* Overriding Rule-1=
overriden method signature and overridinng method signature must be same
*/
            //P-Parent & C-Child


public class Rule_1C extends Rule_1P
{
         void marry() //overriding method
    {
	System.out.println("red grl");
	}
      //if we comment void marry() method in Rule_1C o/p will be "black grl"
         
         
public static void main (String [] args) 
    {
	new Rule_1C().marry();
	}
}
