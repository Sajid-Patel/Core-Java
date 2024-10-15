package com.wrapper_classes;

/*
 toString() = 
 When we print ref-var toString() method automatically called
 
  toString(): belongs to Object Class : return String representation of Object : class-name@hashcode
  
  class Object{
    toString()---> String representation of object
              }
    
  class String extends Object{
    overriding toStrinng() method:to return content
                               }
                               
  class StringBuffer extends Object {
    overriding toStrinng() method:to return content                                  
                                      }
                                      
  class WrapperClasses extends Object{
    overriding toStrinng() method:to return content                                  
                                      }                                    
   
 */
public class toStringEg {

	public static void main(String[] args) {

//Eg1>	 
		// toString() : Object class : class name@Hashcode
		toStringEg t = new toStringEg();
		System.out.println(t);
		System.out.println(t.toString());

		// String : toString() : return content of the object
		String s = "Sajid";
		System.out.println(s);
		System.out.println(s.toCharArray());

		// StringBuffer : toString() overriding : return content of the object
		StringBuffer sb = new StringBuffer("Patel");
		System.out.println(sb);
		System.out.println(sb.toString());

		// Wrapper Classes : toString() overriding : return content of the object
		Integer i = new Integer(100);
		System.out.println(i);
		System.out.println(i.toString());
	}

}

/*
 * Eg2> It is possible to call the toString() only on object type but not
 * primitive type int a=10; System.out.println(a);
 * System.out.println(a.toString()); : error : Cannot invoke toString() on the
 * primitive type int
 * 
 * 
 * Eg3> Wrapper to String Integer i = new Integer(10); String s = i.toString();
 */
