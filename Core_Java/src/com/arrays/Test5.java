package com.arrays;

//To find Index position of null values
class Test5 {

	public static void main(String[] args) {
		Emp5 e1 = new Emp5(21, "SP");
		Emp5 e2 = new Emp5(22, "Patel");
		Emp5 e3 = new Emp5(23, "Sajid");

		Emp5[] e = new Emp5[5];
		e[0] = e1;
		e[2] = e2;
		e[4] = e3;

		for (int i = 0; i < e.length; i++) {
			if (e[i] == null) {
				System.out.println(i);
			}
		}

	}

}
