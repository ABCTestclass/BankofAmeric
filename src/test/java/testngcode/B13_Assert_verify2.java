package testngcode;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class B13_Assert_verify2 {
	
	public WebDriver driver;
	
	
	
  @Test
  public void functionorder() throws Exception {
	  
	  String Actualvalue = "$3";
	  String Expectedvalue = driver.findElement(By.xpath("//b[normalize-space()='$398']")).getText();
	  System.out.println(Expectedvalue);
	  Thread.sleep(3000);
	  
			  
			  try {
				
				 System.out.println("Assertion start here..."); 
				 
				 
				 Assert.assertEquals(Actualvalue, Expectedvalue);
				 
				
				 
				 
				  
			} 
			  
			  finally {
				
				  System.out.println("Apple");
					 
					 System.out.println("A blog for sowtware Tester");
				
				
				
			}
			  
			  
	  
	  
	  
	  
  }
  
  
  @BeforeTest
  public void beforeTest() throws Exception {
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("http://demo.guru99.com/test/newtours/");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  
	  
  }
  
  

  @AfterTest
  public void afterTest() {
	  
	  
  }

}
