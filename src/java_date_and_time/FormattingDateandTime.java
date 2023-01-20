package java_date_and_time;

/*
    You can use the DateTimeFormatter class with the 
    ofPattern() method in the same package to format or parse date-time objects. 
    The following example will remove both the "T" and nanoseconds from the date-time:
 */


import java.time.LocalDateTime;  // Import the LocalDateTime class
import java.time.format.DateTimeFormatter;  // Import the DateTimeFormatter class

public class FormattingDateandTime {

	public static void main(String[] args) {
		LocalDateTime myDateObj = LocalDateTime.now();  
	    System.out.println("Before formatting: " + myDateObj);  
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
	    
	    String formattedDate = myDateObj.format(myFormatObj);  
	    System.out.println("After formatting: " + formattedDate); 

	}

}

/*
     The ofPattern() method accepts all sorts of values, if you want to display the date and 
     time in a different format. 
     For example:
     
   Value 	         Example 	
yyyy-MM-dd 	       "1988-09-29" 	
dd/MM/yyyy 	       "29/09/1988" 	
dd-MMM-yyyy 	   "29-Sep-1988" 	
E, MMM dd yyyy 	   "Thu, Sep 29 1988"
 
 */
