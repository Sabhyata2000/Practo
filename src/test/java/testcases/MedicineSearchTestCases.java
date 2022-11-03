package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


import pages.MedicineSearch;

public class MedicineSearchTestCases {
    static WebDriver driver;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
    	System.setProperty("webdriver.chrome.driver","C:\\sabhyata\\drivers\\chromedriver_1\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.practo.com/order?utm_source=practonavbar&utm_medium=referral&utm_campaign=practonavbarredirect");
        driver.manage().window().maximize();
        
        MedicineSearch medsch=PageFactory.initElements(driver, MedicineSearch.class);
        medsch.skinClickAction();
        medsch.acneClickAction();
        
        //driver.quit();

    }
}