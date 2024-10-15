package com.sp.corejavatrial;

public class TestStaticBlock1 {
	
	TestStaticBlock1()
	{
		System.out.println("0 arg con");
	}
	
	TestStaticBlock1(int a)
	{
		System.out.println("1 arg con");
	}
	
	
	// Instance block is executed during obj is created
	// as many objs are created that much time Instance block will b executed
	{
		System.out.println("Instance Block-1");
	}
	
	{
		System.out.println("Instance Block-2");
	}
	
	
	//Static block is executed only once during .class file loading
	// Static block will b executed first
	static{
		System.out.println("Static Block-1");
	}
	
	static{
		System.out.println("Static Block-2");
	}
	
	

	
	public static void main(String[] args) {
		
		new TestStaticBlock1();     //nameless obj
		new TestStaticBlock1(10);   //nameless obj
	}

}
