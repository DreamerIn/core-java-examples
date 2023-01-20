package oops;

/* Types of InstannceMethod:
 * There are two types of instance method:

    --Accessor Method
    --Mutator Method
    
    Accessor Method: The method(s) that reads the instance variable(s) is known as the accessor method.
                     We can easily identify it because the method is prefixed with the word get.
                     It is also known as getters. It returns the value of the private field. 
                     It is used to get the value of the private field.
                     
    Ex:                
                  
    public int getId()    
    {    
    return Id;    
    }    

 
   Mutator Method: The method(s) read the instance variable(s) and also modify the values. 
   We can easily identify it because the method is prefixed with the word set. 
   It is also known as setters or modifiers. It does not return anything. 
   It accepts a parameter of the same data type that depends on the field. 
   It is used to set the value of the private field.

    Ex:
    
    public void setRoll(int roll)   
    {  
    this.roll = roll;  
    }  
    

 */

//Java Program to Illustrate Getter and Setter

//example program:


//Class 1
//Helper class
class GetSet {

	// Member variable of this class
	private String name;

	// Method 1 - Getter
	public String getName() { return name; }

	// Method 2 - Setter
	public void setName(String N)
	{

		// This keyword refers to current instance itself
		this.name = N;
	}
}

//Class 2
//Main class
class TypesOfMethods {

	// Main driver method
	public static void main(String[] args)
	{
		// Creating an object of class 1 in main() method
		GetSet obj = new GetSet();

		// Setting the name by calling setter method
		obj.setName("Ravi");
		// Getting the name by calling getter method
		System.out.println(obj.getName());
	}
}

	


