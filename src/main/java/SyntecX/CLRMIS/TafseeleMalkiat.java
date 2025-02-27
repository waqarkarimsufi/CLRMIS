package SyntecX.CLRMIS;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TafseeleMalkiat {
	
	
	WebDriver driver;
	 
	
	 
	 
    @Parameters("browser")
    @BeforeClass
public void setup(String browser ) {
  	  
  	  

    	if(browser.equalsIgnoreCase("chrome")) {
    	
        WebDriverManager.chromedriver().setup(); 
        driver = new ChromeDriver(); 

	        driver.get("https://clrmis.syntracx.com/login");
	    
	        
	        System.out.println("Title of the page is: " + driver.getTitle());
	        driver.manage().window().maximize();
	      
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	        WebElement usernameField = wait.until(ExpectedConditions.elementToBeClickable(By.id("inputUsername")));
          WebElement passwordField = driver.findElement(By.id("inputPassword"));
          WebElement loginButton = driver.findElement(By.id("btnlogin"));
          usernameField.sendKeys("haider@CLRMIS");
          passwordField.sendKeys("12345678");
          loginButton.click();  
        
    	}
    	
    	
    	else if(browser.equalsIgnoreCase("firefox")) {
        	
            WebDriverManager.firefoxdriver().setup(); 
            driver = new FirefoxDriver(); 

	        driver.get("https://clrmis.syntracx.com/login");
	    
	        
	        System.out.println("Title of the page is: " + driver.getTitle());
	        driver.manage().window().maximize();
	      
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	        WebElement usernameField = wait.until(ExpectedConditions.elementToBeClickable(By.id("inputUsername")));
            WebElement passwordField = driver.findElement(By.id("inputPassword"));
            WebElement loginButton = driver.findElement(By.id("btnlogin"));
            usernameField.sendKeys("haider@CLRMIS");
            passwordField.sendKeys("12345678");
            loginButton.click();  
            
        	}
    	
       else if(browser.equalsIgnoreCase("edge")) {
        	
            WebDriverManager.edgedriver().setup(); 
            driver = new EdgeDriver(); 
            	              

	        driver.get("https://clrmis.syntracx.com/login");
	    
	        
	        System.out.println("Title of the page is: " + driver.getTitle());
	        driver.manage().window().maximize();
	      
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	        WebElement usernameField = wait.until(ExpectedConditions.elementToBeClickable(By.id("inputUsername")));
            WebElement passwordField = driver.findElement(By.id("inputPassword"));
            WebElement loginButton = driver.findElement(By.id("btnlogin"));
            usernameField.sendKeys("haider@CLRMIS");
            passwordField.sendKeys("12345678");
            loginButton.click();  
        	}	  
     }
	
    
     @Test(priority =1)    
    public void tafseeleMalkiat() {
    	 try {
	  			Thread.sleep(6000);
	  		} catch (InterruptedException e) {
	  		
	  			e.printStackTrace();
	  		}
    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    	 
	    	 WebElement language= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@for='languageToggle'] ")));
	    	language.click();
	    	
	    	WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
    	
	    	wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//body/div[@id='app']/div[contains(@class,'page')]/div[contains(@class,'sidebar shadow')]/div[contains(@class,'nav-scrollable')]/nav[contains(@class,'rtl')]/div[3]/a[1]/span[1]"))).click();   
    	 WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(20));
    	
    	 wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/nav[1]/div[3]/div[1]/ul[1]/a[4]"))).click();
    	 WebDriverWait wait8 = new WebDriverWait(driver, Duration.ofSeconds(20));
    	 wait8.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='selectMouza']"))).click();
    	 driver.findElement(By.xpath(" //small[contains(text(),'پاوکہ')]  ")).click();    	
    	WebDriverWait wait7 = new WebDriverWait(driver, Duration.ofSeconds(20));
    	
    	wait7.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(text(),'تلاش کریں')])[1]"))).click();
    	
    	WebDriverWait waitSearch=new  WebDriverWait(driver, Duration.ofSeconds(20));
    	waitSearch.until(ExpectedConditions.elementToBeClickable(By.xpath("(//td[@data-label='انتخاب کریں'])[1]"))).click();
    	
    	WebDriverWait waitKhata=new  WebDriverWait(driver, Duration.ofSeconds(20));
    	waitKhata.until(ExpectedConditions.elementToBeClickable(By.xpath("(//td[@data-label='انتخاب کریں'])[4]"))).click();
    	
    	WebDriverWait waitPrint=new  WebDriverWait(driver, Duration.ofSeconds(20));
    	waitPrint.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='intiqalatbtnewform']"))).click();
    	 
    	
    	
    	
    	
    	
    	
    	
    	
    	}
     
    
     @AfterClass
     public void tearDown() {
    	
         if (driver != null) {
             driver.quit();
         }  

     

      

} 
     
     
     
}
     
     
     
	
   
