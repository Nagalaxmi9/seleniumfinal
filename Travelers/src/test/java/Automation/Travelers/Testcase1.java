package Automation.Travelers;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testcase1  extends Homepage {
	@BeforeTest
	public static void test1() throws Exception {
        LaunchBrowser.Launch(); 
        Homepage.signup();
	}
	static Logger log= Logger.getLogger("Testcase1");
	@Test
	public static void userRegistration() throws Exception  {
		PropertyConfigurator.configure("C:\\Users\\Online Test\\git\\phpTravelers\\Travelers\\Log4j.properties");
		Homepage h=new Homepage();
		Registration r = new Registration();
		r.firstname().sendKeys(h.prop.getProperty("firstname"));
		r.lastname().sendKeys(h.prop.getProperty("lastname"));
		r.mobile().sendKeys(h.prop.getProperty("mobile"));
		r.email().sendKeys(h.prop.getProperty("email"));
		r.password().sendKeys(h.prop.getProperty("password"));
		r.confirmpassword().sendKeys(h.prop.getProperty("confirmpassword"));
		r.Rsubmit();
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:\\screenshot\\screenshot.png"));
		log.info("Registartion_Result");
		
		
		

}
@AfterTest
public void close() throws IOException
{
	Registration.closeWindow();
	
}
}