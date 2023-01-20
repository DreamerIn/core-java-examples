package user_defined_datatypes;
/*
   A HashSet is a collection of items where every item is unique, 
   and it is found in the java.util package: 
*/

//Import the HashSet class
import java.util.HashSet;

public class Java_HashSet {

	public static void main(String[] args) {
		HashSet<String> cars = new HashSet<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("BMW");
	    cars.add("Mazda");
	    System.out.println(cars);
	    
	/*
	   Note: In the example above, even though BMW is added twice 
	   it only appears once in the set because every item in a set has to be unique. 
	*/
	  //to check the item exist in a HashSet use contains() method
	  /*
	   * if the item exist in HashSet it gives output as "true"
	   * if the item doesn't exist in HashSet it gives output as "false"
	   */
	    System.out.println(cars.contains("Volvo"));
	    
	    System.out.println(cars.contains("RolsRoys"));
		
	    System.out.println(cars.remove("Mazda"));
	    System.out.println("removed Mazda from HashSet     :  "+cars);
	    
	    //to remove all the items use clear() method.
	    cars.clear();
	    System.out.println("all items removed from HashSet :  "+cars);
	    
	    //use size()  method to know the number of items
	    System.out.println("the number of items in HashSet :  "+cars.size());
	    
	    //since HashSet is empty we will add some new items.
	    cars.add("Maruti");
	    cars.add("suzuki");
	    cars.add("Rolsroys");
	    cars.add("nano");
	    System.out.println("the updated cars  HashSet is :    "+cars);
	    System.out.println("the number of items in HashSet :  "+cars.size());
	    
	    //Loop Through a HashSet
	    //Loop through the items of an HashSet with a for-each loop:
	    for(String i:cars) {
	    	System.out.println(i);
	    }
	}

}
