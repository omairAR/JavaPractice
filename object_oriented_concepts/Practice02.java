/*
 * topics covered
 * 
 * => OverLoading Methods
 * 
 * 
 * */

package object_oriented_concepts;

class Calculator{
	public byte sum(byte a, byte b){
		return (byte) (a+b);
	}
	
	public short sum(short a, short b){
		return (short) (a+b);
	}
	public int sum(int a, int b){
		return a+b;
	}
	
	public float sum(float a, float b){
		return a+b;
	}
}

public class Practice02 {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		
		byte a=1,b=2;
		short d=3,e=4;
		
		System.out.println(" sum of byte's ="+ c.sum(a, b));
		System.out.println(" sum of byte's ="+ c.sum(d, e));
		System.out.println(" sum of byte's ="+ c.sum(5, 6));
		System.out.println(" sum of byte's ="+ c.sum(3.6f,5.6f));
		

	}

}
