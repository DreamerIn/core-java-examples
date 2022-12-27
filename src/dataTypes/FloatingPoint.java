package dataTypes;

public class FloatingPoint {
	public static void main(String[] args) {
		//Floating Point Types:
		//We should use a floating point type whenever you need a number with a decimal, such as 9.99 or 3.14515.
		/*The "float" and "double" data types can store fractional numbers. 
		 *Note that you should end the value with an "f" for floats and "d" for doubles:
		 */
		float Num1=8.16f;
		System.out.println(Num1);
		
		double Num2=77.12345d;
		System.out.println(Num2);
		/*Use float or double?
		 * The precision of a floating point value indicates how many digits the value can have after the decimal point.
		 * The precision of float=6 0r 7 decimal digits.
		 * The precision of double=15 decimal digits.
		 * 
		 */
		//NOTE:it is safer to use double for most calculations.
		//what if we define a number for float type that have 10 precision after decimal point.
		//Lets check
		
	/*	 float Num3=55.1234567899f;
		System.out.println(Num3); */
		
		
	     //Output:55.123455
		//So the Num3 approximated up to 6 decimals.
		//just remove the multiLine comment to give it try yourself in java25-java26.
		
		
		//Scientific Numbers:
		//NOTE:A floating point number can also be a scientific number with an "e" to indicate the power of 10:
		float ScientificNum=53e4f;
		double ScientificNum1=99.22e4d;
		double ScientificNum2=99e4d;
		System.out.println("Scientific Numbers:"+"     "+ScientificNum);
		System.out.println("Scientific Numbers:"+"     "+ScientificNum1);
		System.out.println("Scientific Numbers:"+"     "+ScientificNum2);
		
		
//                                    <------------------END------------------>		
		
		String Text="Thank You";
		
		 System.out.printf("                                                        "+Text);
	}
	
	
}
