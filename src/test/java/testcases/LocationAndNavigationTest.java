package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import pages.LocationAndNavigation;

public class LocationAndNavigationTest {
    public static void main(String[] args) {
    	System.setProperty("webdriver.chrome.driver","C:\\sabhyata\\drivers\\chromedriver_1\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.practo.com");
        driver.manage().window().maximize();

        LocationAndNavigation ln = PageFactory.initElements(driver, LocationAndNavigation.class);
        ln.locAndNavAction("Chennai");
    }
}