/*
 * topics covered
 * 
 * => ABSTRACT CLASS
 * 
 * 
 * */
package object_oriented_concepts;

abstract class Shape1{
	
	public void area(int l, int b){
		System.out.println("area: "+l*b);
	}
	
	public abstract void perimeter(int l, int b);
}

class Square1 extends Shape1{
	public void perimeter(int l, int b){
		System.out.println("perimeter : "+ 2*(l+b));
	}
}

public class Practice04 {
	
	

	public static void main(String[] args) {
		
		Shape1 s = new Square1();
		
		s.area(2, 3);
		s.perimeter(2, 3);

	}

}
