package test1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class AddProduct {
	WebDriver driver;
  @Test
  public void addProduct() throws InterruptedException {
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
	      
	      JavascriptExecutor jse = (JavascriptExecutor) driver;
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	      jse.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[4]/div/div[2]/div[2]/div[1]/div/div[1]/div/div/a/div")));
	      jse.executeScript("arguments[0].click();",driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[4]/div/div[2]/div[2]/div[1]/div/div[1]/div/div/a/div")));
	      
	      driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
	      JavascriptExecutor js2 = (JavascriptExecutor) driver;
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	      js2.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[4]/div/div[2]/div/div[2]/div[2]/div[1]/div/div[1]/a/div/div[1]")));
	      jse.executeScript("arguments[0].click();",driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[4]/div/div[2]/div/div[2]/div[2]/div[1]/div/div[1]/a/div/div[1]")));

	 	  driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[4]/div/div[2]/div/div[2]/div[2]/div[1]/div/div/div/div[2]/button")).click();
	 	  driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[4]/div/div[2]/div/div[2]/div[2]/div[1]/div/div/div/div[2]/div/div[3]/div")).click();
	 	  driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div[3]/div[2]/a/button/span")).click();

	 	//  driver.switchTo().defaultContent();

  }
  
 
  @BeforeTest
  public void setup() {
	  System.setProperty("webdriver.chrome.driver","C:\\sabhyata\\drivers\\chromedriver_1\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.practo.com");
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @AfterTest
  public void tearDown() {
	 driver.quit();
  }

}
