package p2;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class WebDriver_Testng_Testcase {
  public WebDriver driver;
	
 
  @Test
  public void tc001() throws Exception
  {
	//Identify Email editbox location
	driver.findElement(By.id("identifierId")).clear();
	driver.findElement(By.id("identifierId")).sendKeys("qadarshan@gmail.com",Keys.ENTER);
	Reporter.log("email_validation_completed");
	//manage java timegap for 2 seconds
	Thread.sleep(2000);
			
			
	//Identify password location and Submit login
	driver.findElement(By.name("password")).clear();
	driver.findElement(By.name("password")).sendKeys("mupepo91989",Keys.ENTER);
	System.out.println("password validation completed error msd displayed");
  }
  
  
  
  
  
  
  
  
  
  
  @BeforeClass
  public void beforeClass() throws IOException 
  {
	  System.setProperty("webdriver.chome.driver", "C:\\Users\\sunny\\git\\Project_Online_Aug\\HDFC_ebabking\\chomedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://gmail.com");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  
  }

  @AfterClass
  public void afterClass() throws Exception 
  {
	  Thread.sleep(8000);
	  driver.close();
	  
  }
  

}
