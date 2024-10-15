package com.string_manipulation;
/*
 Case 6] String to StringBuffer
    	 StringBuffer to String
 */
public class Case6 {

	public static void main(String[] args) {
		
		//String to StringBuffer
		String str="Sajid";
		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb.reverse());
		
		
   	    //StringBuffer to String
		StringBuffer sb1=new StringBuffer("Patel");
		String ss=sb1.toString();
		System.out.println(ss);
	}

}
