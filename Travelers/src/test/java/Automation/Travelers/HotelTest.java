package Automation.Travelers;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
public class HotelTest extends Hotel_Search1 {
	static Logger log= Logger.getLogger("HotelTest");

	
	
	
	LaunchBrowser  l1=new LaunchBrowser ();
		Hotel_Search1 h1=new Hotel_Search1();


	@Test
	public void test1() throws Exception 
	{
		PropertyConfigurator.configure("C:\\Users\\Online Test\\git\\phpTravelers\\Travelers\\Log4j.properties");
		l1.Launch();
		h1.hotelSearchButton();
		log.info("hotel_Result");
		
		
		
	}
	@AfterTest
	public void close() throws IOException
	{
		Hotel_Search1.closeWindow2();
	}

	}



       