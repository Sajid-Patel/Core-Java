package com.string_manipulation;

/*
   Case4b]
   If we are Overriding toString() then our ToString() is executed
 */

public class Case4b {

	//Instance variable
	int eid;
	String ename;
	
	Case4b(int eid, String ename) // local var
	{
		this.eid=eid;
		this.ename=ename;
	}	
	
	
	// overiding toString()
	public String toString() 
	{
		return "emp id= "+eid+"  emp name= "+ename;
	}
	
	
	public static void main(String[] args) {
		Case4b e1= new Case4b(111,"Sajid");
		System.out.println(e1);
		System.out.println(e1.toString());
		 
	}

}
