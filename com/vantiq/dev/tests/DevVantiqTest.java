package com.vantiq.dev.tests;

import linkObject.linkObject;


import org.testng.annotations.Test;

import VantiqTest.utility;
import findRecord.findRecords;
import subscription.subscriptions;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;




//Learn/vatiq/VatiqWorkSpace2/vantiq/src/test/java/com/vantiq/dev/tests

public class DevVantiqTest extends utility {
	
	utility  vantiq = new utility();
	linkObject linkObject = new linkObject();
	
	findRecords findRecord = new findRecords();
	subscriptions subscription = new subscriptions();
	
	

	@BeforeMethod
	public void beforeMethod() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/mikeair/tools/web_drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Thread.sleep(2000);
		
	}
	
	@Test ( priority =0 )
	public void findRecord() throws InterruptedException {
		 vantiq.baseURL();
		vantiq.loginVantiq();
		Thread.sleep(1000);
		linkObject.linkObjectItems("Data");
	    findRecord.findRecords();		
		
	}
	

	@Test ( priority =1 )
	public void addRecord() throws InterruptedException {
		
		 vantiq.baseURL();
		 vantiq.loginVantiq();
		 linkObject.linkObjectItems("Data");
		 linkObject.linkObjectItems("Add Record");  
	    		
	}
	
		
	@Test ( priority =2 )
	public void subscriptions() throws InterruptedException {
		
		 vantiq.baseURL();
		 vantiq.loginVantiq();
		 linkObject.linkObjectItems("Data");
		 linkObject.linkObjectItems("Subscriptions");  
		 subscription.createNewsubscriptions();
	    		
	}

	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(7000);
		driver.quit();
	}

}
