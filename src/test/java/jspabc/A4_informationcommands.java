package jspabc;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class A4_informationcommands {
	
	public WebDriver driver;
	
  @Test (priority = 1 )
  public void gmail() throws Exception {
	  
	String str1  =  driver.findElement(By.linkText("Gmail")).getText();
	  System.out.println(str1);
	 Thread.sleep(3000); 
  }
	  
	
	  @Test (priority = 2 )
	  public void google_image() throws Exception {
		  
		String str2  =  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/img")).getAttribute("alt");
		  System.out.println(str2);
	Thread.sleep(3000);
	
 }
	  
	  @Test (priority = 3 )
	  public void searchbutton() throws Exception {
		  
		String str3  =  driver.findElement(By.name("btnK")).getAttribute("value");
		  System.out.println(str3);
	      Thread.sleep(3000);
	  }
  
  
  @BeforeTest
  public void beforeTest() throws Exception {
	  
	  WebDriverManager.chromedriver().setup();
	  
	  driver = new ChromeDriver();
	  
	  driver.get("https://www.google.com/");
	  
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  
  }

}
