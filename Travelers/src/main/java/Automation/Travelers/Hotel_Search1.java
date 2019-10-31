package Automation.Travelers;
 

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

 

public class Hotel_Search1 extends LaunchBrowser {

 

    static By city_click= By.xpath("//div[@id='s2id_autogen1']");
    static By city_Text= By.xpath("//div[@id='s2id_autogen1']//a[@class='select2-choice']");
    static By check_in= By.xpath("//input[@id='checkin']");
    static By check_out= By.xpath("//input[@id='checkout']");
    static By adults= By.xpath("//div[contains(@class,'col o2')]//button[contains(@class,'btn btn-white bootstrap-touchspin-up')][contains(text(),'+')]");
    static By child= By.xpath("//div[contains(@class,'col 01')]//button[contains(@class,'btn btn-white bootstrap-touchspin-up')][contains(text(),'+')]");
    static By search= By.xpath("//div[contains(@class,'col-md-2 col-xs-12 o1')]//button[contains(@class,'btn btn-primary btn-block')][contains(text(),'Search')]");
    static By checkin= By.xpath("//div[1]//nav[1]//div[2]");
    static By next=By.xpath("//body[@class='with-waypoint-sticky']/div[@id='datepickers-container']/div[1]/nav[1]/div[3]/*[1]");
    static By checkout= By.xpath("//div[2]//nav[1]//div[2]");
    static By next1=By.xpath("//div[15]//div[1]//tr[1]//th[3]");
    
    
    
    public static void hotelSearchButton() throws Exception{
        driver.findElement(city_click).click();
        driver.findElement(city_Text).sendKeys(prop.getProperty("location"));
        driver.findElement(By.xpath("//span[@class='select2-match'][contains(text(),'"+prop.getProperty("location")+"')]")).click();
        
        //check-in
        driver.findElement(check_in).click();
        driver.findElement(By.xpath("//div[1]//nav[1]//div[2]//i[1]")).click();
        driver.findElement(By.xpath("//div[contains(text(),'Nov')]")).click();
       driver.findElement(By.xpath("//div[@class='datepicker--cell datepicker--cell-day'][contains(text(),'19')]")).click();
       //check-out
        driver.findElement(check_out).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@id='datepickers-container']//div[2]//nav[1]//div[2]")).click();
        driver.findElement(By.xpath("//div[@class='datepicker--months datepicker--body active']//div[@class='datepicker--cell datepicker--cell-month'][contains(text(),'Dec')]")).click();
        driver.findElement(By.xpath("//div[@id='datepickers-container']//div[2]//div[1]//div[20]")).click();
        //child
        driver.findElement(child).click();
        driver.findElement(search).click();
         
    }
    public static void closeWindow2() throws IOException
    {
   	 driver.close();
    
   	}
}

 