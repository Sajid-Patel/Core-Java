package com.nested_class;

//Anonymous_A

/*What is applicationn with Anonymous class is?
 * Dont take the implementation class
 * direct create object or A class(overriding method)
 * it seems to be object of A class but it is not
 * Internally some x class is generated that x class is implementing with A
 * that x class object will be  created that x class is called Anonymous class
 
 */
import com.inheritance.A;

public class AnonymousclassOuter1 {

	Anonymous_A a = new Anonymous_A() {
		void disp() {
			System.out.println("Anonymous Class disp method");
			System.out.println(a.getClass().getSimpleName());
		}
	};

	public static void main(String[] args) {
		AnonymousclassOuter1 o = new AnonymousclassOuter1();
		o.a.disp();
	}

}
