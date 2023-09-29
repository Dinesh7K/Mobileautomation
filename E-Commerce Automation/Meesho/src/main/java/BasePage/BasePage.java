package BasePage;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import Utility.Actions;
import Utility.Reports;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;



public class BasePage extends Actions {
	
	
	 public BasePage() throws MalformedURLException, InterruptedException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static AndroidDriver setUp() throws MalformedURLException, InterruptedException {
	        DesiredCapabilities dc = new DesiredCapabilities();
	        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "14");
	        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "sdk_gphone64_arm64");
	        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
	        
	       dc.setCapability("appPackage", "com.google.android.apps.nexuslauncher");
	       dc.setCapability("appActivity", "com.google.android.apps.nexuslauncher.NexusLauncherActivity");
	        
	        
	        URL url= new URL("http://127.0.0.1:4723/");
	      
	        
	        
	        AndroidDriver driver=new AndroidDriver(url,dc);
	      
	        
	        
			return driver;
	   }


}
