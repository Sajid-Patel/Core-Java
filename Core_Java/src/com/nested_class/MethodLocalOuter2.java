package com.nested_class;

public class MethodLocalOuter2 {
	void m1() {
		class MethodInner2a {
			void disp1() {
				System.out.println("Good Morning");
			}
		}

		class MethodInner2b extends MethodInner2a {
			void disp2() {
				System.out.println("Good Evening");
			}

		}
		MethodInner2b d = new MethodInner2b();
		d.disp1();
		d.disp2();
	}

	public static void main(String[] args) {
		new MethodLocalOuter2().m1();

}
	}
