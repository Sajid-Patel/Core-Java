package com.sp.corejavatrial;

public class TestInstanceBlock1 {
	
	
	TestInstanceBlock1()
	{
		this(10);
		System.out.println("0-arg con");
	}
	
	TestInstanceBlock1(int a)
	{
		System.out.println("1-arg con");
	} 
	
	{
		System.out.println("Instance block-1");
	}
	
	 

	public static void main(String[] args) {
		
		new TestInstanceBlock1();
		
		
		
		
	}

}
