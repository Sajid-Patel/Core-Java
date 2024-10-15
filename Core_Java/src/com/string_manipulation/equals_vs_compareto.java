package com.string_manipulation;

// equals() vs compare To()

public class equals_vs_compareto {

	public static void main(String[] args) {
		// String class equals() executed
		String s1="Sajid";
		String s2="Patel";
		String s3="Sajid";
       System.out.println(s1.equals(s2));
       System.out.println(s1.equals(s3));
       System.out.println(s3.equals(s2));
       System.out.println("SAJID".equals("sajid"));
       System.out.println("SAJID".equalsIgnoreCase("sajid"));
       
       // compre To()----> int
       
       System.out.println(s1.compareTo(s2));
       System.out.println(s1.compareTo(s3));
       System.out.println(s2.compareTo(s3));
       
       
       System.out.println("SAJID".compareTo("sajid"));
       System.out.println("SAJID".compareToIgnoreCase("sajid"));
	}

}
