package javaseleniumnew;

public class removespecialchar {

	public static void main(String[] args) {
		
		//A character which is not an alphabet or numeric character is called a special character.
		
		String ss = "i+-^am+ -subha softwre tester^ ^^-- ^^^ +!";  
		ss = ss.replaceAll("[-+^]*", " ");  
		
		System.out.println(ss);  
		

	}

}
