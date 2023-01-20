package java_lamda;
/*
Java Lambda Expressions:
        The simplest lambda expression contains a single parameter and an expression:
        
                               parameter -> expression

        To use more than one parameter, wrap them in parentheses:
        
                      (parameter1, parameter2) -> expression
                      
         Expressions are limited. They have to immediately return a value, and they cannot contain variables,
         assignments or statements such as if or for. In order to do more complex operations, a code block 
         can be used with curly braces. If the lambda expression needs to return a value, then the 
         code block should have a return statement.
         
                      (parameter1, parameter2) -> { code block }
                      
Using Lambda Expressions

Lambda expressions are usually passed as parameters to a function:

Example:Use a lambda expression in the ArrayList's forEach() method to print every item in the list:
*/

import java.util.ArrayList;
public class Java_Lamda {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
	    numbers.add(5);
	    numbers.add(9);
	    numbers.add(8);
	    numbers.add(1);
	    numbers.add(10);
	    numbers.add(100);
	    numbers.add(100000);
	    numbers.forEach( (n) -> { System.out.println(n); } );

	}

}
