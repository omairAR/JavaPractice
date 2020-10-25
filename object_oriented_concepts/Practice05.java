/*
 * topics covered
 * 
 * => INTERFACES
 * 
 * 
 * */

package object_oriented_concepts;

interface Shape2{
	
	
	public void area(int l, int b);
	public void perimeter(int l, int b);
}

class Square2 implements Shape2{
	public void area(int l, int b){
		System.out.println("area: "+l*b);
	}
	public void perimeter(int l, int b){
		System.out.println("perimeter : "+ 2*(l+b));
	}
}


public class Practice05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape2 s = new Square2();
		
		s.area(1, 2);
		s.perimeter(1, 2);
	}

}
