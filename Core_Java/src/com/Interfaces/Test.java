package com.Interfaces;

public class Test implements IT {

	public void m1()
	{System.out.println("m1 method"); }
	
	public void m2()
	{System.out.println("m2 method"); }
	
	public void m3() 
	{System.out.println("m3 method"); }
	
	public static void main(String[] args)
	  {
	Test t= new Test();
	t.m1();
	t.m2();
	t.m3();
	
	//alternate method
	IT i=new Test();  //----- Parent p = newChild();
	i.m1();
	i.m2();
	i.m3();
	
      }
} 