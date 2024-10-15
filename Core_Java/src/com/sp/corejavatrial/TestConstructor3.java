package com.sp.corejavatrial;

//Suppose Class TestConstructor3 =  Class Employee

public class TestConstructor3 {
	int eid;       //0      
	String ename;  //null
	double esal;  //0.0
	
	TestConstructor3(int eid,String ename,double esal) //local Var 
	//Conversion of Local value to Instance value
	{
		this.eid=eid;  
		this.ename=ename;
		this.esal=esal;
		
	}

	 void disp() 
	 {
		 System.out.println("emp id="+eid);
		 System.out.println("ename="+ename);
		 System.out.println("esal="+esal);
	 }
	public static void main(String[] args)
	{
		TestConstructor3 e1=new TestConstructor3(786,"Sajid",100000);
        e1.disp();
	    
        TestConstructor3 e2=new TestConstructor3(313,"Patel",150000);
        e2.disp();
	}

}
