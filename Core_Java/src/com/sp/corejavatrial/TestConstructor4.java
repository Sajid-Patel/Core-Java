package com.sp.corejavatrial;

public class TestConstructor4 {
	//Constructor Calling eg
	//constructor can only call one constructor at a time because only one "this" keyword is allowed
	
	TestConstructor4() 
	{
		this(10);
		// this(10); //will give error
		System.out.println("0-arg con");	
	}
	
	TestConstructor4(int a)
	{
		this(10,20);
		System.out.println("1-arg con");	
	}
	
	TestConstructor4(int a,int b)
	{
		System.out.println("2-arg con");
	}
	
	public static void main(String[] args) {
		
		TestConstructor4 t= new TestConstructor4();
	}

}
