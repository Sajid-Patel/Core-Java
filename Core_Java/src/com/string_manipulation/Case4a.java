package com.string_manipulation;
/*
 Case 4] toString()
 
 If we are not overriding toString() then object class toString() is executed &
 output is HashCode 
 
 HashCode= 
 It is unique identification Hexa Decimal no. generated by JVM to 
 identify objects uniquely
 
 
 Class object{
 public String toString()
 {return "class-name@HashCode";}
             }

 Class String extends object { 
    //overriding toString()         
 public String toString()
 {return "content of String object"; }
           }
           
           
 class StringBuffer extends object {
     //overriding toString()         
 public String toString()
 {return "content of StringBuffer object"; }
           }               
    
*/
public class Case4a {

	public static void main(String[] args) {
		Case4a t= new Case4a();
		System.out.println(t);
		System.out.println(t.toString());
		
		//   o/p = Case4a@372f7a8d--->HashCode
		

	}

}
