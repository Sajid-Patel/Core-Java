package com.string_manipulation;

/*
 
 Case 2b]
 
 1 approach to create StringBuffer object
 
 a>By using new operator
 			 
 */
public class Case2b {

	public static void main(String[] args) {
		//a>By using new operator
		
		String s1="Sajid";
		System.out.println(s1);
		
		
		String s2=new String("Patel");
		System.out.println(s2);

		StringBuffer sb1= new StringBuffer("Engineer");
		System.out.println(sb1);
	}

}
