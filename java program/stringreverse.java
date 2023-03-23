
//2.How do we reverse a string


package javaseleniumnew;

public class stringreverse {

	public static void main(String[] args) {
		String ss="subha";
		int le=ss.length();
		String rev="";
		for(int i=le-1;i>=0;i--) {
			rev=rev+ss.charAt(i);
			
			
		}
		System.out.println(rev);
		
		
		// using string buffer and string builder
		
		StringBuilder buffe=new StringBuilder("subha");
		System.out.println(buffe.reverse());

	}

}
