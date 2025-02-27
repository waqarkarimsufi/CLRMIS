package SyntecX.CLRMIS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;

public class loginTD {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
    	 WebDriverManager.chromedriver().setup(); 
	       driver = new ChromeDriver();
	      System.out.println("Title of the page is: " + driver.getTitle());
	       driver.manage().window().maximize();
    }

    @Test(dataProvider = "excelData")
    public void loginTest(String username, String password) {
    	driver.get("https://clrmis.syntracx.com/login");

    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	        wait.until(ExpectedConditions.elementToBeClickable(By.id("inputUsername"))).sendKeys(username);
         driver.findElement(By.id("inputPassword")).sendKeys(password);
         driver.findElement(By.id("btnlogin")).click();

        // Add assertions to verify successful login
        System.out.println("Tested with: " + username + " / " + password);
        
       
        try {
 			Thread.sleep(4000);
 		} catch (InterruptedException e) { 
 		
 			e.printStackTrace();
 		} 
        String expectedUrl = "https://clrmis.syntracx.com/token";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl, "URL did not match the expected URL");

        System.out.println("Actual URL is: " + actualUrl); 
        
    }

    @DataProvider(name = "excelData")
    public Object[][] getExcelData() {
        return ExcelUtils.readExcel("D:\\sheet1.xlsx", "Sheet1");
    }

    @AfterMethod
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

