package java_Encapsulation;

//Encapsulation:The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. 
/*
 * To achieve this, you must:
                             1)declare class variables/attributes as private
                             2)provide public get and set methods to access and update the value of a private variable.
*/

public class JavaEncapsulation_Ex {
	public static void main(String[] args) {
		Person_Encapusulation myObj = new Person_Encapusulation(); //Created object of  Person_Encapusulation class to access it's Private attribute name.
	    myObj.setName("Encapsulation");
	    System.out.println(myObj.getName());
	  }

}

/*
     Why Encapsulation?
     
    -->Better control of class attributes and methods
    -->Class attributes can be made read-only (if you only use the get method), or write-only (if you only use the set method)
    -->Flexible: the programmer can change one part of the code without affecting other parts
    -->Increased security of data

*/
