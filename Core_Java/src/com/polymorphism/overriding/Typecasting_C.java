package com.polymorphism.overriding;

public class Typecasting_C extends Typecasting_P {
	void m1() //overriding method
	{
	System.out.println("Child m1 method"); 	
	}
	
	void m2() //Direct method
	{
	System.out.println("Child m2 method"); 	
	}
	
	public static void main(String[] args) {
		
		Typecasting_P p= new Typecasting_C();
		p.m1();  // compile:parent    runtime:child
		//p.m2(); // compile parent   compiler error
		
		
		Typecasting_C c= (Typecasting_C)p;   
		c.m2();
		//((Typecasting_C) p).m2();  ----//direct way to typecast
	}

}
