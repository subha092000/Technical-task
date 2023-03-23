//4. remove duplicate in an arraylist



package javaseleniumnew;

import java.util.HashSet;
import java.util.Set;

public class removeduplicatearray {

	public static void main(String[] args) {
		String[] st= {"Test","java","python","sql","java","Test"};
		Set<String> object=new HashSet<String>();
		for (String ss : st) {
			object.add(ss);
			
		}
		System.out.println("After remove duplicate:" + object);

	}

}
