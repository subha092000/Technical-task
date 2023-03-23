package javaseleniumnew;

public class methodoveride2 extends methodoveride1{
	
	public void maraige() {
		System.out.println("subha");
	}

	public static void main(String[] args) {
		methodoveride1 ss=new methodoveride2();
		ss.friend();
		ss.maraige();
		// TODO Auto-generated method stub

	}

}
