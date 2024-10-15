package com.sp.corejavatrial;

public class TestInstanceVariable {
//Instance variable [object created ---> object destroyed]

	int a =100;
	int b =200; 
	 // static method
	public static void main(String[] args) 
	{
	//static area
		TestInstanceVariable t = new TestInstanceVariable();
		System.out.println(t.a);
		System.out.println(t.b);
		t.m1();
		
	}
	
	//instance method
	
	void m1()
	{
		//instance area
		
		System.out.println(a);
		System.out.println(b);
	}

}
