package sonar_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class NewTest {
	
	WebDriver driver;
	
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:/Users/iDashbaord/Downloads/chromedriver_win32/chromedriver.exe");
	  
	  driver = new ChromeDriver();
	     String url = "https://www.google.com";
         driver.get(url);
         String expectedTitle = "Google";
               String actualTitle = driver.getTitle();
               Assert.assertEquals(actualTitle, expectedTitle);
               
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("Starting the browser session");
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  System.out.println("Closing the browser session");
	  Thread.sleep(3000);
	  driver.close();
	        //driver.quit();
  }

}
