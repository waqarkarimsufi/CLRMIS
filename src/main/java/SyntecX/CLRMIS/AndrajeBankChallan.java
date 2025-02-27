package SyntecX.CLRMIS;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AndrajeBankChallan {
	
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
	   public void addBankChallan() throws AWTException {
		   try {
	  			Thread.sleep(6000);
	  		} catch (InterruptedException e) { 
	  		
	  			e.printStackTrace();
	  		}
   	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
   	 
	    	 WebElement language= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@for='languageToggle'] ")));
	    	language.click();
	    	
	    	WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
   	wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[name()='svg'][contains(@class,'custom-svg-new')])[3]"))).click();   

   	WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(20));
   	wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[contains(text(),'اندراجِ بینک چالان')])[1]"))).click();   

	WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(20));
    wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='receiptNumber']"))).sendKeys("123456");
    
   	
   	WebDriverWait wait5 = new WebDriverWait(driver, Duration.ofSeconds(20));
   	wait5.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='depositorName'])[1]"))).sendKeys("وقار"); 
		   
   	WebDriverWait wait6 = new WebDriverWait(driver, Duration.ofSeconds(20));
   	wait6.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='amount'])[2]"))).sendKeys("1000"); 
		   	   
   	WebDriverWait wait7 = new WebDriverWait(driver, Duration.ofSeconds(20));
   	WebElement upload=wait7.until(ExpectedConditions.elementToBeClickable(By.xpath("(//img[contains(@alt,'File Clip')])[1]")));
   	upload.click();
   	
   	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}	
   
   
		Robot robot = new Robot();
	
    StringSelection filePath = new StringSelection("C:\\Users\\SyntecX\\Desktop\\hr");
    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath, null);
    
    robot.keyPress(KeyEvent.VK_CONTROL);
    robot.keyPress(KeyEvent.VK_V);
    robot.keyRelease(KeyEvent.VK_V);
    robot.keyRelease(KeyEvent.VK_CONTROL);
    
    
    
    robot.keyPress(KeyEvent.VK_ENTER);
    robot.keyRelease(KeyEvent.VK_ENTER);
   	
   	
   	// 2nd attachment
    
    WebDriverWait wait8 = new WebDriverWait(driver, Duration.ofSeconds(20));
   	WebElement upload1=wait8.until(ExpectedConditions.elementToBeClickable(By.xpath("(//img[contains(@alt,'File Clip')])[2]")));
   	upload1.click();
   	
   	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
   
   
	
	
    StringSelection filePath1 = new StringSelection("C:\\Users\\SyntecX\\Desktop\\hr");
    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath1, null);
    
    robot.keyPress(KeyEvent.VK_CONTROL);
    robot.keyPress(KeyEvent.VK_V);
    robot.keyRelease(KeyEvent.VK_V);
    robot.keyRelease(KeyEvent.VK_CONTROL);
    
    
    
    robot.keyPress(KeyEvent.VK_ENTER);
    robot.keyRelease(KeyEvent.VK_ENTER);
    
    
    WebDriverWait wait9 = new WebDriverWait(driver, Duration.ofSeconds(20));
   	wait9.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(text(),'محفوظ کریں')])[1]"))).click();
   	
   	WebDriverWait wait10 = new WebDriverWait(driver, Duration.ofSeconds(20));
   	wait10.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(text(),'جئ ہاں')])[1]"))).click();
   	
   	WebDriverWait wait11 = new WebDriverWait(driver, Duration.ofSeconds(10));  
    String  message = wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='toast-body'][normalize-space()='Bank Deposit added successfully.'])[2]"))).getText();
    
    
  
    System.out.println("PopUP Message: " + message);
    Assert.assertEquals(message, "Bank Deposit added successfully.", "Andraj e Bank Challan is Failed");
   	
    
   	
	   }
	        
	
	         @AfterClass
	         public void tearDown() {
	        	
	             if (driver != null) {
	                 driver.quit();
	             } 
	         
	         
	         
	         
	
	

}
	         
}
