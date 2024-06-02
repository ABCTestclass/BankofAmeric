package jspabc;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class A8_Boolean_Oneway {
	
	public WebDriver driver;
	
	
  @Test
  public void Roundtrip() {
	  
	  driver.findElement(By.xpath("//*[@id=\"approot\"]/div/app-home/div/app-home-container/div[1]/div/app-trip-search/div/div[1]/div/div/button[2]")).click();
	  
	//boolean printcondition = driver.findElement(By.xpath("//*[@id=\"approot\"]/div/app-home/div/app-home-container/div[1]/div/app-trip-search/div/div[1]/div/div/button[2]")).isDisplayed();
	  
	       // System.out.println(printcondition);
	  
	  
	
	        
	        
	        
	  WebElement ele1 =  driver.findElement(By.xpath("//*[@id=\"approot\"]/div/app-home/div/app-home-container/div[1]/div/app-trip-search/div/div[1]/div/div/button[2]"));
	        
                 if (ele1.isEnabled()) {
					
                	 System.out.println("Round trip is there Passed");
                	 
				} else {
					
					System.out.println("No not avalable");
					
				}

				}
  
  
  
  
  
  @BeforeTest
  public void beforeTest() {
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://www.savaari.com/");
	  driver.manage().window().maximize();
	  
  }
  
  

  @AfterTest
  public void afterTest() {
	  
  }

}
