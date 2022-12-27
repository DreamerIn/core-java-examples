package oops;

public class ClassAndObj {
	int x=7;
	final String text="opps";
	public static void main(String[] args) {
		
		/*  CLASS:
		 *        A Class is like an object constructor, or a "blueprint" for creating objects.
		 *        
		 *  Create Class:use keyword class
		 *  
		 *  For Ex:
		 *  
		 *  public class Animal{
		 *      int x=15;
		 *  }
		 *  
		 *  NOTE:a class should always start with an uppercase first letter, and 
		 *       that the name of the java file should match the class name.
		 *        
		 */
	//-------------------------------------------------------------------------------------------------------
		/*  Object:object is  an instance of class.
		 */
		 /* Create Objects:To create an object of ClassAndOnj, specify the class name, 
		followed by the object name, and use the keyword new:  */
		ClassAndObj obj1=new ClassAndObj();
		System.out.println(obj1.x);
		System.out.println(obj1.text);
		
		//We can create multiple objects of one class:
		ClassAndObj obj2=new ClassAndObj();
		System.out.println("accesed from obj2        :"+obj2.x);
		
		//modify attributes:
		obj1.x=25;
		System.out.println("x value after madifing   :"+obj1.x);
		
		//*If you don't want the ability to override existing values, declare the attribute as final:
		//obj1.text="java"; //(remove the comment in code  and try)
		/* we will get a error as below:
		   The final field ClassAndObj.text cannot be assigned  */
		
		
		
		
		
		 
		  
		 
		
	}

}
