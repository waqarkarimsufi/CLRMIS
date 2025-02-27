package SyntecX.CLRMIS;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TafseelMalkiatOKhasrajaat {
	
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
	   public void afraadBaTehsil() {
        	
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
    	 wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'تفسیل افراد با تحصیل')]//span[@class='badge text-bg-warning'][contains(text(),'نیا')]"))).click();
		   
    	 WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(20));
    	 wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(text(),'تلاش کریں')])[1]"))).click();
		      
    	 
    	 
	   }
         
         @Test(priority=2)	  
  	   public void khasraTalashkaren() {
          	
          	
      	
  	    	
  	    	WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
      	
  	    	wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[contains(text(),'\" خسرہ تلاش کریں')])[1]"))).click();   
      	 WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(20));
      	 wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(text(),'منتخب کریں')])[1]"))).click();
  		   
      	 WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(20));
      	 wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@type='button'])[2]"))).click();
  		      
      	WebDriverWait wait5 = new WebDriverWait(driver, Duration.ofSeconds(20));
     	 wait5.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(text(),'تلاش کریں')])[1]"))).click();
     	  
  	   }      
         
            @Test(priority=3)
        public void lockKhasrajaat() {
        	 
        	    WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(20));
              	wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[contains(text(),'اندراج ای لک براہے کھاتا جات')])[1]"))).click();   
        	
              	
              	WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
               wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[normalize-space()='Select an option'])[1]"))).click();
               WebDriverWait wait11 = new WebDriverWait(driver, Duration.ofSeconds(20));
        	    wait11.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(@type,'button')])[2]"))).click();
                
        	    WebDriverWait wait12 = new WebDriverWait(driver, Duration.ofSeconds(20));
        	    wait12.until(ExpectedConditions.elementToBeClickable(By.id("searchButton"))).click();
        	
        	    WebDriverWait wait13 = new WebDriverWait(driver, Duration.ofSeconds(20));
        	    wait13.until(ExpectedConditions.elementToBeClickable(By.xpath("//tbody/tr[1]/td[1]"))).click();
        	
        	    WebDriverWait wait14 = new WebDriverWait(driver, Duration.ofSeconds(20));
        	    wait14.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='khataLock'])[1]"))).click();
        	    
        
        	    WebDriverWait wait15 = new WebDriverWait(driver, Duration.ofSeconds(20));
        	  WebElement remarks=wait15.until(ExpectedConditions.elementToBeClickable(By.xpath("(//textarea[@id='remarks'])[1]")));
        	  remarks.clear();
        	  remarks.sendKeys("کھاتہ لاک");
        	    
        	  WebDriverWait wait16 = new WebDriverWait(driver, Duration.ofSeconds(20));
        	  wait16.until(ExpectedConditions.elementToBeClickable(By.id("SaveButton"))).click();
        	  
        	  WebDriverWait wait17 = new WebDriverWait(driver, Duration.ofSeconds(20));
        	  String message=wait17.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='toast-body'])[1]"))).getText();
               
        	  Assert.assertEquals(message, "Khata lock details updated.!", "Khata not locked ");
        	  
         
         }     
            
            
         
          @Test(priority=4)	  
         public void tafseelTalashKhanaKhashtBayan() {
        	  
        	  

         	   
         	    
             	
             	WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(20));
         	   wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[contains(text(),'\"تفصیل تلاش خانہ کاشت بیان')])[1]"))).click(); 
         	  WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(20));
        	   wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@id='MouzaSelect'])[1]"))).click(); 
        	   WebDriverWait wait5 = new WebDriverWait(driver, Duration.ofSeconds(20));
        	   wait5.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(@type,'button')])[2]"))).click(); 
        	   WebDriverWait wait6 = new WebDriverWait(driver, Duration.ofSeconds(20));
        	   wait6.until(ExpectedConditions.elementToBeClickable(By.id("bayaNametab1"))).sendKeys("احمد علی");
        	   WebDriverWait wait7 = new WebDriverWait(driver, Duration.ofSeconds(20));
        	   wait7.until(ExpectedConditions.elementToBeClickable(By.id("searchbtntab1"))).click();
        	  
        	   WebDriverWait wait8 = new WebDriverWait(driver, Duration.ofSeconds(20));
        	   wait8.until(ExpectedConditions.elementToBeClickable(By.xpath("(//td[contains(text(),'Ahmed Ali-احمد علی S/O Sultan Ali')])[1]"))).click();
        	   
        	   WebDriverWait wait9 = new WebDriverWait(driver, Duration.ofSeconds(20));
        	   wait9.until(ExpectedConditions.elementToBeClickable(By.id("pills-profile-tab-1"))).click();
        	  
        	   WebDriverWait wait10 = new WebDriverWait(driver, Duration.ofSeconds(20));
        	   wait10.until(ExpectedConditions.elementToBeClickable(By.id("bayaNametab2"))).sendKeys("احمد علی");
        	 
        	   WebDriverWait wait11 = new WebDriverWait(driver, Duration.ofSeconds(20));
        	   wait11.until(ExpectedConditions.elementToBeClickable(By.id("searchbtntab2"))).click();
        	 
        	 
         }  
         
          
         
         @Test(priority=5)
       public void tafseelMalkiatSabiqaOMajuda() {
        	 
 	  		
 	    	
 	    	WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(20));
     	 wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[contains(text(),'تفسیر ملکیت سبیقہ/ مجودہ')])[1]"))).click();
     	WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(20));
    	 wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@id='MowzaSelect'])[1]"))).click();
    	 WebDriverWait wait5 = new WebDriverWait(driver, Duration.ofSeconds(20));
    	 wait5.until(ExpectedConditions.elementToBeClickable(By.xpath("(//small[contains(text(),'پاوکہ')])[1]"))).click();
    	 WebDriverWait wait6 = new WebDriverWait(driver, Duration.ofSeconds(20));
    	 wait6.until(ExpectedConditions.elementToBeClickable(By.id("khataNumber"))).click();	 
    	 WebDriverWait wait7 = new WebDriverWait(driver, Duration.ofSeconds(20));
    	 wait7.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@type='button'])[10]"))).click();	 
    	 WebDriverWait wait8 = new WebDriverWait(driver, Duration.ofSeconds(20));
    	 wait8.until(ExpectedConditions.elementToBeClickable(By.xpath("(//td[@data-label='انتخاب کریں'])[1]"))).click();	 
    	   
    	 WebDriverWait wait9 = new WebDriverWait(driver, Duration.ofSeconds(20));
    	 wait9.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(text(),'تفصیل مالکان بخانه کاشت بمع سابقه و موجودہ حیثیت')])[1]"))).click();	 
    	 WebDriverWait wait10 = new WebDriverWait(driver, Duration.ofSeconds(20));
    	 wait10.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@id='MowzaSelecttab2'])[1]"))).click();	      
    	 WebDriverWait wait11 = new WebDriverWait(driver, Duration.ofSeconds(20));
    	 wait11.until(ExpectedConditions.elementToBeClickable(By.xpath("(//small[contains(text(),'پاوکہ')])[2]"))).click();	      
              
    	 WebDriverWait wait12 = new WebDriverWait(driver, Duration.ofSeconds(20));
    	 wait12.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@id='KhataNumbertab2'])[1]"))).click();	      
    	 WebDriverWait wait13 = new WebDriverWait(driver, Duration.ofSeconds(20));
    	 wait13.until(ExpectedConditions.elementToBeClickable(By.xpath("(//small[contains(text(),'1')])[2]"))).click();	      
         
    	 WebDriverWait wait14 = new WebDriverWait(driver, Duration.ofSeconds(20));
    	 wait14.until(ExpectedConditions.elementToBeClickable(By.id("khatoonNumberId"))).click();
    	 
    	 WebDriverWait wait15 = new WebDriverWait(driver, Duration.ofSeconds(20));
    	 wait15.until(ExpectedConditions.elementToBeClickable(By.xpath("(//small[normalize-space()='11'])[1]"))).click();	      
         
    	 WebDriverWait save = new WebDriverWait(driver, Duration.ofSeconds(20));
    	 save.until(ExpectedConditions.elementToBeClickable(By.xpath("(//td[@data-label='نام مالک'][contains(text(),'Ahmed Ali-احمد علی')])[1]"))).click();	      
        
    	 
         
         }  
         
	        @AfterClass
	     public void tearDown() {
	        	
	        	if (driver != null) {
	                driver.quit();
	            } 
	    	 
	    	 
	    	 
	    	 
	     } 
	

}
