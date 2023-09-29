package Testing;

import java.net.MalformedURLException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.Writable;

import BasePage.BasePage;
import Pages.CategoiresPage;
import Pages.HelpPage;
import Pages.HomePage;
import Utility.Reports;

public class TestCases extends BasePage{
	HomePage h=new HomePage();
	 public ExtentReports report=Reports.getReportInstance();
	 public ExtentTest logger;
	 public TestCases() throws MalformedURLException,InterruptedException {
	        super(); // Call the superclass constructor
	        
	    }
	 @BeforeTest
	 public void setup() throws MalformedURLException, InterruptedException {
		 logger=report.createTest("Loading Mobile and Clicking Meesho App");
		 logger.log(Status.INFO,"Opening Mobile Emulator");
		 h.loading();
		 logger.log(Status.INFO, "Opening Meesho");
		 String currentDirectory = System.getProperty("user.dir");
		 System.out.println("Current working directory: " + currentDirectory);

	 }
	   @Test
	   public void test1() throws MalformedURLException,InterruptedException {
		   logger=report.createTest("Searching Product");
           h.search();
		   logger.log(Status.INFO, "Searching for Mens wear");
		   h.results();
		   logger.log(Status.INFO, "Checking the result");
		   
	}
	  @Test
	  public void test2() throws MalformedURLException,InterruptedException {
		  
		  logger=report.createTest("Buying Product");
		  h.buy();
		  logger.log(Status.INFO,"Going to cart page");
		  
		   
	}
	  @Test
	  public void test3() throws InterruptedException, MalformedURLException {
		  logger=report.createTest("Navigating");
		  CategoiresPage c =new CategoiresPage();
		  c.select();
		  logger.log(Status.INFO,"Going to cart page");
		  Thread.sleep(2000);
		  
		  
	  }
	  @AfterMethod
	  public void report() {
		  report.flush();
	  }
	  @AfterTest
	  public void close() {
		  driver.quit();
		  
	  }

}
