package com.arrays;
/*Array can store only homogenous data, so to overcome this problem we can create 
Object type Array---> this can store any type of data
*/

//instanceof--->Purpose of instanceof operator is to check the type of object
class Test7 {

	public static void main(String[] args) {
		Object[] o = new Object[3];
		o[0] = new Employee7(111, "Sajid");
		o[1] = new Student7(01, "Patel");
		o[2] = new Integer(10);

		for (Object oo : o) {

			if (oo instanceof Employee7) {
				Employee7 e = (Employee7) oo;
				System.out.println(e.eid + "___" + e.ename);
			}

			if (oo instanceof Student7) {
				Student7 s = (Student7) oo;
				System.out.println(s.sid + "___" + s.sname);
			}

			if (oo instanceof Integer) {
				System.out.println(oo);
			}

		}

	}

}
