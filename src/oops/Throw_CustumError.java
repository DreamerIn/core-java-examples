package oops;

public class Throw_CustumError {
	static void checkAge(int age) { 
	    if (age < 18) {
	      throw new ArithmeticException("Access denied - You must be at least 18 years old."); 
	    } else {
	      System.out.println("Access granted - You are old enough!"); 
	    }
}

	public static void main(String[] args) {
		//checkAge(15); //remove the comment line to test it.
/*
    output: Exception in thread "main" java.lang.ArithmeticException: 
		    Access denied - You must be at least 18 years old.
	at oops.Throw_CustumError.checkAge(Throw_CustumError.java:6)
	at oops.Throw_CustumError.main(Throw_CustumError.java:13)

*/
		checkAge(20); //output:Access granted - You are old enough!

	}
}
	


