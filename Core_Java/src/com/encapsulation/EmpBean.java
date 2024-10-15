package com.encapsulation;

public class EmpBean {
 //instance variable 
	private int eid;
	private String ename;
	
	//setters (used to set the values to properties)
	public void setEid(int eid) //local variable
	{
		this.eid=eid;
	}
	
	public void setEname(String emane)
	{
		this.ename=ename;
	}
	
	//getters (used to get the valuess from properties)
	public int getEid() 
	{
	return eid;	
	}
  
	public String getEname()
	{
		return ename; 
	}
}

