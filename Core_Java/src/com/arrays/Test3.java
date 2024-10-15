package com.arrays;

class Test3 {

	public static void main(String[] args) {
		Emp3 e1 = new Emp3(111, "Sajid");
		Emp3 e2 = new Emp3(112, "Patel");
		Emp3 e3 = new Emp3(113, "SP");

		Emp3[] e = new Emp3[3];
		e[0] = e1;
		e[1] = e2;
		e[2] = e3;

		for (Emp3 ee : e) {
			System.out.println(ee.eid + "_" + ee.ename);
		}
	}

}
