/*
 * topics covered
 * 
 * => throw
 * ==>Throws is a keyword used in the method signature used to declare 
 * 	  an exception which might get thrown by the function while executing the code.
 * 
 * */

package exception_handling;



public class Practice05 {

	public static int diivide(int a) throws ArithmeticException{
		return a/0;
	}
	
	public static void main(String args[]){
		int number = 15;
		
		try{
			System.out.println(Practice05.diivide(number));
		}catch (ArithmeticException e) {
			System.out.println(e.toString());
		}
		
			
		
		
		
	}
}
