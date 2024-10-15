package com.polymorphism;

public class TestConstructorOverloading {

	
	TestConstructorOverloading(int a)
	{
		System.out.println("int m1 con");
	}
	 
	TestConstructorOverloading(int a,int b)
	{
		System.out.println("int,int  m1 con");
	}
		
	TestConstructorOverloading(char a)
	{
		System.out.println("char m1 con");
	}
	 
	public static void main(String[] args) {
		new TestConstructorOverloading(10);
		new TestConstructorOverloading(10,20);
		new TestConstructorOverloading('P');

	}

}
