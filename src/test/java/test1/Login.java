package test1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class Login {
	WebDriver driver;
  @Test
  public void f() {
	 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[1]/div[2]/div/div[3]/div[4]/span/a")).click();
	  WebElement user_name=driver.findElement(By.id("username"));
	  user_name.clear();
	  user_name.sendKeys("7014346331");
		
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("pragati@12345");
		
		driver.findElement(By.id("login")).click();
		Reporter.log("This is login test");
  }
  @BeforeTest
  public void beforeTest() {
		  System.setProperty("webdriver.chrome.driver","C:\\sabhyata\\drivers\\chromedriver_1\\chromedriver.exe");
			 driver=new ChromeDriver();
			driver.get("https://www.practo.com");
			driver.manage().window().maximize();
			Reporter.log("Inside the setup method where initialization is done.");
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
