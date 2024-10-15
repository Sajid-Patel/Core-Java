package com.polymorphism;

public class Testmethodoverloading {

	void m1(int a)
	{
		System.out.println("int m1 method");
	}
	
	void m1(int a,int b)
	{
		System.out.println("int,int  m1 method");
	}
	
	void m1(char a)
	{
		System.out.println("char m1 method");
	}
	
	public static void main(String[] args) throws  Exception {
	
		Testmethodoverloading T= new Testmethodoverloading();
		T.m1(10);
		T.m1(10,20);
		T.m1('S');
	}

}
