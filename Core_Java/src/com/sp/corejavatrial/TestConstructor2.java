package com.sp.corejavatrial;

public class TestConstructor2 {
	
	void m1()    
    { 
	System.out.println("m1 method");
    }
	
	TestConstructor2()    
    { 
	System.out.println("0-arg constructor");
    }
	
	TestConstructor2(int a)    
    { 
	System.out.println("1-arg constructor");
    }

	public static void main(String[] args) {
		TestConstructor2 t= new TestConstructor2();
		TestConstructor2 t1= new TestConstructor2(10);
		t.m1();
		
		
	}

}
