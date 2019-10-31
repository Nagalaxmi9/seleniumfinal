package Automation.Travelers;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class flightTest extends flight_search {
	
	static Logger log= Logger.getLogger("flightTest");
	@BeforeTest
	public static void test1() throws Exception {
        LaunchBrowser.Launch(); 
	}
		
	      @Test
		public static void test() throws Exception{
	    	 PropertyConfigurator.configure("C:\\Users\\Online Test\\git\\phpTravelers\\Travelers\\Log4j.properties");
			Fillflightdetails();
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src,new File("C:\\screenshot\\screenshot1.png"));
			log.info("Flight_Result");

		}
	      @AfterTest
	  	public void close() throws IOException
	  	{
	    	  
	    	  flight_search.closeWindow3();
	  	}

	}


