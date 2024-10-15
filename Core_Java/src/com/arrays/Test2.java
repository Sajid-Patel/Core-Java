package com.arrays;
//class A2


/*
 When we create array, array is created with specified size with default values
 when we initilize the values, default values gets changed as per our need
 */
class Test2 {

	public static void main(String[] args) {

		int[] a = new int[5];
		for (int aa : a) {
			System.out.println(aa);
		}

		boolean[] b = new boolean[3];
		for (boolean bb : b) {
			System.out.println(bb);
		}

		A2[] a1 = new A2[3];
		for (A2 a2 : a1) {
			System.out.println(a2);
		}
	}

}
