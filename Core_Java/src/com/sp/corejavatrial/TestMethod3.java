package com.sp.corejavatrial;

// Instance Method eg

public class TestMethod3 {

	void m1() {
		m2(); // Instance Method calling
		System.out.println("M1 Method");
	}

	void m2() {
		System.out.println("M2 Method");
	}

	void m3(int a) {
		System.out.println("M3 Method");
	}

	public static void main(String[] args) {

		TestMethod3 t = new TestMethod3();
		t.m1();
		t.m3(10);
	}

}
