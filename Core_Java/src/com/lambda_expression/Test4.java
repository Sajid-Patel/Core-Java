package com.lambda_expression;

public class Test4 {

	public static void main(String[] args) {
		// Application with Lambda Expression

		It4 i = (uname, upwd) -> {
			if (uname.equals("Sajid")) {
				return "Sucess";
			}

			else {
				return "Flase";
			}

		};
		String s = i.login("Sajid", "Patel");
		System.out.println(s);
	}

}
