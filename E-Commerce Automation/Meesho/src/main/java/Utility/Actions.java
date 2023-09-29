package Utility;

import java.net.MalformedURLException;
import java.sql.DriverManager;
import java.time.Duration;
import java.util.Collections;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;

import BasePage.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class Actions {
	    
	public Actions()throws MalformedURLException,InterruptedException{
		super();
		// TODO Auto-generated constructor stub
	}
	
	protected AndroidDriver driver=BasePage.setUp();
	
	
	 public static void clickElement(WebElement element) {
	        try {
	        	element.click();
	            
	        } catch (Exception e) {
	            System.out.println(e);
	        }
	    }
	 public static void setValue(WebElement element,String value) {
		 
		 try {
			 element.sendKeys(value);
		 }
		 catch(Exception e){
			 System.out.println(e);
		 }
		 
		 
	 }
	 public void scrollPageV() {
		 Dimension size = driver.manage().window().getSize();
		    int startX = size.getWidth() / 2;
		    int startY = size.getHeight() / 2;
		    int endX = startX;
		    int endY = (int) (size.getHeight() * 0.25);
		    PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
		    Sequence sequence = new Sequence(finger1, 1)
		        .addAction(finger1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY))
		        .addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
		        .addAction(new Pause(finger1, Duration.ofMillis(200)))
		        .addAction(finger1.createPointerMove(Duration.ofMillis(100), PointerInput.Origin.viewport(), endX, endY))
		        .addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

		    driver.perform(Collections.singletonList(sequence));
				 ;
	 }
	 public void scrollPageH() {
		 Dimension size = driver.manage().window().getSize();
		    int startX = 296;
		    int startY = 1975;
		    int endY = startY;
		    int endX = (int) (size.getWidth() * 0.25);
		    PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
		    Sequence sequence = new Sequence(finger1, 1)
		        .addAction(finger1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY))
		        .addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
		        .addAction(new Pause(finger1, Duration.ofMillis(200)))
		        .addAction(finger1.createPointerMove(Duration.ofMillis(100), PointerInput.Origin.viewport(), endX, endY))
		        .addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

		    driver.perform(Collections.singletonList(sequence));
				 ;
	 }
	 public void scrollByElement(WebElement element) {
		 
	 }
	 public void Screenshot() {
		 
	 }
}


