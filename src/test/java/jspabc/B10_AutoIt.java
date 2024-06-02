package jspabc;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class B10_AutoIt {
	
	
	public WebDriver driver;
	
  @Test
  public void operations() throws Exception {
	  
	  
	WebElement ele1 =  driver.findElement(By.xpath("//input[@id='uploadPicture']"));
	  
	ele1.sendKeys("C:\\Users\\admin\\Pictures\\swamy.jpg");
	
	Thread.sleep(3000);
	  
	  
	  
	  
	  
	  
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://demoqa.com/automation-practice-form");
	  driver.manage().window().maximize();
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  
	  
  }

}
