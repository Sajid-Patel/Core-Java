package com.encapsulation;

class Client {

	public static void main(String[] args) {

		Emp e=new Emp();
		e.setEid(510);
		e.setEnmae("Sajid");
		System.out.println(e.getEid()+" : " +e.getEname()+" : "+e.getCompany());
	
		Emp e2=new Emp();
		e.setEid(313);
		e.setEnmae("Tanjim");
		System.out.println(e.getEid()+" : " +e.getEname()+" : "+e.getCompany());
	
	
	}
}
