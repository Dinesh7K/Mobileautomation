package Pages;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.FindBy;

import BasePage.BasePage;
import io.appium.java_client.android.AndroidDriver;
public class HomePage extends BasePage{
	BasePage b=new BasePage();
	AndroidDriver driver=BasePage.setUp();
	//By back=By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");//
	@FindBy(xpath="//android.widget.ImageButton[@content-desc=\'Navigate up\']")
	WebElement back;
	
	 public HomePage() throws MalformedURLException,InterruptedException {
	        super(); // Call the superclass constructor
	    }
	 public void loading() throws InterruptedException {
		  WebElement App =driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Predicted app: Meesho\"]"));
	        BasePage.clickElement(App);
	        Thread.sleep(5000);
	        WebElement language= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.GridView/android.widget.FrameLayout[2]/android.widget.ImageView"));
	        BasePage.clickElement(language);
	        Thread.sleep(2000);
	        WebElement notifications=driver.findElement(By.id("com.android.permissioncontroller:id/permission_deny_button"));
	        BasePage.clickElement(notifications);
	 }
	 public void search() throws InterruptedException {
		 WebElement search=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.EditText"));
		 BasePage.clickElement(search);
		 WebElement text=driver.findElement(By.id("com.meesho.supply:id/query_edit_text"));
		 BasePage.setValue(text, "Mens");
	     WebElement icon=driver.findElement(By.id("com.meesho.supply:id/search_icon"));
	     BasePage.clickElement(icon);
	     Thread.sleep(2000);
	     List<WebElement> men= driver.findElements(By.className("android.widget.TextView"));
	     WebElement boot=men.get(5);
	     BasePage.clickElement(boot);
	     
     }
	 public void results() throws InterruptedException {
		 
		 List<WebElement>texts=driver.findElements(By.className("android.widget.TextView"));
		 for(int i=0;i<texts.size();i++) {
			 String text=texts.get(i).getText();
			 System.out.println(text);
		    }
		 Thread.sleep(2000);
		 b.scrollPageV();
		 BasePage.clickElement(back);
		 Thread.sleep(2000);
		 

		
		 }
	 public void buy() throws InterruptedException {
		WebElement boot=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.GridView/android.view.ViewGroup[4]/android.widget.ImageView[1]"));
		BasePage.clickElement(boot);
		//WebElement buy=driver.findElement(By.className("android.widget.LinearLayout"));
		//BasePage.clickElement(buy);
		Thread.sleep(1000);
	 }
	
	 

}
	 
	 


