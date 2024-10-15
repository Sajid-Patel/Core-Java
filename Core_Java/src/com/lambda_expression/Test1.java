package com.lambda_expression;

public class Test1 {

	public static void main(String[] args) {

		// application with anonymous
		It1 i = new It1() /*
							 * It1 i = new It1()
							 * It seems to be Interface Object but it is not Interface object, Internally
							 * implementation class is generated, that class is implementing It1 that class
							 * object will be created that class is called anonymous class
							 */
		{
			public void disp() {
				System.out.println("This is Anonymous...");
			}
		};

		i.disp();

		// Application with Lambda Experession
		It1 i1 = () -> System.out.println("This is Lambda Expression OG"); // for one line logic
		i1.disp();

		It1 i2 = () -> {
			System.out.println("This is Lambda Expression 1"); // for Multiple line logic
			System.out.println("This is Lambda Expression 2");
		};
		i2.disp();

		/*
		 * Lambda Expression will work in only in case of Functional Interface(abstract
		 * method)
		 * 
		 * And along with only 1 abstract method() it may or may not contain Default
		 * method() and Static method()
		 */
	}

}
