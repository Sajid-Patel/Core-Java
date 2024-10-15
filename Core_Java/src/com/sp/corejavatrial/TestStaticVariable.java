package com.sp.corejavatrial;

public class TestStaticVariable {
	//static var
		static int a =1000;
		static int b =2000; 
		 // static method
		public static void main(String[] args) 
		{
		//static area
		
			System.out.println(TestStaticVariable.a);
			System.out.println(TestStaticVariable.b);
			TestStaticVariable t = new TestStaticVariable();
			t.m1();
			
		}
		
		//instance method
		
		void m1()
		{
			//instance area
			
			System.out.println(TestStaticVariable.a);
			System.out.println(TestStaticVariable.b);
		}

	}
