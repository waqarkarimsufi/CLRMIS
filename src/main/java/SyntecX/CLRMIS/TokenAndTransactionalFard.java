package SyntecX.CLRMIS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TokenAndTransactionalFard {
	
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
   public void addToken() {
   	
   	 try {
 			Thread.sleep(3000);
 		} catch (InterruptedException e) {
 		
 			e.printStackTrace();
 		}
   	
   	 WebElement language= driver.findElement(By.xpath("//label[@for='languageToggle'] "));
   	language.click();
   	
   	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
       WebElement Moza=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='moza']")));
   	 Moza.click();
   	driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
   	driver.findElement(By.id("cnic")).sendKeys("71501-9698772-0 ");
   	driver.findElement(By.id("name")).sendKeys("وقار ");
   	driver.findElement(By.xpath("(//button[@id='relation'])[1]")).click();
   	driver.findElement(By.xpath("(//button[@type='button'])[18]")).click();
   	driver.findElement(By.id("fathername")).sendKeys("کریم ");
   	driver.findElement(By.id("contact")).sendKeys("03425035168");
   	driver.findElement(By.id("temporaryAddress")).sendKeys("گلگت");
   	driver.findElement(By.xpath("//button[@id='facility']")).click();
   	driver.findElement(By.xpath("(//small[contains(text(),'فرد')])[1]")).click();
   	
   	WebDriverWait wait0=new WebDriverWait(driver,Duration.ofSeconds(20));
   	wait0.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@id='purpose'])[1]"))).click();
   	
   	WebDriverWait waitfard=new WebDriverWait(driver,Duration.ofSeconds(20));
   	waitfard.until(ExpectedConditions.elementToBeClickable(By.xpath("//small[contains(text(),'فرد برائے رجسٹری')]"))).click();
   	driver.findElement(By.xpath("(//button[contains(text(),'محفوظ کریں')])[1]")).click(); 
   	
   	
        
   }
     @Test(priority=2)
	   public void addFard() {
    	 
    	 WebDriverWait fard=new WebDriverWait(driver,Duration.ofSeconds(20));
    	 fard.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@id='transactional-fard'])[1]"))).click();
    	 

    	        
        	   try {
		  			Thread.sleep(5000);
		  		} catch (InterruptedException e) {
		  		
		  			e.printStackTrace();
		  		}
		    	
		    	 			
			WebDriverWait fardType=new WebDriverWait(driver,Duration.ofSeconds(20));
			   fardType.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(text(),'آپشن منتخب کریں۔')])[1]"))).click();
			   
			         //khanaEMalkiat   
			   WebDriverWait fardSelectionM=new WebDriverWait(driver,Duration.ofSeconds(20));
			   fardSelectionM.until(ExpectedConditions.elementToBeClickable(By.xpath("(//small[contains(text(),'خانہ ملکیت')])[1]"))).click();
			   
			   
			      //khanaEkasht   
			//	WebDriverWait fardSelectionK=new WebDriverWait(driver,Duration.ofSeconds(20));
		 //  fardSelectionK.until(ExpectedConditions.elementToBeClickable(By.xpath("(//small[contains(text(),'خانه کاشت')])[1]"))).click();
						   
			   
			  
				
			
			
			
	 }
	
	  @Test(priority=2)
	   public void khanaMalkiat() {
	    	
		   WebDriverWait khata=new WebDriverWait(driver,Duration.ofSeconds(20));
		   khata.until(ExpectedConditions.elementToBeClickable(By.id("accountNumbers"))).click();
		   
		   WebDriverWait khataSelection=new WebDriverWait(driver,Duration.ofSeconds(20));
		   khataSelection.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[3]//button[1]"))).click();
		   
		   WebDriverWait save=new WebDriverWait(driver,Duration.ofSeconds(20));
		   save.until(ExpectedConditions.elementToBeClickable(By.xpath("(//img[contains(@alt,'save')])[1]"))).click();
		   
		   WebDriverWait savekhata=new WebDriverWait(driver,Duration.ofSeconds(20));
		   savekhata.until(ExpectedConditions.elementToBeClickable(By.xpath("(//td[@data-label='انتخاب کریں'])[1]"))).click();
		   
		   WebDriverWait owner=new WebDriverWait(driver,Duration.ofSeconds(20));
		   owner.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='cultivationAccountNumber']"))).click();
		   
		   WebDriverWait ownerSelection=new WebDriverWait(driver,Duration.ofSeconds(20));
		   ownerSelection.until(ExpectedConditions.elementToBeClickable(By.xpath("(//small[contains(text(),'Ahmed Ali-احمد علی - 0')])[1]"))).click();
		   
		   WebDriverWait saveOwner=new WebDriverWait(driver,Duration.ofSeconds(20));
		   saveOwner.until(ExpectedConditions.elementToBeClickable(By.xpath("(//img[contains(@alt,'Save')])[1]"))).click();
		   	
		   WebDriverWait savedOwner=new WebDriverWait(driver,Duration.ofSeconds(20));
		   savedOwner.until(ExpectedConditions.elementToBeClickable(By.xpath("(//td[@data-label='انتخاب کریں'])[2]"))).click();
		   
		   WebDriverWait next = new WebDriverWait(driver, Duration.ofSeconds(20));
			next.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[normalize-space()='Next'])[1]"))).click();
		
			
		   
		   
	   } 
	    
	   /*
	     @Test(priority=03)
	    public void khanaKhasht() {
	    	
	    	 WebDriverWait kasht=new WebDriverWait(driver,Duration.ofSeconds(20));
		   kasht.until(ExpectedConditions.elementToBeClickable(By.id("cultivationAccountNumber"))).click();
		   
		   WebDriverWait kashtSelection=new WebDriverWait(driver,Duration.ofSeconds(20));
		   kashtSelection.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[4]//button[1]"))).click();
		   
		   WebDriverWait cultivation=new WebDriverWait(driver,Duration.ofSeconds(20));
		   cultivation.until(ExpectedConditions.elementToBeClickable(By.id("cultivationKhewatNumber"))).click();
		   
		   WebDriverWait selectCultivation=new WebDriverWait(driver,Duration.ofSeconds(20));
		   selectCultivation.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@type='button'])[12]"))).click();
		   
		   WebDriverWait save=new WebDriverWait(driver,Duration.ofSeconds(20));
		   save.until(ExpectedConditions.elementToBeClickable(By.xpath("(//img[contains(@alt,'Save')])[1]"))).click();
		   
		   
		   WebDriverWait owner=new WebDriverWait(driver,Duration.ofSeconds(20));
		   owner.until(ExpectedConditions.elementToBeClickable(By.xpath("(//td[contains(@data-label,'انتخاب کریں')])[3]"))).click();
		   
		   WebDriverWait ownerSelection=new WebDriverWait(driver,Duration.ofSeconds(20));
		   ownerSelection.until(ExpectedConditions.elementToBeClickable(By.id("cultivationKhewatOwner"))).click();
		   
		   WebDriverWait saveOwner=new WebDriverWait(driver,Duration.ofSeconds(20));
		   saveOwner.until(ExpectedConditions.elementToBeClickable(By.xpath("(//small[contains(text(),'Ahmed Ali-احمد علی')])[1]"))).click();
		   	
		   WebDriverWait savedOwner=new WebDriverWait(driver,Duration.ofSeconds(20));
		   savedOwner.until(ExpectedConditions.elementToBeClickable(By.xpath("(//img[contains(@alt,'Save')])[2]"))).click();
		   
		   WebDriverWait selectSaved = new WebDriverWait(driver, Duration.ofSeconds(20));
		   selectSaved.until(ExpectedConditions.elementToBeClickable(By.xpath("(//td[contains(@data-label,'انتخاب کریں')])[10]"))).click();
		
		   WebDriverWait next = new WebDriverWait(driver, Duration.ofSeconds(20));
			next.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[normalize-space()='Next'])[1]"))).click();
	    	
	    	
	    }      */
	   
	   @Test(priority=3)
	   public void challan() {
		 
	    	 WebDriverWait wait0 = new WebDriverWait(driver, Duration.ofSeconds(40));
			 	wait0.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(text(),'آپشن منتخب کریں۔')])[1]"))).click();
		 
			 	WebDriverWait select = new WebDriverWait(driver, Duration.ofSeconds(40));
			 	select.until(ExpectedConditions.elementToBeClickable(By.xpath("(//small[contains(text(),'Tax List 1 english')])[1]"))).click();
		 
			 	
			 	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
				 	wait.until(ExpectedConditions.elementToBeClickable(By.id("count"))).sendKeys("3");
				 	
				 	
				 	WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(40));
				 	wait1.until(ExpectedConditions.elementToBeClickable(By.id("andarajFormButton"))).click();
				 	
				 	WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
				 	wait2.until(ExpectedConditions.elementToBeClickable(By.id("challanNote"))).sendKeys("نوٹ");
				 	
					WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(40));
				 	wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[normalize-space()='Next'])[1]"))).click();
		 
				 			 	
				 	
	              }
	     
	              @Test(priority=4)
	            public void raseed() {
	            	
	            	  WebDriverWait amount = new WebDriverWait(driver, Duration.ofSeconds(40));
					 WebElement amountReceived=amount.until(ExpectedConditions.elementToBeClickable(By.id("amountReceived")));
					 amountReceived.clear();
					 amountReceived.sendKeys("330");
					 
					  WebDriverWait save = new WebDriverWait(driver, Duration.ofSeconds(40));
						 save.until(ExpectedConditions.elementToBeClickable(By.xpath("(//img[@alt='save'])[1]"))).click(); 
	            	  
						 WebDriverWait complete = new WebDriverWait(driver, Duration.ofSeconds(40));
						 complete.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[normalize-space()='Complete'])[1]"))).click(); 
						 try {
					  			Thread.sleep(6000);
					  		} catch (InterruptedException e) {
					  		
					  			e.printStackTrace();
					  		}
						 
	            	  
	            	  
	  			 	
	            }
	               

	              @AfterClass
	              public void tearDown() {
	                  
	                  if (driver != null) {
	                      driver.quit();
	                  } 
	   	      
	   	      } 
	    
	    
	

}
