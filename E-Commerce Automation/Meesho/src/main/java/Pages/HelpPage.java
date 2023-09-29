package Pages;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BasePage.BasePage;
import io.appium.java_client.android.AndroidDriver;

public class HelpPage {
	
	AndroidDriver driver=BasePage.setUp();
	
	 public HelpPage() throws MalformedURLException,InterruptedException {
	        super(); // Call the superclass constructor
	        
	    }
	 public void view() {
		 WebElement go = driver.findElement(By.id("com.meesho.supply:id/anchor_four"));
		 BasePage.clickElement(go);
	 }

}
