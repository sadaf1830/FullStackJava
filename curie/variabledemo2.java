package curie;

public class variabledemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte b=10;
		byte c=2;
		
		//automatic type promotion.
		//when you multiply two bytes, the default result will be of type int
		
		int i=b*c;
		
		//but if you want to store in byte, then u need to type casting
		
		byte d=(byte)(b*c);
		//or
	
		System.out.println("byte value....;"+d);
		System.out.println("int value...;"+i);
		
		int myInt=127;
		
		byte myBite=(byte)myInt;
		
		
		//when u cast a higher type in a lower type, the data is chopped off which means he data will loose its precision.
		//it will divide the number by 256, and it assign the reminder of the division.
		
		
		System.out.println(myBite);
		
		
		
	
		float f=100.23f;
		
		int ii=(int)f;
		
		System.out.println(ii);
		
		char ch='a';
		
		System.out.println(ch);
		
		System.out.println((int)ch);
		
		System.out.println((char)169);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
