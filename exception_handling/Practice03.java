/*
 * topics covered
 * 
 * => nested try catch blocks 
 * 
 * */

package exception_handling;

public class Practice03 {

	public static void main(String[] args) {
		int a[] = {1,2,3};
		
		try{
			System.out.println("stmt1");
			
			try{
				System.out.println("stmt2"+ a[3]);
				
			}catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("error in stmt 2");
			}
			
			System.out.println("stmt3"+ 100/0);
			
		}catch(ArithmeticException ar){
			System.out.println("err in stmt 3");
		}

	}

}
