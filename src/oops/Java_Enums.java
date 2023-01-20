package oops;
//Enums:
/*      An enum is a special "class" that represents a group of constants (unchangeable variables,
 *      like final variables).
 *      
 *      To create an enum, use the enum keyword (instead of class or interface), and separate the constants with a comma.
 *      Note that they should be in uppercase letters:
 */
//Example: 

public class Java_Enums { 
	  enum Level {
	    ALPHA,
	    GAMMA,
	    BEETA
	  }





	public static void main(String[] args) {
		Level myVar = Level.BEETA; 
	    System.out.println(myVar); 
		

	}

}

