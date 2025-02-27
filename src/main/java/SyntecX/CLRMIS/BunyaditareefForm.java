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
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BunyaditareefForm {

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

	
	      @Test(priority=1)
        public void intiqalIqsam() {
        	
        	try {
	  			Thread.sleep(6000);
	  		} catch (InterruptedException e) {
	  		
	  			e.printStackTrace();
	  		}
    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    	 
	    	 WebElement language= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@for='languageToggle'] ")));
	    	language.click();
	    	
	    	WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
    	wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[contains(@role,'button')])[1]"))).click();
    	
    	 WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(20));
    	 wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[contains(text(),'بنیادی تعریف فارم')])[1]"))).click();	
        	
    	 WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(20));
    	 wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@id='TransferType'])[1]"))).click();
    	 
    	 WebDriverWait wait5 = new WebDriverWait(driver, Duration.ofSeconds(20));
    	 wait5.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='pills-home']//li[1]//button[1]"))).click();
    	 
    	 WebDriverWait wait6 = new WebDriverWait(driver, Duration.ofSeconds(20));
    	 wait6.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='transferNameId'])[1]"))).sendKeys("انتقال");
    	 
    	 WebDriverWait wait7 = new WebDriverWait(driver, Duration.ofSeconds(20));
    	 wait7.until(ExpectedConditions.elementToBeClickable(By.id("intiqalatbtn"))).click();
    	 
    	 
    	 
    	
    	 
    	 
        }
	      
	      @Test(priority=2)
	      public void dastaveezaatFehrist() {
	    	  
	    	  
	    	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	     	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(text(),'دستاویزات کی فہرست')])[1]"))).click();
	    	  
	     	 WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
	     	 wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='NameInEnglish'])[1]"))).sendKeys("دستاویز کا نام");
	     	 
	     	 WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(20));
	     	wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@id='intiqalatbtn'])[2]"))).click();
	     	 
	     		    	  
	      }  
	
	      @Test(priority=3)
	      public void plotTameerIqsam() {
	    	  
	    	 
	    	  
	    	  
	    	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	     	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(text(),'پلاٹ کی تعمیر کی اقسام')])[1]"))).click();
	    	  
	     	WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
	     	 wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[1]/main/article/div[1]/div[2]/div[3]/div[1]/div/form/div/div[1]/div/button"))).click();
	     	 
	     	WebDriverWait wait7 = new WebDriverWait(driver, Duration.ofSeconds(20));
	     	  wait7.until(ExpectedConditions.elementToBeClickable(By.xpath("(//small[contains(text(),'دپلاٹ قسم')])[1]"))).click();
	     	 
	     	
	     	 
	     	WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(20));
	     	wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@id='ConstructionNameEnglish'])[1]"))).sendKeys("تعمیر قسم");

	     	WebDriverWait wait6 = new WebDriverWait(driver, Duration.ofSeconds(20));
	     	wait6.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@id='intiqalatbtn'])[3]"))).click();

	     	
	     	
	     	 WebDriverWait wait5 = new WebDriverWait(driver, Duration.ofSeconds(20));
		     	String message=wait5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='d-flex'])[1]"))).getText();
		     	 
		     	Assert.assertEquals(message,"Added!","Not added or already added");
	     	
	    	  
	      }  
	      
	      
	     @Test(priority=4)
	      public void plotIqsam() {
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	     	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(text(),'پلاٹ کی اقسام')])[1]"))).click();
	    	  
	     	 WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
	     	 wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='PlotTypeInEnglish'])[1]"))).sendKeys("دپلاٹ قسم");
	     	 
	     	WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(20));
	     	 wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@id='intiqalatbtn'])[4]"))).click();
	     	 
	     	 
	     	 
	     	 
	     	 WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
	     	String message=wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='d-flex'])[1]"))).getText();
	     	 
	     	Assert.assertEquals(message,"Added!","Not added or already added");
	    	  
	      }     
	
	
	
	                
	               @Test(priority=5)
	                public void taxFahrist() {
		  
		  
	            	
		  
	   	    	
	   	    	 
	   	    	 WebDriverWait wait53 = new WebDriverWait(driver, Duration.ofSeconds(20));
	   	    	 wait53.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(text(),'ٹیکس فہرست')])[1]"))).click();	
	   	    	 
	   	    	 
	   	    	 
	   	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	   	    	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='TaxListInEnglish'])[1]"))).sendKeys("ٹیکس ");	
		  
	   	  
	   	    	WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
	   	    	 wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[1]/main/article/div[1]/div[2]/div[5]/div[1]/div/form/div/div[2]/div/button"))).click();
	   	    	 
	   	    	WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(20));
	   	    	 wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("(//small[normalize-space()='Fard'])[1]"))).click();
	   	    	
	   	    	WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(20));
	   	    	 wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@id='intiqalatbtn'])[5]"))).click();
	   	    	 
	   	    	 WebDriverWait wait5 = new WebDriverWait(driver, Duration.ofSeconds(20));
	 	     	String message=wait5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='d-flex'])[1]"))).getText();
	 	     	 
	 	     	Assert.assertEquals(message,"Added!","Not added or already added");
	   	    	 
	   	    	 
		  
		  
		  
		  
		  
	                   }
	
	
	
	  
	
	
	
	      
	      
	     @Test(priority=6)
	      public void taxIqsam() {
	      
	        
	    	  
	    	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	     	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(text(),'ٹیکس اقسام')])[1]"))).click();
	    	  
	     	 WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
	     	 wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='TaxTypeInEnglish'])[1]"))).sendKeys("انتقال");
	     	 
	     	WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(20));
	     	 wait3.until(ExpectedConditions.elementToBeClickable(By.id("FeeInEnglish"))).sendKeys("2000");
	     	 
	     	WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(20));
  	    	 wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("(//img[@alt='save'])[6]"))).click();
	     	 
	     	 
	     	 WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
	     	String message=wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='d-flex'])[1]"))).getText();
	     	 
	     	Assert.assertEquals(message,"Added!","Not added or already added");
	    	  
	      }  
	     
	         
	     
	      
	      @Test(priority=6)
	      public void taxNotificaton() {
	      
	      
	      
	    	  
	   	    	 
	   	    	 
	   	    	 
	   	    	 WebDriverWait wait0 = new WebDriverWait(driver, Duration.ofSeconds(20));
	   	    	 wait0.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@id='pills-profile-tab-6'])[1]"))).click();	
	      
	      
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		     	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='TaxNotificationNumber'])[1]"))).sendKeys("2");
		     	 
		     	 
		    	  WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
			     	 wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='TaxNotificationDate'])[1]"))).sendKeys("12/10/2024");
			     	 
			     	WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(20));
			     	 wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='TaxNotificationActiveDate'])[1]"))).sendKeys("12/10/2024");
			     	 
			     	WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(20));
			     	 wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='TaxNotificationLastDate'])[1]"))).sendKeys("12/10/2024");
			     	 
			     	WebDriverWait wait5 = new WebDriverWait(driver, Duration.ofSeconds(20));
			     	 wait5.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='TaxNotificationRemarks'])[1]"))).sendKeys("ٹیکس نوٹیفکیشن ریمارکس");
			     	 
			     	WebDriverWait wait6 = new WebDriverWait(driver, Duration.ofSeconds(20));
			     	 wait6.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='TaxNotificationActive'])[1]"))).click();
			     	 
			     	 
			     	WebDriverWait wait7 = new WebDriverWait(driver, Duration.ofSeconds(20));
		  	    	 wait7.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@id='intiqalatbtn'])[7]"))).click();
			     	 
			     	 
			     	 WebDriverWait wait8 = new WebDriverWait(driver, Duration.ofSeconds(20));
			     	String message=wait8.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='d-flex'])[1]"))).getText();
			     	 
			     	Assert.assertEquals(message,"Added!","Not added or already added");
			     	 
			     	 
			     	 
	    	  
	    	  
	    	  
	    	  
	    	  
	      }  
	
	      
	 
	@Test(priority=7)
	 public void taxNotificationTafsilaat() {
		 
		 	
    	 
    	 
    	 WebDriverWait wait0 = new WebDriverWait(driver, Duration.ofSeconds(20));
     	wait0.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='pills-profile-tab-7']"))).click();
		 
     	 WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
      	wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[1]/main/article/div[1]/div[2]/div[8]/div[1]/div/form/div[1]/div[1]/div/button"))).click();
		 
      	 WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
      	wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@class='dropdown-menu w-100 show']//li[1]//button[1]"))).click();
		 
      	WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(20));
      	wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[1]/main/article/div[1]/div[2]/div[8]/div[1]/div/form/div[1]/div[2]/div/button"))).click();
		 
      	 WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(20));
       	wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("(//small[contains(text(),'ٹیکس')])[1]"))).click();
		 
       	
        WebDriverWait wait5 = new WebDriverWait(driver, Duration.ofSeconds(20));
       	wait5.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[1]/main/article/div[1]/div[2]/div[8]/div[1]/div/form/div[1]/div[3]/div/button"))).click();
		
       	WebDriverWait wait6 = new WebDriverWait(driver, Duration.ofSeconds(20));
       	wait6.until(ExpectedConditions.elementToBeClickable(By.xpath("//small[contains(text(),'مربع فٹ')]"))).click();
       	
    	WebDriverWait wait7 = new WebDriverWait(driver, Duration.ofSeconds(20));
       	wait7.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='TaxRate']"))).sendKeys("20%");
       	
       	WebDriverWait wait8 = new WebDriverWait(driver, Duration.ofSeconds(20));
       	wait8.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='TaxRateType'])[1]"))).sendKeys("قسم ریٹ");
       	
       	WebDriverWait wait9 = new WebDriverWait(driver, Duration.ofSeconds(20));
       	wait9.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[1]/main/article/div[1]/div[2]/div[8]/div[1]/div/form/div[1]/div[6]/div/button"))).click();
       	
       	WebDriverWait wait10 = new WebDriverWait(driver, Duration.ofSeconds(20));
       	wait10.until(ExpectedConditions.elementToBeClickable(By.xpath("//small[contains(text(),'(B01701) نیشنل بنک اکاوِئنٹ نمبر')]"))).click();
       	
       	
       	WebDriverWait wait11 = new WebDriverWait(driver, Duration.ofSeconds(20));
       	wait11.until(ExpectedConditions.elementToBeClickable(By.xpath("(//img[@alt='save'])[8]"))).click();
       	
       	
        WebDriverWait wait12 = new WebDriverWait(driver, Duration.ofSeconds(20));
     	String message=wait12.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='d-flex'])[1]"))).getText();
     	 
     	Assert.assertEquals(message,"Added!","Not added or already added");
       	
       	
       	
       	
		 
	 }
	
	
	      @Test(priority=8)
	  public void tearDown() {
		  
	    	  if(driver!=null) {
	    		  
	    		  driver.quit();
	    	  }
	    	  
	    	  
		   
		  
	  }
	      
	      
	      
	      
	      
	
	
	
}
