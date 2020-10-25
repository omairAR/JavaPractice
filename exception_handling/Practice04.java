/*
 * topics covered
 * 
 * => throw
 * ==>   Throw is a keyword which is used to throw an exception explicitly in
 *		 the program inside a function or inside a block of code.
 * 
 * */

package exception_handling;



public class Practice04 {

	public static void checkAge(int a){
		if(a<18){
			throw new ArithmeticException("age smaller then 18");
		}
		else{
		System.out.println("age > than 18");	
		}
	}
	
	public static void main(String args[]){
		int age = 15;
		
		try{
			Practice04.checkAge(age);
			
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		
	}
}
