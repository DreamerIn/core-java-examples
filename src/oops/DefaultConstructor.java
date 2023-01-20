package oops;

/* Constructors:It is a special type of method which is used to initialize the object.
                Every time an object is created using the new() keyword, at least one constructor is called.
                
 * Rules for creating Java constructor: 1)Constructor name must be the same as its class name
                                        2)A Constructor must have no explicit return type
                                        3)A Java constructor cannot be abstract, static, final, and synchronized
  
 * Note: We can use access modifiers while declaring a constructor. 
 * It controls the object creation. In other words, we can have 
   private, protected, public or default constructor in Java.
   
   Types of Java constructors:1)Default constructor (no-arg constructor)
                              2)Parameterized constructor
                              
    Java Default Constructor:A constructor is called "Default Constructor" when it doesn't have any parameter. 
          Syntax of default constructor:
                                        <class_name>(){}  
                                        

 */
//Example of default constructor
class Bike1{

Bike1(){System.out.println("Bike is created");}

}
class DefaultConstructor {
	public static void main(String args[]){
		Bike1 b=new Bike1();
		
		
	
		}
}






