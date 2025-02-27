package SyntecX.CLRMIS;

import java.time.Duration;

import org.openqa.selenium.Alert;
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

public class RolesUsers {
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
	    public void addRole() {
	    	
	    	 try {
		  			Thread.sleep(5000);
		  		} catch (InterruptedException e) {
		  		
		  			e.printStackTrace();
		  		}
		    	
		    	 WebElement language= driver.findElement(By.xpath("//label[@for='languageToggle'] "));
		    	language.click();
	    	
	    	  
	    	 WebDriverWait wait2=new WebDriverWait(driver,Duration.ofSeconds(20));
	    	  
	    	wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[contains(@class,'toggle-arrow-left')])[1]" ))).click();
	    	
	    	 WebDriverWait wait3=new WebDriverWait(driver,Duration.ofSeconds(20));
	    	 wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='font-text-size'][contains(text(),'کردار')]" ))).click();	   
	    	 driver.findElement(By.xpath("(//input[@id='roleInput'])[1] ")).sendKeys("Junior Officer");
	    	 driver.findElement(By.xpath("(//input[@id='descriptionsInput'])[1] ")).sendKeys("Junior Officer");
	    	 
	    	 WebDriverWait wait4= new WebDriverWait(driver,Duration.ofSeconds(20));
	    	 wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(text(),'محفوظ کریں')])[1]"))).click();
	    	 
	    	 WebDriverWait wait5=new WebDriverWait(driver,Duration.ofSeconds(20)); 
	    	 
	    	  String message = wait5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='toast-body'][normalize-space()='Success! Your data has been saved.'])[2]"))).getText();
              System.out.println("  " + message);
              Assert.assertEquals(message, "Success! Your data has been saved.", "Failed to add user");
	    	 
	    	 
	    	 
	    	
	    	
	    	
	    }    
	      
	    @Test(priority=2)
	    public void permissions() {
	    	
	    
		    	 WebDriverWait wait4=new WebDriverWait(driver,Duration.ofSeconds(20));
	    	
	    wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("//tbody/tr[3]/td[3]/img[2]"))).click();
	    driver.findElement(By.xpath("(//input[contains(@type,'checkbox')])[2]")).click();
	    WebDriverWait wait6=new WebDriverWait(driver,Duration.ofSeconds(20)); 
   	 
  	  String message = wait6.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='toast-body'][normalize-space()='Success! Your data has been saved.'])[2]"))).getText();
        System.out.println("  " + message);
        Assert.assertEquals(message, "Success! Your data has been saved.", "Not updated!Try again");	
        driver.findElement(By.xpath("(//button[normalize-space()='Close'])[1] ")).click();
	    	
	    	
	    	
	    	
	    	
	    }
	    
	    
	    
	      
	           @Test(priority=3)
	      public void addUser() {
	        	   
	        	  
	   	    	    WebDriverWait wait3=new WebDriverWait(driver,Duration.ofSeconds(20));
	   	    	
	        	   wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[contains(text(),'صارفین')])[1]"))).click();
	        	   driver.findElement(By.xpath("(//input[@id='nameInput'])[1]")).sendKeys("Usama");
	        	   driver.findElement(By.xpath("(//input[@id='nameInput'])[2]")).sendKeys("Usama");
	        	   driver.findElement(By.xpath("(//input[@id='nameInput'])[3]")).sendKeys("Usama");
	        	   driver.findElement(By.xpath("(//button[contains(text(),'منتخب کریں')])[1]")).click();
	        	   driver.findElement(By.xpath("(//small[normalize-space()='Data Entry Operator'])[1]")).click();
	        	   driver.findElement(By.xpath("(//input[@id='nameInput'])[4]")).sendKeys("12345678aA@");
	        	   driver.findElement(By.xpath("(//input[@id='nameInput'])[5]")).sendKeys("12345678aA@");
	        	   driver.findElement(By.xpath("(//input[@id='checkbox1'])[1]")).click();
	        	   driver.findElement(By.xpath("//button[contains(text(),'محفوظ کریں')]")).click();
	        	   WebDriverWait wait4=new WebDriverWait(driver,Duration.ofSeconds(30));
	        	   String  message = wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='toast-body'][normalize-space()='Added!'])[3]"))).getText();
	        	   System.out.println(" " + message);
	        	   Assert.assertEquals(message,"Added!","User already Exist," );
	        	   
	        	   
	      }  
	      
	
	           @AfterClass
	           public void tearDown() {
	          	
	               if (driver != null) {
	                   driver.quit();
	               } }
	
	
	

}
