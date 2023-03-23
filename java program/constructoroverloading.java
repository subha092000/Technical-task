//38. constructor overloading



package javaseleniumnew;

public class constructoroverloading {

	
		String girl;
		constructoroverloading(){
			System.out.println("this is girl");
		}
		constructoroverloading(String togirl){
			girl=togirl;
			System.out.println(girl);
		}
		public static void main(String[] args) {
			constructoroverloading girl=new constructoroverloading();
			constructoroverloading girl1=new constructoroverloading("subha");
		}
		// TODO Auto-generated method stub

	

}
