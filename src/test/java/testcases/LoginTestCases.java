package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import pages.LoginPage;

public class LoginTestCases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\sabhyata\\drivers\\chromedriver_1\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.practo.com");
        driver.manage().window().maximize();
        
        LoginPage loginpg=PageFactory.initElements(driver, LoginPage.class);
        loginpg.loginAction("7014346331","pragati@12345");
        driver.quit();

	}

}
