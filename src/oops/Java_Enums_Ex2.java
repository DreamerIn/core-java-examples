package oops;
//Enum in a Switch Statement:
//Enums are often used in switch statements to check for corresponding values:

enum Level {
	  LOW,
	  MEDIUM,
	  HIGH
	}

public class Java_Enums_Ex2 {
	public static void main(String[] args) {
	    Level myVar = Level.HIGH;

	    switch(myVar) {
	      case LOW:
	        System.out.println("Low level");
	        break;
	      case MEDIUM:
	         System.out.println("Medium level");
	        break;
	      case HIGH:
	        System.out.println("High level");
	        break;
	    }
	  }

}
