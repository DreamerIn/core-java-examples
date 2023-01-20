package user_defined_datatypes;
/*Another useful class in the java.util package is the Collections class, 
which include the sort() method for sorting lists alphabetically or numerically:*/
import java.util.ArrayList;
import java.util.Collections;  // Import the Collections class

public class SortingOfArrayList {

	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    
	    Collections.sort(cars);

	    for (String i : cars) {
	      System.out.println(i);
	    }
	      //sorting of number string
	      System.out.println("Sorted number array  :");
	      ArrayList<Integer> myNumbers = new ArrayList<Integer>();
	      myNumbers.add(33);
	      myNumbers.add(15);
	      myNumbers.add(20);
	      myNumbers.add(34);
	      myNumbers.add(8);
	      myNumbers.add(12);

	      Collections.sort(myNumbers);

	      for (int j : myNumbers) {
	        System.out.println(j);
	      }
	   

	}

}
