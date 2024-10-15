package com.string_manipulation;
/*
 
  Case3]
  
 */
public class Case3 {

	public static void main(String[] args) {
		
	//immutable in nature
    String s1="Sajid";
	s1.concat("Patel");
	System.out.println(s1);

	//mutable in nature
	StringBuffer sb1= new StringBuffer("Engineer");
	sb1.append(" Pune");
	System.out.println(sb1);
	
	
	}

}
