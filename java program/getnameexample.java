
// 10 getname in java with example



package javaseleniumnew;

public class getnameexample {

	public static void main(String[] args) {
		
		//The getName() returns the name of the entity (class, interface, array class, primitive type, or void) represented by this Class object, as a String.
		
		
		// returns the Class object associated with this class
	      getnameexample cl = new getnameexample();
	      Class c1Class = cl.getClass();

	      // returns the name of the class
	      String name = c1Class.getName();
	      System.out.println("Class Name = " + name);

	}

}
