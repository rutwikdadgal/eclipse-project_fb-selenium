package com.sample.fb_selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //initialize the  web driver 
    	System.setProperty("webdriver.chrome.driver", "C:/softwares/chromedriver-win64/chromedriver.exe");
    	System.out.println("Initilized the chrome driver");
    	
    	//set properties
    	ChromeOptions chromeOptions = new ChromeOptions();
    	try {
    	    Thread.sleep(1000);
    	} catch (InterruptedException e) {
    	    // Handle the interrupted exception
    	    e.printStackTrace();
    	}

    	
    	//open url
    	WebDriver driver = new ChromeDriver(chromeOptions);
    	System.out.println("Opening url");
    	driver.get("https://www.facebook.com/login/");
    	
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	
    	//enter details
    	System.out.println("Entering details");
    	driver.findElement(By.id("email")).sendKeys("xyz@gmail.com");
    	try {
    	    Thread.sleep(1000);
    	} catch (InterruptedException e) {
    	    // Handle the interrupted exception
    	    e.printStackTrace();
    	}

    	
    	driver.findElement(By.id("pass")).sendKeys("1523088");
    	try {
    	    Thread.sleep(1000);
    	} catch (InterruptedException e) {
    	    // Handle the interrupted exception
    	    e.printStackTrace();
    	}

    	
    	System.out.println("Details Entered");
    	driver.findElement(By.id("loginbutton")).click();
    	try {
    	    Thread.sleep(1000);
    	} catch (InterruptedException e) {
    	    // Handle the interrupted exception
    	    e.printStackTrace();
    	}
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    	
    	//quit driver
    	//driver.quit();
    	
    }
}
