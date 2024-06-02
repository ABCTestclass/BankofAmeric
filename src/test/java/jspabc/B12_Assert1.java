package jspabc;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class B12_Assert1 {
	
	public WebDriver driver;
	
	
	
  @Test
  public void funoperation() {
	  
	  String Actualtitle = "Mercury Tours";
	  
	   String Expectedtitle = driver.getTitle();
	   
	  System.out.println(Expectedtitle);
	  
	  
	  System.out.println("welcome to selenium");
	  
	 Assert.assertEquals(Actualtitle, Expectedtitle);
	  
	  System.out.println("Assertion start here...");
	  
	  System.out.println("A blog for software Testers");
	  
	  driver.quit();
	  
	  

  }
  
  
  
  @BeforeTest
  public void beforeTest() throws Exception {
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/newtours/");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  
  }

}
