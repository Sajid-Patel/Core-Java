package com.nested_class;

public class MethodLocalOuter1 {
	void m1() {
		class MethodLocalInner1 {
			void disp() {
				System.out.println("Method Local Inner Class");
			}

		}

		MethodLocalInner1 i = new MethodLocalInner1();
		i.disp();
	}

	public static void main(String[] args) {
		new MethodLocalOuter1().m1();

	}

}
