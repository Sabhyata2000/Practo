package test1;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import test1.Login;

public class SetLocation {
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
	  
	  JavascriptExecutor js = (JavascriptExecutor) driver;
      driver.findElement(By.xpath("//*[@id=\"c-omni-container\"]/div/div[1]/div[1]/input")).sendKeys("Chennai",
      Keys.ENTER);
      js.executeScript("arguments[0].click();",
      driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[4]/div/div/div/div/div[3]/div/a")));
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\sabhyata\\drivers\\chromedriver_1\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://www.practo.com");
		driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
