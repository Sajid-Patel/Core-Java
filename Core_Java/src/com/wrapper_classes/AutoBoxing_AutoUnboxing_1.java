package com.wrapper_classes;
/*
 AutoBoxing & AutoUnboxing = introduced in java 1.5 

AutoBoxing= Automatic conversion of Primitive to Wrapper object 
Internally uses valueOf()  method

AutoUnboxing= Automatic conversion of Wrapper object to Primitive
Internally uses xxxvalue()  method


Primitive or String -----> Wrapper Object : Constructor or valueOf()
      Integer i = Integer.valueOf(10); //Without AutoBoxing
      Integer i = 10; //With AutoBoxing

Wrapper Object -----> Primitive : xxxvalue()
      int x = i.intvalue();      //Without AutoUnboxing
      int x = new Integer(10);  //With AutoUnboxing


 */
public class AutoBoxing_AutoUnboxing_1 {

	public static void main(String[] args) {
		
		 Integer i = Integer.valueOf(10); //Without AutoBoxing
	     System.out.println(i); 
		 
		 int x = new Integer(100);  //With AutoUnboxing
		 System.out.println(x);
	}

}
