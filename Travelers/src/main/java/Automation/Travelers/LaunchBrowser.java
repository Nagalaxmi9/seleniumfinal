package Automation.Travelers;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	
	public static WebDriver driver;
	 public static Properties prop = new Properties();
     
	  public static void Launch() throws Exception
	  {
		  FileInputStream fis=new FileInputStream("C:\\Users\\Online Test\\git\\phpTravelers\\Travelers\\src\\main\\java\\Files\\base.properties");                                                                                                                                                         
		  prop.load(fis);
	     System.setProperty("webdriver.chrome.driver","C:\\Users\\Online Test\\Music\\chromedriver_win32 (2)\\chromedriver.exe");
	 	  driver = new ChromeDriver();
	 	 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	 	//driver.manage().window().maximize();
	 	driver.get(prop.getProperty("url"));
	 	

	 }

}
