package user_defined_datatypes;

//LinkedList:
/*
     The LinkedList stores its items in "containers." 
     The list has a link to the first container and each container has a link to the next container in the list. 
     To add an element to the list, the element is placed into a new container and 
     that container is linked to one of the other containers in the list.
     
     NOTE:Use an ArrayList for storing and accessing data, and LinkedList to manipulate data.
 */

//LinkedList Methods:

import java.util.LinkedList;

public class Java_LinkedList {

	public static void main(String[] args) {
		
		LinkedList<String> cars = new LinkedList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    
	    // Use addFirst() to add the item to the beginning
	    cars.addFirst("Mazda");
	    System.out.println("added at first    :"+cars);
	    
	 // Use addLast() to add the item to the end
	    cars.addLast("Mazda");
	    System.out.println("added at last   :"+cars);
	    
	 // Use removeFirst() remove the first item from the list
	    cars.removeFirst();
	    System.out.println("removed first element   :"+cars);
	    
	 // Use removeLast() remove the last item from the list
	    cars.removeLast();
	    System.out.println("removed last element   :"+cars);
	    
	    //cars=[Volvo, BMW, Ford]
	    
	 // Use getFirst() to display the first item in the list
	    System.out.println("the first element of array   :"+cars.getFirst());
	    
	 // Use getLast() to display the last item in the list
	    System.out.println("the last element of array   :"+cars.getLast());
	}

}
