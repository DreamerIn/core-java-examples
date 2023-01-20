package user_defined_datatypes;

/*         A HashMap however, store items in "key/value" pairs, 
           and we can access them by an index of another type (e.g. a String).
           
           One object is used as a key (index) to another object (value). 
           It can store different types: String keys and Integer values, or the same type, 
           like: String keys and String values:
 */

//Examole:

//import the hashMap class
import java.util.HashMap;
public class Java_HashMap {

	public static void main(String[] args) {
		HashMap<String, Integer> CityAddresOrder = new HashMap<String, Integer>();
		
		CityAddresOrder.put("India", 1);
		CityAddresOrder.put("Karnataka", 2);
		CityAddresOrder.put("Bangalore", 3);
		CityAddresOrder.put("Huvina Hadagali", 4);
		CityAddresOrder.put("Pincode", 583219);
		
		System.out.println(CityAddresOrder);
		System.out.println(CityAddresOrder.get("Pincode"));      //Access an item
		System.out.println(CityAddresOrder.remove("Pincode"));   //Remove an item
		System.out.println("After Removing An item  :"+CityAddresOrder);
		
		CityAddresOrder.clear();
		System.out.println("used clear method to remove all items:   "+CityAddresOrder);    //To remove all items, use the clear() method:
		//To find out how many items there are, use the size() method:
		System.out.println("the number of items:    "+CityAddresOrder.size()); //size() method:
		
		
		
		CityAddresOrder.put("India", 1);
		CityAddresOrder.put("Karnataka", 2);
		CityAddresOrder.put("Bangalore", 3);
		CityAddresOrder.put("Huvina Hadagali", 4);
		CityAddresOrder.put("Pincode", 583219);
		
		System.out.println("the number of items:    "+CityAddresOrder.size()); //size() method:
		
		//Loop Through a HashMap
		/*
		   Loop through the items of a HashMap with a for-each loop.
		   
		   to get keys use keyset() method;
		   to get values use values() method;
		  
		*/
		
		// Print keys
		for(String i:CityAddresOrder.keySet()) {
			System.out.println(i);
		}
		
		System.out.println("------------------------------------------------------");
		
		//print values
		for(int j:CityAddresOrder.values()) {
			System.out.println(j);
		}
		
		//print keys and values
		for(String i:CityAddresOrder.keySet()) {
			System.out.println("key: "+i+"      value: "+CityAddresOrder.get(i));
		}
		

	}

}
