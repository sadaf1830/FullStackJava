package basic;
import java.util.Scanner;

public class ArithmeticOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner scan=new Scanner(System.in);
    System.out.println("please enter i value....:");
    int i=scan.nextInt();
    System.out.println("please enter j value....:");
    int j=scan.nextInt();
    
	//addition
    int add=i+j;
    System.out.println("Addition..:"+add);
		
    int sub=i-j;
    System.out.println("Subtraction..:"+sub);
    
	int mul=i*j;
	System.out.println("Multiplication..:"+mul);
				
	int div=i/j;
	System.out.println("Division..:"+div); //this will have quotient
	
	int mod=i%j; //mod will have remainder after division
	System.out.println("Remainder..:"+mod);
	
	
	}

}
