package com.sp.corejavatrial;

public class TestStaticBlock2 {

	//Static Blocks are used to initialize static variables
	static int eid;
     
     static 
     {
    	 eid=111;
     }
     
   static  void disp()
     {
    	 System.out.println(TestStaticBlock2.eid);
     }
	public static void main(String[] args) {
		
		TestStaticBlock2.disp();
	}

}
