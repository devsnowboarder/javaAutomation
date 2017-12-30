package buttonsObject;

import org.openqa.selenium.By;

import VantiqTest.utility;


public class buttonsObject extends utility {
	
	public void newSubscriptions () throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
	}

}
