package com.arrays;
//To print eid, ename and null values

//instanceof--->Purpose of instanceof operator is to check the type of object
class Test4 {

	public static void main(String[] args) {
		Emp4 e1 = new Emp4(11, "Sajid");
		Emp4 e2 = new Emp4(12, "Patel");
		Emp4 e3 = new Emp4(13, "SP");

		Emp4[] e = new Emp4[5];
		e[0] = e1;
		e[2] = e2;
		e[4] = e3;
		
		/*
		 for (Emp4 ee : e) {
			System.out.println(ee.eid + "_" + ee.ename);
			
			if we directly run print for-each loop statement it will give NullPointerException
			so to overcome this we need to use if case and type cast our Emp class to Objecct class(Parent class of all classes)
		}
		 */

		for (Object o : e) {

			if (o instanceof Emp4) //to print data
			{
				Emp4 ee = (Emp4) o; //type casting Emp4 to Object class
				System.out.println(ee.eid + "_" + ee.ename);
			}

			if (o == null) //to print null values
			{
				System.out.println(o);
			}

		}

	}

}
