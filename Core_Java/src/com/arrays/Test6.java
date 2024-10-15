package com.arrays;

public class Test6 {

	int[] m1() //method return type is array
	{System.out.println("m1 Method");
	int[] a= {10,20,30,40,50,60};
		return a;	
	}
	
	void m2(double d[])  //method argumment is array
	{
		System.out.println("m2 Method");
		for(double dd:d)
		{
			System.out.println(dd);
		}
	}
	
	
	public static void main(String[] args) {
		Test6 t =new Test6();
		int[] x=t.m1();
		for(int xx:x) {
			System.out.println(xx);
		}
		
		double[] d= {10.5,20.5,30.5,40.5};
		t.m2(d);

	}

}
