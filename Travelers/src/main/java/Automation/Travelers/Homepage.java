package Automation.Travelers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage extends LaunchBrowser  {
	
	static By myaccount = By.xpath("//div[@class='dropdown dropdown-login dropdown-tab']//a[@id='dropdownCurrency']");
	static By signup = By.xpath("//a[@class='dropdown-item tr']");
	static By login=By.xpath("//a[@class='dropdown-item active tr']");
	static By hotel=By.xpath("//a[@class='text-center hotels active']");
	static By flights=By.xpath("//span[contains(text(),'Flights')]");
	
	
	
	public static void signup() {
		driver.findElement(myaccount).click();
		driver.findElement(signup).click();
		
	}
	public static  void login() {
		
		driver.findElement(myaccount).click();
		driver.findElement(login).click();
		
	}

	public static void hotel() {
		driver.findElement(hotel).click();
		
		
	}
	public static void flights() {
		driver.findElement(flights).click();
		
		
	}
	
		}
	

