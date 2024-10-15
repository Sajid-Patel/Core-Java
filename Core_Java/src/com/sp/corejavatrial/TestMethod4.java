package com.sp.corejavatrial;

public class TestMethod4
{ //Instance variable
	int x=100;
	int y=200;
	void add (int x,int y) 
	 //local variable
	{
		System.out.println(x+y);
		System.out.println(this.x+this.y);
	}
	

	public static void main(String[] args) {

        TestMethod4 t= new TestMethod4();
              t.add(1000,2000);
	}

}
