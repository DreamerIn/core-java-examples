package javaWrapperClasses;
//Java Wrapper Classes:
/*
   Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects.
   
Primitive Data Type 	               Wrapper Class
      byte 	                                Byte
     short 	                                Short
      int 	                                Integer
     long 	                                Long
     float 	                                Float
    double 	                               Double
    boolean 	                           Boolean
    char 	                               Character
    
    
    Sometimes you must use wrapper classes, for example when working with Collection objects, 
    such as ArrayList, where primitive types cannot be used (the list can only store objects):
    ArrayList<int> myNumbers = new ArrayList<int>();           //invalid
    ArrayList<Integer> myNumbers = new ArrayList<Integer>();   //valid
    
    
*/

//Creating Wrapper Objects:


public class JavaWrapperClass {

	public static void main(String[] args) {
		Integer myInt = 5; 
	    Double myDouble = 5.99; 
	    Character myChar = 'A';
	    
	    System.out.println(myInt);
	    System.out.println(myDouble);
	    System.out.println(myChar);

	    //we can access the same using value() method.
	    System.out.println(myInt.intValue());
	    System.out.println(myDouble.doubleValue());
	    System.out.println(myChar.charValue());
	    
	    /*
	        Another useful method is the toString() method, which is used to convert 
	        wrapper objects to strings.
	        
	        In the following example, we convert an Integer to a String, and use the length() method of 
	        the String class to output the length of the "string":
	     */
	    
	    Integer tostring = 100; 
	    String myString = tostring.toString();
	    System.out.println("the number of elements in String    :  "+myString.length());
	}

}
