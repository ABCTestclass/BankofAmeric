package vbbgroup;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class A7_INR_optionsvalidation {
	
	public WebDriver driver;
	
	
	
  @Test
  public void options() {
	  
List<WebElement> allvalues = new Select(driver.findElement(By.id("day"))).getOptions();
	  System.out.println(allvalues.get(4).getText());
	  
	  for (int i = 0; i < allvalues.size(); i++) {
		  System.out.println(allvalues.get(i).getText());
		  
		  if (allvalues.get(i).getText().equalsIgnoreCase("15")) {
			
			  System.out.println("Pass");
		} else {
			
			System.out.println("Fail");

		}
		
	}
	  
	  
  }
  
  
  @BeforeTest
  public void beforeTest() throws Exception {
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://www.facebook.com/reg");
	  driver.manage().window().maximize();
	  
	Thread.sleep(3000);
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  
  }

}
