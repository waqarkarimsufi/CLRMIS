package SyntecX.CLRMIS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mukhtasarFard {
	
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
	 
	 
	 
	   @Test(priority=01)
	  public void addfard() {
		   
		   try {
	  			Thread.sleep(5000);
	  		} catch (InterruptedException e) {
	  		
	  			e.printStackTrace();
	  		}
	    	
	    	 WebElement language= driver.findElement(By.xpath("//label[@for='languageToggle'] "));
	    	language.click();
	   	
	   	WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@role='button'])[3]"))).click();   

		WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[contains(text(),'مختصر فرد')])[1]"))).click();
		  
		WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("(//img[@alt='cnic search'])[1]"))).click();
		  
		WebDriverWait wait5 = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait5.until(ExpectedConditions.elementToBeClickable(By.xpath("(//td[@data-label='انتخاب کریں'])[1]"))).click();
		
		WebDriverWait name = new WebDriverWait(driver, Duration.ofSeconds(20));
		name.until(ExpectedConditions.elementToBeClickable(By.xpath("(//img[@alt='Door Icon'])[1]"))).click();
		
		WebDriverWait searchName = new WebDriverWait(driver, Duration.ofSeconds(20));
		 searchName.until(ExpectedConditions.elementToBeClickable(By.xpath("(//img[@alt='cnic search'])[3]"))).click();
		
		
		WebDriverWait namesearch = new WebDriverWait(driver, Duration.ofSeconds(20));
		namesearch.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='name'])[2]"))).sendKeys("علی");
		
		WebDriverWait nameSelection = new WebDriverWait(driver, Duration.ofSeconds(20));
		nameSelection.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(text(),'تلاش کریں')])[1]"))).click();
		
		
		
		WebDriverWait nameSave = new WebDriverWait(driver, Duration.ofSeconds(20));
		nameSave.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='d-flex align-items-center justify-content-center'])[1]"))).click();
		
		
		WebDriverWait nameAddition = new WebDriverWait(driver, Duration.ofSeconds(20));
		nameAddition.until(ExpectedConditions.elementToBeClickable(By.xpath("(//img[@alt='Door Icon'])[1]"))).click();
		
		
		
		  
		WebDriverWait wait6 = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait6.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[contains(@data-label,'انتحاب کریں')]//div"))).click();
		
		
		WebDriverWait edit = new WebDriverWait(driver, Duration.ofSeconds(20));
		edit.until(ExpectedConditions.elementToBeClickable(By.xpath("(//img[@alt='Edit image'])[1]"))).click();
		
		
		
		
		WebDriverWait wait12 = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement hissa=wait12.until(ExpectedConditions.elementToBeClickable(By.id("transferredPortion")));
		
		hissa.clear();
        hissa.sendKeys("22");
		
		
		WebDriverWait wait13 = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement kanaal=wait13.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='kanal'])[1]")));
		kanaal.clear();
		kanaal.sendKeys("11");
		
		WebDriverWait wait14 = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement marla=wait14.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='marla'])[1]")));
		marla.clear();
		marla.sendKeys("11");
		
		WebDriverWait wait15 = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement sarsai=wait15.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='sarsai'])[1]")));
		sarsai.clear();
		sarsai.sendKeys("0");
		
		WebDriverWait wait16 = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement foot=wait16.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='squarefoot'])[1]")));
		foot.clear();
		foot.sendKeys("0");
		
		WebDriverWait wait17 = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait17.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'محفوظ کریں')]"))).click();
		
		
		WebDriverWait next=new WebDriverWait(driver,Duration.ofSeconds(20));
		next.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[normalize-space()='Next'])[1]"))).click();	
		
	 
		
		
		
		  
	  }
	
	     

	     
	     @Test(priority=2)
	   public void challan() {
		 
	    	 WebDriverWait wait0 = new WebDriverWait(driver, Duration.ofSeconds(40));
			 	wait0.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@id='formFacilitySelect'])[1]"))).click();
		 
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
	     
	              @Test(priority=3)
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
	                	 
	                	 if(driver!=null)
	                	 {
	                		 driver.quit();	                		 
	                	 }
	                	
	                	
	                	
	                }
	     

	     
	     
	     
	     
	     
	   
                    }
