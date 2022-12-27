package dataTypes;

public class HiArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Arrays
		
		/*Arrays are used to store multiple values in a single variable, 
		 * instead of declaring separate variables for each value.
		 * 
		 * To declare an array, define the variable type with square brackets:

		 */

          //For Ex:
		 //   String[] sports;
		 
		 //We have now declared a variable that holds an array of strings. To insert values to it, 
		 //you can place the values in a comma-separated list, inside curly braces:
		 
		 String[] sports = {"Footbaal","Cricket","Tennis","Handball"};
		 
		 //To create an array of integers, you could write:
		 
		 int[] num= {1,2,3,4,5,6};
		 
		 //You can access an array element by referring to the index number:
		 
		 
		 System.out.println("the element at inedx 1 is                :" + sports[1]); //outputs Cricket
		 System.out.println("the element at inedx 0 is                :" + sports[0]); //outputs Football
		 
		 //Note: Array indexes start with 0: [0] is the first element. [1] is the second element, etc.
		 
		 //To change in an array element refer it at its index:
		 //For Ex:
		 
		 //sports[2]="Kabaddi";
		 //System.out.println("the changed element at inedx 2 is        :" + sports[2]); //outputs Kabaddi
		 
		 //Array Length
		 //to know how may elements an array has use length() property:
		 
		 System.out.println("the length of the sports array is        :" + sports.length); //outputs 4
		 
		 System.out.println("----------------------------------------------------------------------------");
		 
		 //Loop Through an Array
		 for(int i=0;i<sports.length;i++) 
		 { System.out.println("the element at index " + i +"  is               :"+sports[i]);}
		 
		 //for each loop:
		 //
		 
		 int[] numOfCars = {1,2,3,4,5,6,7,8};
		    
		    for (int i :numOfCars ) {
		    /*The example above can be read like this: for each String element 
		    (called i - as in index) in cars, print out the value of i.  */
		    System.out.println(i);} //outputs all the elements in numOfCars array
		    
//		    <----------------------------------------------------------------------------------------------->
		    
		    System.out.println("----------------------------------------------------------------------------");
		    //Multidimensional Arrays:
		    
		    /* A multidimensional array is an array of arrays.
		     * To create a two-dimensional array, add each array within its own set of curly braces:     */
		     
		     int[][] myNumbers= {{2,4,6,8,10},{1,3,5,7,9}} ;   
		     // myNumbers is now an array with two arrays as its elements.
		     
		     //Access Elements:
		     
		     System.out.println("the element at 00 is "+myNumbers[0][0]);  //outputs 2
		     System.out.println("the element at 01 is "+myNumbers[0][1]);  //outputs 4
		     System.out.println("the element at 02 is "+myNumbers[0][2]);  //outputs 6
		     System.out.println("the element at 03 is "+myNumbers[0][3]);  //outputs 8
		     System.out.println("the element at 04 is "+myNumbers[0][4]);  //outputs 10
		     System.out.println("the element at 10 is "+myNumbers[1][0]);  //outputs 1
		     System.out.println("the element at 11 is "+myNumbers[1][1]);  //outputs 3
		     System.out.println("the element at 12 is "+myNumbers[1][2]);  //outputs 5
		     System.out.println("the element at 13 is "+myNumbers[1][3]);  //outputs 7
		     System.out.println("the element at 14 is "+myNumbers[1][4]);  //outputs 9
		     
		     
		     
		     System.out.println("----------------------------------------------------------------------------");
		     
		     
		     //Loop Through a Multi-Dimensional Array:
		     
		     /*We can also use a for loop inside another for loop to get the elements of a two-dimensional array 
//		      (we still have to point to the two indexes):   */
		     System.out.println("All The Elements Of Array:");
		     
		     for (int i = 0; i < myNumbers.length; ++i) {
		         for(int j = 0; j < myNumbers[i].length; ++j) {
		            System.out.println(myNumbers[i][j]);
		         }
		      }
		     
		     
		 
		 
   }
}

	


