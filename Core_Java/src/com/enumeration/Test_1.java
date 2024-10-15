package com.enumeration;

public class Test_1 {

	public static void main(String[] args) {
		// Approach 1> to access all constants separately, This is generally used approach
		
		Week_1 w1 = Week_1.MON;
		Week_1 w2 = Week_1.TUE;
		Week_1 w3 = Week_1.WED;

		System.out.println(w1 + " " + w2 + " " + w3);

		// Approach 2> to access all constants at same time
		Week_1[] w = Week_1.values();
		for (Week_1 ww : w) {
			System.out.println(ww + " " + ww.ordinal());

			/*
			  ordinal() Returns its positionin its enum declaration, where the initial
			  constant is assignedan ordinal of zero of this enumeration constant
			 */
		}
	}

}
