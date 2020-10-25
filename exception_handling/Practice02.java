/*
 * topics covered
 * 
 * => multiple catch 
 * => finally block
 * 
 * 
 * */
package exception_handling;

public class Practice02 {
	
	public static void main(String args[]){
		
		int a[] = {1,2,3};
		
		try{
			System.out.println("stmt1");
			
			System.out.println("stmt2"+ a[3]);
			System.out.println("stmt3"+ 100/0);
			
		}catch(ArithmeticException ar){
			System.out.println("err in stmt 3");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("error in stmt 2");
		}
		finally{
			System.out.println("you are in finally block");
		}
	}

}
