package Pages;

import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BasePage.BasePage;
import io.appium.java_client.android.AndroidDriver;

public class CategoiresPage extends HomePage{

	AndroidDriver driver=BasePage.setUp();
	
	 public CategoiresPage() throws MalformedURLException,InterruptedException {
	        super(); // Call the superclass constructor
	        
	    }
	 public void view() {
		 WebElement go = driver.findElement(By.id("com.meesho.supply:id/cl_bottom_nav"));
		 BasePage.clickElement(go);
	 }
	 public void select() {
		 List <WebElement>categories =driver.findElements(By.className("android.view.ViewGroup"));
		 WebElement Men=categories.get(0);
		 BasePage.clickElement(Men);
		 
	 }
	 
}
