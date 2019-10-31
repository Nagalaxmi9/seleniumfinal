package Automation.Travelers;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testcase2 extends Login{
static Logger log= Logger.getLogger("Testcase2");
@Test
public static void Login() throws Exception {
	PropertyConfigurator.configure("C:\\Users\\Online Test\\git\\phpTravelers\\Travelers\\Log4j.properties");
	Homepage h=new Homepage();
	h.Launch();
	h.driver.get(h.prop.getProperty("url"));
	h.login();
	
	
	Login l=new Login();
	l.email().sendKeys(h.prop.getProperty("email"));
	l.password().sendKeys(h.prop.getProperty("password"));
	l.login1();
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src,new File("C:\\screenshot\\screenshot2.png"));
	log.info("login_Result");
}
	@AfterTest
	public void close() throws IOException
	{
		
		 Login.closeWindow1();
	}
	
	
	

	

}
