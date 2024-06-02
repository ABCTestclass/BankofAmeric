package csesection;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class PopupwWndow {
	
	public WebDriver driver;
	
	
  @Test
  public void windowpopup() throws Exception {
	  
	  
	  driver.findElement(By.linkText("Open New Seperate Windows")).click();
	  Thread.sleep(3000);
	  
	  driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();
	  Thread.sleep(0);
	  
	   String backtoParentwindow   =  driver.getWindowHandle();
	  
	  
	  
	 for(String childwindowhandle :  driver.getWindowHandles())
		 
	 {
		 
		 driver.switchTo().window(childwindowhandle);
		 
	 }
	  
	 driver.manage().window().maximize();
	 Thread.sleep(3000);
	 
	 driver.findElement(By.xpath("//span[contains(text(),'Blog')]")).click();
	 
	 driver.close();
	 
	 driver.switchTo().window(backtoParentwindow);
	 Thread.sleep(10000);
	 
	 driver.findElement(By.linkText("Home")).click();
	 Thread.sleep(3000);
	 
  }
  
  
  
  @BeforeTest
  public void beforeTest() throws Exception {
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://demo.automationtesting.in/Windows.html");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	 
	  
  }

  @AfterTest
  public void afterTest() {
	  
  }

}
