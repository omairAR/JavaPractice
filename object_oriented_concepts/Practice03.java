/*
 * topics covered
 * 
 * => OverRiding Methods
 * ==> Dynamic Dispatch
 * 
 * 
 * */
package object_oriented_concepts;

class Shape{
	
	int i= 1;
	
	public void name(){
		System.out.println("name: Triangle(by default)");
	}
	
	public void sides(){
		System.out.println("sides: 3(by default)");
	}
}

class Square extends Shape{
	public void name(){
		System.out.println("name: Square");
	}
}

class Triangle extends Shape{
	
}

class Circle extends Shape{
	
	int i = 2;
	public void name(){
		System.out.println("name: Circle");
	}
	
}

public class Practice03 {

	public static void main(String[] args) {
		Square sq = new Square();
		
		sq.name();
		
		Triangle tr = new Triangle();
		
		tr.name();
		
		//Dynamic Dispatch 
		
		Shape s = new Circle();
		
		s.name();
		s.sides();
		
		System.out.println(s.i);
		
	}

}
