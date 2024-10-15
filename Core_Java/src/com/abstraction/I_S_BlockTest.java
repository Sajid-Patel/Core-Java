package com.abstraction;
// It is possible to declare Static block & Instance Block
public abstract class I_S_BlockTest {
	I_S_BlockTest()
	{
		System.out.println("Abstract class constructor");
	}
	
	{
		System.out.println("Instance Block");
	}
	
	static {
		System.out.println("Static Block");
	}
}
