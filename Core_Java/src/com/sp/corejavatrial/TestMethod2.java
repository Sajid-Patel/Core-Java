package com.sp.corejavatrial;
class X{}
class Emp{}
class Y{}
class  Students{}

public class TestMethod2 {
	void m1(X x,Emp e)
{
		System.out.println("m1 method");
}

static void m2(Y y, Students s)
{
	System.out.println("m2 method");
}


public static void main(String[] args) {
	TestMethod2 t= new TestMethod2();
	X x=new X();
	Emp e1= new Emp();
	t.m1(x,e1);
	// t.m1(new X(), new Emp()); 
	//above 3 line code suppressed into 1 line code  
	
	Y y=new Y();
	Students s=new Students();
	TestMethod2.m2(y,s);
	//TestMethod2.m2(new Y(), new Students()); above 3 line code suppressed into 1 line code
}


}
