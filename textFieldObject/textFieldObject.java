package textFieldObject;

import org.openqa.selenium.By;

import VantiqTest.utility;

public class textFieldObject extends utility {
	
	public void subscriptionNameTextField (String name) {
		driver.findElement(By.cssSelector("#name")).sendKeys(name);
	}
  
	
	
	

}
