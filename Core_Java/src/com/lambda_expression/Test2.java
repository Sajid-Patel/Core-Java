package com.lambda_expression;

public class Test2 {

	public static void main(String[] args) {
		// Application with Anonymous
		It2 i = new It2() {
			public void add(int a, int b) {
				System.out.println(a + b);
			};
		};

		i.add(3, 4);

//Application with Lambda Expression
		It2 i1 = (int a, int b) -> System.out.println(a + b);
		i1.add(5, 6);

		It2 i2 = (a, b) -> System.out.println(a + b);
		// Specifying the type of agument optional/not required
		i1.add(7, 8);
	}

}