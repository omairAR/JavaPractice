/*
 * topics covered
 * 
 * => Getter setter Methods
 * 
 * ==> data hiding => data should not go outside directly
 * ==> abstraction => hiding implementations  
 * ==> encapsulation => Data hiding + Abstraction
 * 
 * */
package object_oriented_concepts;

class Student{
	private int rno;
	
	public int getRno(){
		return rno;
	}
	
	public void setRno(int newRno){
		rno=newRno;
	}
}

public class Practice01 {

	public static void main(String[] args) {
			Student s = new Student();
			
			System.out.println(s.getRno());
			
			int rollno = 10;
			
			s.setRno(rollno);
			
			System.out.println("new roll no"+s.getRno());

	}

}


