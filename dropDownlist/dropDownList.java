package dropDownlist;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import VantiqTest.utility;

import org.openqa.selenium.WebDriver;


public class dropDownList extends utility{ 
	
	public void dropDownList (String dropDownList) {
		
		Select selectBox = new Select(driver.findElement(By.xpath(dropDownList)));
 	    selectBox.selectByIndex(2);
 	    
 	    List<WebElement> selectOptions = selectBox.getOptions();
 	    for ( WebElement temp : selectOptions) {
 	    	    System.out.println(temp.getText());
 	    	    if (temp.getText().contains("ArsTrackingAdapter")) {
 	    	    	    System.out.println("+++++++++++++++++++++++     Found it======= ");
 	    	    }
	    }
	}
}

