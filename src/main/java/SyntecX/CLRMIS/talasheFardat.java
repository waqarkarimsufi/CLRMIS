package SyntecX.CLRMIS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class talasheFardat {
	
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
         	}	  }

	  @Test(priority=1)
      public void talasheFardat() {
		  try {
	  			Thread.sleep(6000);
	  		} catch (InterruptedException e) { 
	  		
	  			e.printStackTrace();
	  		}
 	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
 	 
	    	 WebElement language= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@for='languageToggle'] ")));
	    	language.click();
		  
	    	WebDriverWait fardat = new WebDriverWait(driver, Duration.ofSeconds(20));
	       	fardat.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[name()='svg'][contains(@class,'custom-svg-new')])[3]"))).click();
       	 
       		WebDriverWait talashfardat = new WebDriverWait(driver, Duration.ofSeconds(20));
       	   	talashfardat.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[contains(text(),'تلاشِ فردات')])[1]"))).click();     
   	   
       	   	WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
       	   	wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='MouzaSelect']"))).click(); 
   	   
       	   	WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(20));
       	   	wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@type='button'])[2]"))).click();
   	   
       	   	WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(20));
       	   	wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@id='KhataNumber'])[1]"))).click();
       	   	
       	   	WebDriverWait wait5 = new WebDriverWait(driver, Duration.ofSeconds(20));
       	   	wait5.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(@type,'button')])[8]"))).click();
       	   	
       	   	WebDriverWait wait6 = new WebDriverWait(driver, Duration.ofSeconds(20));
       	   	wait6.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@alt='Alternate Text']"))).click();
       	   	
       	   	
       	   	
       	   	
       	   	
       	   	
       	   	
       	   	
      }

	  

        @AfterClass
        public void tearDown() {
       	
            if (driver != null) {
                driver.quit();
            } 
        
        
        



}  
        
 
	 
	 
	 
	 
}
