package com.wrapper_classes;

//Example 2] = wrapper object ----> primitive or String

public class Example2 {

	public static void main(String[] args) {
		
		Integer i1 = Integer.valueOf(100);
		Integer i2 = Integer.valueOf(100);
		
		
		//wrapper object to primitive data = xxxvalue()  { xxx=all data types }
        int x = i1.intValue();
        double d = i1.doubleValue();	
        System.out.println( x + d );
        
        
        //wrapper object to String = toString()
        String s1 = i1.toString();
        String s2 = i2.toString();
		System.out.println(s1 + s2);

	}

}
