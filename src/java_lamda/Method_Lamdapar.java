package java_lamda;

/*
     To use a lambda expression in a method, the method should have a parameter with a single-method 
     interface as its type. Calling the interface's method will run the lambda expression:
     
     Example:a method which takes a lambda expression as a parameter:
 */
interface StringFunction {
	  String run(String str);
}


public class Method_Lamdapar {
	public static void printFormatted(String str, StringFunction format) {
	    String result = format.run(str);
	    System.out.println(result);
	  }

	public static void main(String[] args) {
		StringFunction exclaim = (s) -> s + "!";
	    StringFunction ask = (s) -> s + "?";
	    printFormatted("Hello", exclaim);
	    printFormatted("Hello", ask);

	}
	

}
