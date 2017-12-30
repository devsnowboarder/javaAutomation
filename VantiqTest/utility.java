package VantiqTest;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class utility {
	
	    public static WebDriver driver;
	    private final String BASE_URL= "https://dev.vantiq.com/ui/ide/index.html";
	    
	    public void baseURL ()
	    {
	    		driver.get(BASE_URL);
	    }
	
	public void loginVantiq() throws InterruptedException {
		driver.findElement(By.id("inputAdminUsername")).sendKeys("michael_l");
		driver.findElement(By.id("inputAdminPassword")).sendKeys("mlMyVest");
		driver.findElement( By.xpath("(//button[@type='button'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement( By.xpath("(//button[@type='button'])[3]")).click();
		Thread.sleep(2000);
		
	}

}
