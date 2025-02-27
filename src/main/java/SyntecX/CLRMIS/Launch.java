package SyntecX.CLRMIS;
import org.testng.Assert;
import org.testng.SkipException;

import io.github.bonigarcia.wdm.WebDriverManager; // For automatic driver management

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Launch {
    WebDriver driver;
    
 
   
    @Parameters("browser")
    @BeforeClass
    public void setup(String browser) {
        // Setup WebDriver
    	
    	if(browser.equalsIgnoreCase("chrome")) {
    	
        WebDriverManager.chromedriver().setup(); 
        driver = new ChromeDriver(); 
        System.out.print("Chrome is launched"); 
        
    	}
    	
    	
    	else if(browser.equalsIgnoreCase("firefox")) {
        	
            WebDriverManager.firefoxdriver().setup(); 
            driver = new FirefoxDriver(); 
            System.out.print("Firfox is launched"); 
            
        	}
    	
       else if(browser.equalsIgnoreCase("edge")) {
        	
            WebDriverManager.edgedriver().setup(); 
            driver = new EdgeDriver(); 
            System.out.print("Edge is launched"); 
            
        	}
    	
    	
    	
    	
    	
    }

    @Test(priority =1)
    public void openWebsite() {
        // Open  website
        driver.get("https://clrmis.syntracx.com/");
        System.out.println("Title of the page is: " + driver.getTitle());
        driver.manage().window().maximize();
        try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
        
    }
    
      @Test(priority=2) 
     public void LoginPage() {
    	     	  //navigate to login button on hompage and select
    	  
    	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    	  
    	  WebElement login=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//b[normalize-space()='Login']")));
    	  login.click();
    	  
    	 System.out.println("titttle of the page is: " + driver.getTitle() );
    	 
}
  
           @Test(priority=3)
          public void invalidLogin() {
              // Testing invalid login
        	
        	   
        	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

               WebElement usernameField = wait.until(ExpectedConditions.elementToBeClickable(By.id("inputUsername")));

              WebElement passwordField = driver.findElement(By.id("inputPassword"));
              usernameField.sendKeys("haider@CLRMIS");
              passwordField.sendKeys("12345678912");
              
              WebDriverWait waitlogin = new WebDriverWait(driver, Duration.ofSeconds(20));
               waitlogin.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='text-center']//button[@id='btnlogin']"))).click();
            
          
  
             
              WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
              
              String errorMessage = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[contains(@class,'toast-body')][normalize-space()='Invalid Credentials!'])[2]"))).getText();
              System.out.println("Error Message: " + errorMessage);
              Assert.assertEquals(errorMessage, "Invalid Credentials!", "Error message should match");
              usernameField.clear();
              passwordField.clear();  
          }   
             @Test(priority=4)
              public void testEmptyUserName() {
                  // Testing with Empty Username 
            	 
                  WebElement usernameField = driver.findElement(By.id("inputUsername"));
                   WebElement passwordField = driver.findElement(By.id("inputPassword"));
                  WebElement loginButton = driver.findElement(By.xpath("//div[@class='text-center']//button[@id='btnlogin']"));
                  passwordField.clear();
                  usernameField.clear();

                  usernameField.sendKeys(" ");
                  passwordField.sendKeys("12345678");
                  loginButton.click();
                  try {
          			Thread.sleep(3000);
          		} catch (InterruptedException e) {
          		
          			e.printStackTrace();
          		} 
                  
                  

                  String errorMessage = driver.findElement(By.xpath("//div[@class='validation-message']")).getText(); 
                  System.out.println("Error Message: " + errorMessage);
                  Assert.assertEquals(errorMessage, "Username is required", "Error message should match");
                  passwordField.clear();
                  usernameField.clear();
                  
              
              }
              
                 @Test(priority=5)
              public void testEmptyPassword(){
                  // Testing with Empty Password 
                	  
                  WebElement usernameField = driver.findElement(By.id("inputUsername"));
                  WebElement passwordField = driver.findElement(By.id("inputPassword"));
                  WebElement loginButton = driver.findElement(By.xpath("//div[@class='text-center']//button[@id='btnlogin']"));
                  passwordField.clear();
                  usernameField.clear();

                  usernameField.sendKeys("haider@CLRMIS");
                  passwordField.sendKeys("");
                  try {
            			Thread.sleep(3000);
            		} catch (InterruptedException e) {
            		
            			e.printStackTrace();
            		} 
                  loginButton.click();
                  
                  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));  
                  String  errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='validation-message']"))).getText();
                  
                  
                
                  System.out.println("Error Message: " + errorMessage);
                  Assert.assertEquals(errorMessage, "Password is required", "Error message should match");
                
                  usernameField.clear();
                   }   
                 
                 
                 
                 @Test(priority=6)
                 public void successfulLogIn() {
                     // Testing successful login

                	 
                	 
                     String expectedUrl = "https://clrmis.syntracx.com/token";

                     
                     WebElement usernameField = driver.findElement(By.id("inputUsername"));
                     WebElement passwordField = driver.findElement(By.id("inputPassword"));
                     WebElement loginButton = driver.findElement(By.xpath("//div[@class='text-center']//button[@id='btnlogin']"));
                     passwordField.clear();
                     usernameField.clear();
                     usernameField.sendKeys("haider@CLRMIS");
                     passwordField.sendKeys("12345678");
                      loginButton.click();
                    
                          
                     
                 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                     wait.until(ExpectedConditions.urlToBe(expectedUrl));

                     
                     String actualUrl = driver.getCurrentUrl();
                     Assert.assertEquals(actualUrl, expectedUrl, "URL did not match the expected URL");

                     System.out.println("Actual URL is: " + actualUrl);  
                 }
                 
                 
                 @Test(priority=7)
                 public void logOut() {
                	 
                	 try {
             			Thread.sleep(4000);
             		} catch (InterruptedException e) {
             		
             			e.printStackTrace();
             		} 
                	 
                	 WebDriverWait wait0=new WebDriverWait(driver,Duration.ofSeconds(60));
                	 wait0.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@id='dropdownMenuImage']"))).click();
                	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
                	 WebElement logoutButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='logout-click']")));
                	 logoutButton.click();
                	 
                	 
                 }
                 
                 
                @AfterClass
                 public void tearDown() {
                     // Close the WebDriver
                     if (driver != null) {
                         driver.quit();
                     } 

                 
        
                  

}
                

}

   
    
    
    
    
