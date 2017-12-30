package linkObject;

import org.openqa.selenium.By;

import VantiqTest.utility;

public class linkObject  extends utility {
	
	   public void linkObjectItems(String objectName) throws InterruptedException {
		 
		   Thread.sleep(1000);
		   driver.findElement(By.linkText(objectName)).click();
	   }
	  
	  

}
