package flow_of_control;

public class Practice02 {
	public static void main(String args[]){
		int a = 3;
		
		switch (a) {
		case 1:{
			System.out.println( "one");
			break;
		}
			
		case 2:{
			System.out.println("two");
			break;
		}

		default:
			System.out.println("no val");
			break;
		}		
	}
}
