package com.arrays;

public class Test1 {

	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 40, };

		// 1st approach to print array
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);

		// 2nd approach to print array--For Loop
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		// 3rd approach to print array-- For-Each Loop

		for (int aa : a) {
			System.out.println(aa);
		}
	}
}
