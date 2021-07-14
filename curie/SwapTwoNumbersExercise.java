package curie;

public class SwapTwoNumbersExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float first = 2.50f, second = 4.50f;
		
		System.out.println("--Before swap--");
		System.out.println("first number = "+ first);
		System.out.println("second number = "+ second);
		
		//value of first is assigned to temporary 
		float temporary = first;
		
		//value of second is assigned to first
		first = second;
		
		//value of temporary (which contains the initial value of first) is assigned to second
		second = temporary;
		
		System.out.println("--after swap--");
		System.out.println("first number = "+ first);
		System.out.println("second number = "+ second);
		
		
		
		
		
	}

}
