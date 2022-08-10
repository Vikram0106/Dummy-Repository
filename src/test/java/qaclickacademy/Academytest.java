package qaclickacademy;

import org.testng.annotations.Test;

public class Academytest {
	
	




	   	 // TODO Auto-generated method stub

	      //To download Testng libraries go to http://testng.org/doc/download.html or you can search it from eclipse and download.
	   	 
	    //Annnotations
	    

	    	@Test
	   	 
	    	public void OpeningBrowser()
	    	{
	        	System.out.println("Opening Browsers"); //Did you noticed,we didn't used the main function still the code inside this method will get execute as we are using @Test annotation which will do the work of main block.
	       	 
	    	}

	     	@Test  //We can use more than 1 @Test annotation in a class. If more than 1 test annotation then it will run code alphabatically as per method name. So here flight booking will run first as "F" comes first and then "O" of opening browser.
	    	 
	     	public void FlightBooking()  
	     	{
	   		  System.out.println("Flight Bookings");
	     	}
	   	 
	     	public void WebsiteClick()  
	     	{
	   		  System.out.println("Website Click");
	     	}
	   	 
	    }



