package Automation.Travelers;

 
import java.io.IOException;
import java.util.List;
 
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
 
public class flight_search extends LaunchBrowser{
      static By Flight=By.xpath("//a[contains(@class,'text-center flights')]");
       static By From_city=By.xpath("//div[@id='s2id_location_from']");
       static By From_city1=By.xpath("//div[@id='s2id_location_from']//a[@class='select2-choice']");
       static By To_city=By.xpath("//div[@id='s2id_location_to']");
       static By To_city1=By.xpath("//div[@id='s2id_location_to']//a[@class='select2-choice']");
       static By check_in=By.xpath("//input[@id='departure']");
      static By guest=By.xpath("//div[@class='col-md-1 form-group go-right col-xs-12']//input[@placeholder='0']");
      static By cookies=By.xpath("//*[@id='cookyGotItBtnBox']/div/button");
       
       public static void Fillflightdetails() throws InterruptedException
       {
           //fromcity
         
           driver.findElement(Flight).click();
           //driver.findElement(By.xpath("//button[@id='cookyGotItBtn']")).click();
           driver.findElement( From_city).click();
           
           driver.findElement( From_city1).sendKeys(prop.getProperty("cityname1"));
           driver.findElement(From_city1).sendKeys((Keys.DOWN));
           Thread.sleep(1000);
           driver.findElement(From_city1).sendKeys(Keys.ENTER);
           
           
         //tocity
           driver.findElement(To_city).click();
           driver.findElement(To_city1).sendKeys(prop.getProperty("cityname2"));
           driver.findElement(To_city1).sendKeys((Keys.DOWN));
           Thread.sleep(1000);
           driver.findElement(To_city1).sendKeys(Keys.ENTER);
           
           //date
           driver.findElement(cookies).click();
           driver.findElement(By.xpath("//input[@id='FlightsDateStart']")).click();
           driver.findElement(By.xpath("//div[7]//nav[1]//div[2]")).click();
           driver.findElement(By.xpath(" //*[@id='datepickers-container']/div[7]/div/div[2]/div/div[11]")).click();
         //*[@id="datepickers-container"]/div[7]/div/div[2]/div/div[11]
           for(int i = 1 ; i<=35 ; i++) {             
                String str1 = driver.findElement(By.xpath("//div[7]//div[1]//div[1]//div[2]//div["+i+"]")).getText();             
                if(str1.equals("1")) {                 
                    for(int j = i ; j<=35 ; j++) {                     
                        str1 = driver.findElement(By.xpath("//div[7]//div[1]//div[1]//div[2]//div["+j+"]")).getText();                                         
                        if(str1.equals(prop.getProperty("checkin_day1"))) {                         
                            driver.findElement(By.xpath("//div[7]//div[1]//div[1]//div[2]//div["+j+"]")).click();                         
                            break;
                            
                        }
                    }
                        }
                }
           //adults
           
          //driver.findElement(By.xpath("//div[contains(@class,'row gap-5')]//div[1]//div[1]//div[1]//div[1]//span[3]//button[1]")).click(); 
          driver.findElement(By.xpath("//*[@id='flights']/div/div/form/div/div[2]/div[3]/div/div/div[1]/div/div[2]/div/span[3]/button[1]")).click();
        
           //child
          // driver.findElement(By.xpath("//div[contains(@class,'row gap-10 mb-15 align-items-end')]//div[2]//div[1]//div[1]//div[1]//span[3]//button[1]")).click();
           driver.findElement(By.xpath("//*[@id='flights']/div/div/form/div/div[2]/div[3]/div/div/div[2]/div/div[2]/div/span[3]/button[1]")).click();
           //infant
           //driver.findElement(By.xpath("//div[contains(@class,'col-md-3 col-xs-12')]//div[3]//div[1]//div[1]//div[1]//span[3]//button[1]")).click();
           driver.findElement(By.xpath("//*[@id='flights']/div/div/form/div/div[2]/div[3]/div/div/div[3]/div/div[2]/div/span[3]/button[1]")).click();
          //search
         driver.findElement(By.xpath("//div[contains(@class,'col-xs-12 col-md-1')]//button[contains(@class,'btn-primary btn btn-block')][contains(text(),'Search')]")).click();
       
        }

        public static void closeWindow3() throws IOException
	    {
	   	 driver.close();
	    
	   	}
   
   
}

	   

	        
		   
		   
		                         
		