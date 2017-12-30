package addRecord;

import org.openqa.selenium.By;

import VantiqTest.utility;

public class addRecord extends utility {
	
	public void addRecord() throws InterruptedException {
		driver.findElement(By.linkText("Add Record")).click();
 	    Thread.sleep(1000);	
		
		
	}

}
