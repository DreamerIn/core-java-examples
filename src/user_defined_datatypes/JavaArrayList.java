package user_defined_datatypes;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class JavaArrayList {
	public static void main(String[] args) { 
	    ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    System.out.println(cars);
	    System.out.println(cars.get(0)); //Access an Item
	    System.out.println(cars.get(3));
	    
	    cars.set(0, "Opel");  //to change element
	    System.out.println(cars);
	    
	    cars.clear();
	    System.out.println(cars);  //To clear all the elements in an array.
	    
	    System.out.println("the size of an array"+cars.size());
	    
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    System.out.println("the size of an arry after adding elements  :"+cars.size());
	    
	    //loop throgh a array.
	    cars.add("Mazda");
	    System.out.println("loop throgh an Array.....");
	    for (int i = 0; i < cars.size(); i++) {
	        System.out.println(cars.get(i));}
	    
	    //we can also loop through an ArrayList with the for-each loop:
	    System.out.println("loop throgh an Array using for each loop.....");
	    
	    for (String i : cars) {
	        System.out.println(i);
	      }
	    
	    //an ArrayList to store numbers (add elements of type Integer):
	    System.out.println("an ArrayList to store numbers (add elements of type Integer)");
	    
	    ArrayList<Integer> myNumbers = new ArrayList<Integer>();
	    myNumbers.add(10);
	    myNumbers.add(15);
	    myNumbers.add(20);
	    myNumbers.add(25);
	    for (int i : myNumbers) {
	      System.out.println(i);
	    }
	    
	    
	    
	  } 

}
