package com.sp.corejavatrial; 


public class Test {

	Test()
	{
		this(10);
		System.out.println("0 arg con");	}
	
	Test(int a)
	{
		System.out.println("1 arg con");
	}
	
	
	{
		
		System.out.println("Instance Block-1");
	}
	
	{
		System.out.println("Instance Block-2");
	}
	
	
	static{
		System.out.println("Static Block-1");
	}
	
	static{
		System.out.println("Static Block-2");
	}
	
	public static void main(String[] args) {
		new Test().m1();
	
	    Test.m2();
		 
	}

	

	void m1() {
		
		System.out.println("m1 method");
	}
	
	static void m2()
	{
		System.out.println("m2 method");
	}
	
	
	
		          }


