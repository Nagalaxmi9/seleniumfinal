package Automation.Travelers;
import org.testng.annotations.Test;


public class CarsTest extends Car_search {
	
	

	
	    LaunchBrowser l1=new LaunchBrowser();
	    Car_search c1=new Car_search();
	    
	     @Test
	     public void test() throws Exception
	     {
	    	 Launch();
	    	 Fillcardetails();
	     }
	}



