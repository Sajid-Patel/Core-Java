package com.string_manipulation;
/*
 Case 5]  equals()
 
 class object{
 public boolean equals()
 {return "reference comparison";}
         }
 
 
 class String extends object{
     //overriding equals()
 public boolean equals()
 {return "content comparison";}
           }
           
  class StringBuffer extends object{
     // not overriding equals()   
           }      
 
 */
public class Case5 {

	Case5(String str){}
	
	public static void main(String[] args) {
		
            //objest class---->ref comp  
//{because of new keyword reference is pointing to two different objects}
		Case5 t1= new Case5("Sajid");
		Case5 t2= new Case5("Sajid");
		System.out.println(t1.equals(t2));
		
		
		
		//String class----->Content comp
//{ no new keyword is used so   2 different references is pointing to same objects}
		String s1="Patel";
		String s2="Patel";
		System.out.println(s1.equals(s2));
		
		
		
		//stringBuffer is not overriding
//{ it uses object class equals()----> ref comp }
		StringBuffer sb1=new StringBuffer("Engineer");	
		StringBuffer sb2=new StringBuffer("Engineer");	
		System.out.println(sb1.equals(sb2));
	}

}
