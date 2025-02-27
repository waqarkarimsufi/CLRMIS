package SyntecX.CLRMIS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AndrajeChallan {

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
    public void addChallan() {
    	
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
	wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[contains(text(),'اندراجِ چالان')])[1]"))).click();
    	
	WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(20));
	wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("(//img[@alt='cnic search'])[1]"))).click();
	
	WebDriverWait wait5 = new WebDriverWait(driver, Duration.ofSeconds(30));
	wait5.until(ExpectedConditions.elementToBeClickable(By.xpath("(//td[contains(text(),'وقار')])[1]"))).click();

	WebDriverWait wait6 = new WebDriverWait(driver, Duration.ofSeconds(20));
	wait6.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class='mx-1'])[1]"))).click();

	WebDriverWait wait7 = new WebDriverWait(driver, Duration.ofSeconds(20));
	wait7.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='challanRemarks'])[1]"))).sendKeys("چالان");
	
	WebDriverWait wait8 = new WebDriverWait(driver, Duration.ofSeconds(20));
	wait8.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='challanRemarks'])[1]"))).sendKeys("چالان");
	
	WebDriverWait wait9 = new WebDriverWait(driver, Duration.ofSeconds(20));
	wait9.until(ExpectedConditions.elementToBeClickable(By.xpath("(//img[contains(@alt,'Save Form')])[1]"))).click();
	
	WebDriverWait wait10 = new WebDriverWait(driver, Duration.ofSeconds(20));
	wait10.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(text(),'جئ ہاں')])[1]"))).click();
	
	WebDriverWait wait11 = new WebDriverWait(driver, Duration.ofSeconds(20));
	String message = wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[contains(@class,'toast-body')][normalize-space()='Challan Added!'])[2]"))).getText();
	
	Assert.assertEquals(message, "Challan Added!","Challan not added");
	
	
    	
    }
	
              @Test(priority=2)
         public void addSahulat() {
        	 
        		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[normalize-space()='Select an option'])[1]"))).click();
    	
        		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
        		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("(//small[contains(text(),'Tax List 1 english')])[1]"))).click();
    	
        		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
        		wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("(//textarea[@class='rounded-2 form-control valid'])[1]"))).sendKeys("تفصیلات ");  
     
     
        		WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(20));
        		wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='count'])[1]"))).sendKeys("2 ");  
     
        		WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(20));
        		wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("(//img[@alt='Save Form'])[2]"))).click();
        		
        		WebDriverWait wait5 = new WebDriverWait(driver, Duration.ofSeconds(20));
        		wait5.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(text(),'جئ ہاں')])[1]"))).click();
        		
        		WebDriverWait wait6 = new WebDriverWait(driver, Duration.ofSeconds(20));
        		wait6.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='verify'])[1]"))).click();
        		
        		WebDriverWait wait7 = new WebDriverWait(driver, Duration.ofSeconds(20));
        		wait7.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(text(),'جئ ہاں')])[1]"))).click();
        		
        	//	WebDriverWait wait8 = new WebDriverWait(driver, Duration.ofSeconds(20));
        //	String message=wait8.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[contains(@class,'d-flex')])[21]"))).getText();
        //	Assert.assertEquals(message,"Challan status updated", "Challan updation failed");
        		
        		
    	
    }
              @AfterClass
              public void tearDown() {
            	  
            	  if(driver!=null) {
            		  
            		  driver.quit();
            	  }
            	  
              }
	
	
	
}
