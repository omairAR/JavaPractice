/*
 * topics covered
 * 
 * => try catch blocks
 * 
 * checked exception: exceptions which are check by compilers
 * un-checked exception: exceptions which are not checked by compilers
 * 
 * exception: bugs in our program which are encountered on runtime
 * 
 * */
package exception_handling;

public class Practice01 {

	public static void main(String[] args) {
		try{
			System.out.println(100/0);
		}catch(ArithmeticException e){
			//e.printStackTrace();
			System.out.println(e.toString());
			System.out.println(e.getMessage());
		}
		
		System.out.println("outside try chatch block");
		
		

	}

}
