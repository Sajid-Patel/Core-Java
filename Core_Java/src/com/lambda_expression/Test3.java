package com.lambda_expression;

public class Test3 {

	public static void main(String[] args) {
		// Application with Anonymous Inner Class
		It3 i = new It3() {
			public String disp(int a) {
				System.out.println("Good Morning");
				return "Sajid";
			}
		};
		String s = i.disp(10);
		System.out.println(s);

		// Application with Lambda Expression
		It3 i1 = (a) -> {
			System.out.println("Good evening");
			return "Patel";
		};
		String str = i1.disp(100);
		System.out.println(str);

		It3 i2 = (a) -> "Pune";
		String str2 = i2.disp(200);
		System.out.println(str2);
	}

}
