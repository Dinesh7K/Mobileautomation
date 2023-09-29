package Utility;

import java.net.MalformedURLException;

import BasePage.BasePage;
import io.appium.java_client.android.AndroidDriver;

public class Wait {
	
	
	protected AndroidDriver driver=BasePage.setUp();
	public Wait()throws MalformedURLException,InterruptedException{
		super();
		// TODO Auto-generated constructor stub
	}
	public void setImplicitWait(int timeoutInSeconds) {
       // driver.manage().timeouts().
    }

}
