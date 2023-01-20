package java_user_input;
//Java User Input:
/*
 The Scanner class is used to get user input, and it is found in the java.util package.
 
 To use the Scanner class, create an object of the class and use any of the available methods 
 found in the Scanner class documentation. 
 In our example, we will use the nextLine() method, which is used to read Strings:
 */
//Example:


import java.util.Scanner;

class JavaUserInput {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);

	    System.out.println("Enter name, age and salary:");

	    // String input
	    String name = myObj.nextLine();

	    // Numerical input
	    int age = myObj.nextInt();
	    double salary = myObj.nextDouble();

	    // Output input by user
	    System.out.println("Name: " + name); 
	    System.out.println("Age: " + age); 
	    System.out.println("Salary: " + salary); 

	}

}
