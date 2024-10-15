package com.sp.corejavatrial;

public class TestNameNamelessObj {
	TestNameNamelessObj() 
	{
		System.out.println("0-arg con");	
	}
	
	TestNameNamelessObj(int a)
	{
		System.out.println("1-arg con");	
	}
	
	TestNameNamelessObj(int a,int b)
	{
		System.out.println("2-arg con");
	}
	
	public static void main(String[] args) {
		//Named Approach 
		TestNameNamelessObj t1= new TestNameNamelessObj();
		TestNameNamelessObj t2= new TestNameNamelessObj(10);
		TestNameNamelessObj t3= new TestNameNamelessObj(20,30);
		
		
		//Nameless Approach
		new TestNameNamelessObj();
		new TestNameNamelessObj(10);
		new TestNameNamelessObj(20,30);
	}


}
