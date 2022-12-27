package dataTypes;

/**
 *This is an example for datatype integer
 * @author ravit
 *
 **/
public class Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Integer type
	/*Integer types stores whole numbers, positive or negative (such as 123 or -456), without decimals. 
	 * Valid types are byte, short, int and long. Which type you should use, depends on the numeric value.
	 */
		
		/*The BYTE data type can store whole numbers from -128 to 127. 
		 * This can be used instead of int or other integer types to
		 * save memory when you are certain that the value will be within -128 and 127:
		 */
		
		byte minNum=-128;
		byte maxNum=127;
		System.out.println("the min value of byte datatype is:"+minNum);
		System.out.println("the max value of byte datatype is:"+maxNum);
		
		
		//Short
		//The short data type can store whole numbers from -32768 to 32767:
		
		short minNumShort=-32768;
		short maxNumShort=32767;
		System.out.println("the min value of Short datatype is:"+minNumShort);
		System.out.println("the max value of Short datatype is:"+maxNumShort);
			
		//Int
		//The int data type can store whole numbers from -2147483648 to 2147483647.
		int minNumInt=-2147483648;
		int maxNumInt=2147483647;
		
		
		System.out.println("the min value of int datatype is:"+minNumInt);
		System.out.println("the max value of int datatype is:"+maxNumInt);
		
		/*The long data type can store whole numbers
		from -9223372036854775808 to 9223372036854775807*/
		//Note that you should end the value with an "L":
		
		long minNumLong=-9223372036854775808L;
		long maxNumLong=9223372036854775807L;
		System.out.println("the min value of long datatype is:"+minNumLong);
		System.out.println("the max value of long datatype is:"+maxNumLong);
		
		//what if we define value to a datatype that is out of it's range
		//Lets check this for byte:
	/*
		byte outOfRangeNum=150;
		System.out.println(outOfRangeNum);
		
		At Line 57 error accurs,the error as shown below:
		
		"Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	    Type mismatch: cannot convert from int to byte

	    at dataTypes.Integer.main(Integer.java:57)"   */
//lets take above code and correct it:
		
		
		short RangeInNum=160;
		System.out.println(RangeInNum);
		    
//                             <------------------END------------------>
		
// Note="the int data type is the preferred data type when we create variables with a numeric value.";

     String Text="Thank You";
		
	 System.out.printf("                                                        "+Text);
		
				
	}
	

}
