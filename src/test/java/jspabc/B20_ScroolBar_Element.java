package jspabc;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class B20_ScroolBar_Element {
	
	public WebDriver driver;
	
	
  @Test
  public void Scrollflow() throws Exception {
	  
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	
	  
	  //Find Element by Link text and store in variable  "Element" WebElement
	  
	     WebElement Element = driver.findElement(By.linkText("Linux"));
	     
	     //This will Scroll the page till the Element is found
	     
	     js.executeScript("arguments[0].scrollIntoView();", Element);
	     
	     Thread.sleep(3000);
	     
	     
	     
	     
	     
	     
	  
	  
	  
  }
  
  
  @BeforeTest
  public void beforeTest() throws Exception {
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/guru99home/");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
