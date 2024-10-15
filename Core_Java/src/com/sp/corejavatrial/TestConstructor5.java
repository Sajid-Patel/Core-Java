package com.sp.corejavatrial;

public class TestConstructor5 {
	//Constructor Calling eg
	
		TestConstructor5() 
		{
			System.out.println("0-arg con");
			this(10);  //Constructor call must be the first statement in a constructor
		}
		
		TestConstructor5(int a)
		{
			System.out.println("1-arg con");
			this(10,20);
		}
		
		TestConstructor5(int a,int b)
		{
			System.out.println("2-arg con");
		}
		
		public static void main(String[] args) {
			
			TestConstructor5 t= new TestConstructor5();
		}


}
