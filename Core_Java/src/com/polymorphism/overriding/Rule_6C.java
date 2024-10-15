package com.polymorphism.overriding;


/* Overriding Rule-6=
It is not possible to override private methods because they are specific to class
(accessible within same class)
*/

public class Rule_6C extends Rule_6P {
private void m1() {
	System.out.println("Child m1 method");
}
	public static void main(String[] args) {
		Rule_6P p= new Rule_6P();
		p.m1();

	}

}
