package com.string_manipulation;

/* String vs String Buffer
  
 Case 1] 
 Both are final Classes present in java.lang Package
 
 Case 2a]
 2 Approaches to create String Objects
 
 a> Without using new operator----> Stored in SCP memory=String Constant Pool
 b> With using new operator-------> Stored in Heap Memory
 
 */
public class Case1and2a{

	public static void main(String[] args) {
		
		//a> Without using new operator
        String s1="Sajid";
        String s2="Patel";
        String s3="Sajid";


       //b> With using new operator
       String s4=new String("Sajid");
       String s5=new String("Patel");
       String s6=new String("Sajid");
       
       System.out.println(s1+","+s2+","+s3+","+s4+","+s5+","+s6);
	}

}
