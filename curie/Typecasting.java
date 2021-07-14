package curie;

public class Typecasting {
//Don't run this program just type and understand how casting works
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte b=10;
		
		int i=b; //will accept - automatic type promotion
		
		byte c=i; //will not accept -  because lower type cannot be used into higher type
				
		byte d=(byte)i; //type casting makes it possible to store compatible types.
		
		byte x=10;
		byte y=20;
		
		byte sum=x*y; //error is thrown when two bytes are used in an arithmetic operation, the result will bw nteger.
		
	}

}
