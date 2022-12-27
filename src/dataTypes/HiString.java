package dataTypes;

public class HiString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Strings:
		//A String variable contains a collection of characters surrounded by double quotes:
		
		
		//For Ex:
		String Greeting="Hello Java";
		System.out.println(Greeting);
		
		//method to find String length:
		//For Ex:
		System.out.println("The length of thr String is                    :" +Greeting.length());
		
		/*method to convert string elements to Upper/Lower Case:
		  toUpperCase()
		  toLowerCase()
		*/
		//For Ex:
		System.out.println("String lettrs in upper case"+"                    :"+Greeting.toUpperCase());
		System.out.println("String lettrs in lower case"+"                    :"+Greeting.toLowerCase());
		
		/*Finding a Character in a String:
		 * The indexOf() method returns the index (the position) of the 
		 * first occurrence of a specified text in a string (including whitespace):
		 */
		
		System.out.println("the first occurrence of word 'Java' at index"+"   :"+Greeting.indexOf("Java"));   //Outputs 6
		/*see how:Hello Java
		          ||||||||||
		          0123456789 the first occurrence of word 'Java' at index 6  */
		
		//charAt() 	Returns the character at the specified index (position):
		
		System.out.println("the characer at index 6 is                     :"+Greeting.charAt(6));  //outputs J
		System.out.println("the characer at index 0 is                     :"+Greeting.charAt(0));  //outputs H
		
		//these are some basic string methods.
		/*other string methods:
		 * 
		 * 
codePointAt() 	
codePointBefore() 	
codePointCount() 	
compareTo() 	
compareToIgnoreCase() 	
concat() 	
contains() 	
contentEquals() 	
copyValueOf() 	
endsWith() 	
equals() 	
equalsIgnoreCase() 
format() 	
getBytes() 	
getChars() 	
hashCode() 	
indexOf()
intern()
isEmpty() 	
lastIndexOf() 
length() 	
matches()
offsetByCodePoints() 	
regionMatches() 
replace() 	
replaceFirst() 
replaceAll() 
split() 	
startsWith()
subSequence() 	
substring() 	
toCharArray() 	
toLowerCase() 
toString() 	
toUpperCase()
trim() 	
valueOf()

 	
*/
		
		

	}

}
