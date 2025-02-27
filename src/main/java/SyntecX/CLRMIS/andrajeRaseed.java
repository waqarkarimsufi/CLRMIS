package SyntecX.CLRMIS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import bsh.This;
import io.github.bonigarcia.wdm.WebDriverManager;

public class andrajeRaseed {
	
	
	WebDriver driver;
	
	  
	 
    @BeforeClass
public void setup() {
	 
	 WebDriverManager.chromedriver().setup(); 
      driver = new ChromeDriver();
      driver.get("https://clrmisdemo.syntracx.com/login");
  
      
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
    
    
   
    
    
    
     @Test(priority=1)
    public void addRaseed() {
    	 
    	
    	try {
  			Thread.sleep(5000);
  		} catch (InterruptedException e) {
  		
  			e.printStackTrace();
  		}
    	
    	 WebElement language= driver.findElement(By.xpath("//label[@for='languageToggle'] "));
    	language.click();
   	
   	WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
	wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("(//img[@alt='Toggle Arrow'])[3]"))).click();   
     
	WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(20));
	wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[contains(text(),'اندراجِ رسید')])[1]"))).click();
	
	WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(20));
	wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("(//img[@alt='cnic search'])[1]"))).click();
	
	WebDriverWait wait5 = new WebDriverWait(driver, Duration.ofSeconds(20));
	wait5.until(ExpectedConditions.elementToBeClickable(By.xpath("(//td[contains(text(),'وقار')])[1]"))).click();
	
	WebDriverWait wait6 = new WebDriverWait(driver, Duration.ofSeconds(20));
	wait6.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class='mx-1'])[1]"))).click();
	
	WebDriverWait wait7 = new WebDriverWait(driver, Duration.ofSeconds(20));
	wait7.until(ExpectedConditions.elementToBeClickable(By.xpath("(//textarea[@id='receiptRemarks'])[1]"))).sendKeys("یمارکس");
 
	WebDriverWait wait8 = new WebDriverWait(driver, Duration.ofSeconds(20));
	 wait8.until(ExpectedConditions.elementToBeClickable(By.xpath("(//img[@alt='Save Form'])[1]"))).click();
	    
	
	
	
	
	WebDriverWait wait9 = new WebDriverWait(driver, Duration.ofSeconds(20));
	wait9.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(text(),'جئ ہاں')])[1]"))).click();
	
	//WebDriverWait wait10 = new WebDriverWait(driver, Duration.ofSeconds(20));
	//String message = wait10.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='toast-body'][normalize-space()='Challan Added!'])[2]"))).getText();
	

	
	
	
	
	
	
    
	
	
	
	WebDriverWait wait20 = new WebDriverWait(driver, Duration.ofSeconds(20));
	wait20.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@id='formFacilitySelect'])[1]"))).click();
	
	WebDriverWait wait11 = new WebDriverWait(driver, Duration.ofSeconds(20));
	wait11.until(ExpectedConditions.elementToBeClickable(By.xpath("(//small[normalize-space()='Tax List 1 english'])[1]"))).click();
	
	WebDriverWait wait12 = new WebDriverWait(driver, Duration.ofSeconds(20));
	wait12.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='amountReceived'])[1]"))).sendKeys("1000");
	
	WebDriverWait wait13 = new WebDriverWait(driver, Duration.ofSeconds(20));
	wait13.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='accountHead '])[1]"))).sendKeys("waqar karim");
	
	WebDriverWait wait14 = new WebDriverWait(driver, Duration.ofSeconds(20));
	wait14.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='bankName '])[1]"))).sendKeys("State bank");
	
	WebDriverWait wait15 = new WebDriverWait(driver, Duration.ofSeconds(20));
	wait15.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='branchName '])[1]"))).sendKeys("Main branch");
	
	
	//Scroll down
		
	
	
	WebDriverWait wait16 = new WebDriverWait(driver, Duration.ofSeconds(20));
	wait16.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn ']//img[@alt='Save Form']"))).click();
	
	WebDriverWait wait17 = new WebDriverWait(driver, Duration.ofSeconds(20));
	wait17.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(text(),'جئ ہاں')])[1]"))).click();
	
	WebDriverWait wait18 = new WebDriverWait(driver, Duration.ofSeconds(20));
	wait18.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='verify'])[1]"))).click();
	
	WebDriverWait wait19 = new WebDriverWait(driver, Duration.ofSeconds(20));
	wait19.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(text(),'جئ ہاں')])[1]"))).click();
	
	WebDriverWait wait22 = new WebDriverWait(driver, Duration.ofSeconds(20));
	String message2=wait22.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[contains(@class,'toast-body')][normalize-space()='Challan status updated!'])[2]"))).getText();
	Assert.assertEquals(message2,"Challan status updated!", "Raseed not added");
	
	
	
	
    	
    }  
    
     @AfterClass
     public void tearDown() {
    	 
    	 if(driver!=null) {
    		 driver.quit();
    	 }
    	 
    	 
     }
     
 	
    
    

}
