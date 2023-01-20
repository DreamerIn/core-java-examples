package oops;
//Loop Through an Enum:

enum Third {
	  ONE,
	  TWO,
	  THREE,FOUR
	}


public class Java_Enums_Ex3 {

	public static void main(String[] args) {
		 
		    for (Third myVar : Third.values()) {
		      System.out.println(myVar);
		    }
		  } 

	}


