package oops;
//Java Exceptions:
/* When an error occurs, Java will normally stop and generate an error message. 
The technical term for this is: Java will throw an exception (throw an error).

Java try and catch:
      try {
  //  Block of code to try
}
catch(Exception e) {
  //  Block of code to handle errors
}

*/

public class java_exceptions {

	public static void main(String[] args) {
		try {
		      int[] myNumbers = {1, 2, 3};
		      System.out.println(myNumbers[10]);
		    } catch (Exception e) {
		      System.out.println("Something went wrong."); //10 index deosn't exist in array.
		    }
                //output:Something went wrong.
		//let me check by giving the index that exist in array.
		finally {
		      System.out.println("The 'try catch' is finished.");
		    }
		
		try {
		      int[] myNumbers = {1, 2, 3};
		      System.out.println(myNumbers[2]);       
		    } catch (Exception e) {
		      System.out.println("Something went wrong.");
		    }
		         //output:3
		//The finally statement lets you execute code, after try...catch, regardless of the result:
		finally {
		      System.out.println("The 'try catch' is finished.");
		    }
	}
	

}
