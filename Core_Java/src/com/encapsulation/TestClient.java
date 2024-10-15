package com.encapsulation;

public class TestClient {

	public static void main(String[] args) {
		EmpBean eb1= new EmpBean();
		
		//setters are used to set the data
		eb1.setEid(786);
		eb1.setEname("Sajid");
		
		//getters are used to get the data
		int eid= eb1.getEid();
		System.out.println(eid);
		
		String ename= eb1.getEname();
		System.out.println(ename);
	
	}

}





