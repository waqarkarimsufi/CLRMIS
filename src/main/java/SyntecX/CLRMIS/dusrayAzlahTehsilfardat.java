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

public class dusrayAzlahTehsilfardat {
	
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
        	}	 } 
	 
	 @Test(priority=1)	  
	   public void durayAzalahKTehsilfardat() {
      	
		 try {
	  			Thread.sleep(5000);
	  		} catch (InterruptedException e) {
	  		
	  			e.printStackTrace();
	  		}
	    	
	    	 WebElement language= driver.findElement(By.xpath("//label[@for='languageToggle'] "));
	    	language.click();
	   	
	   	WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[name()='svg'][@class='custom-svg-new'])[3]"))).click();   

		WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[contains(text(),'دوسرے اذلا و تحصیل کے فردات')])[1]"))).click();
	    	
		
		WebDriverWait wait5 = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait5.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@id='district'])[1]"))).click();
		WebDriverWait wait6 = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait6.until(ExpectedConditions.elementToBeClickable(By.xpath("(//small[contains(text(),'پشاور')])[1]"))).click();
		
		WebDriverWait wait7 = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait7.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='tehsil']"))).click();
		WebDriverWait wait8 = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait8.until(ExpectedConditions.elementToBeClickable(By.xpath("(//small[contains(text(),'پشاور شہر')])[1]"))).click();
		
		
		
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
        WebElement Moza=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='moza']")));
    	 Moza.click();
    	driver.findElement(By.xpath("(//small[contains(text(),'پاوکہ')])[1]")).click();
    	driver.findElement(By.id("cnic")).sendKeys("71501-9698772-0 ");
    	driver.findElement(By.id("name")).sendKeys("وقار ");
    	driver.findElement(By.xpath("(//button[@id='relation'])[1]")).click();
    	driver.findElement(By.xpath("(//button[@type='button'])[18]")).click();
    	driver.findElement(By.id("fathername")).sendKeys("کریم ");
    	driver.findElement(By.id("contact")).sendKeys("03425035168");
    	driver.findElement(By.id("temporaryAddress")).sendKeys("گلگت");
    	driver.findElement(By.xpath("//button[@id='facility']")).click();
    	driver.findElement(By.xpath("(//small[contains(text(),'فرد')])[1]")).click();
    	
    	WebDriverWait wait10=new WebDriverWait(driver,Duration.ofSeconds(20));
    	wait10.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@id='purpose'])[1]"))).click();
    	driver.findElement(By.xpath("(//small[contains(text(),'فرد برائے ذاتی معلومات')])[1]")).click();
    	driver.findElement(By.xpath("(//button[contains(text(),'محفوظ کریں')])[1]")).click(); 
    	
    	WebDriverWait waitSave=new WebDriverWait(driver,Duration.ofSeconds(20));
    	waitSave.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(text(),'جئ ہاں')])[1]"))).click();
    	
    	WebDriverWait waitCancel=new WebDriverWait(driver,Duration.ofSeconds(20));
    	
    	waitCancel.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[contains(text(),'مسترد کریں')])[1]"))).click();
    	
		
		
		
	 }
	 
	 
	 
	  @Test(priority=2)
      public void searchToken() {
		  
		  try {
	  			Thread.sleep(5000);
	  		} catch (InterruptedException e) {
	  		
	  			e.printStackTrace();
	  		}
	    	
		
		  
		  WebDriverWait waitSearch=new WebDriverWait(driver,Duration.ofSeconds(20));
   	   
   	     waitSearch.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(text(),'ٹوکن تلاش کریں')])[1]"))).click();
   	  
   	     
   	     
   	   WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
   	   
   	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//td[contains(text(),'وقار')])[1]"))).click();
   	   driver.findElement(By.xpath("(//span[@class='mx-1'])[1]")).click();
   	   
   	    }
     
	 
	 
	 
	 @AfterClass
	 public void tearDown() {
		 
		 if(driver!=null)
		 {
			 
			 driver.quit();
		 }
	      
		 
		 
	 }
	 
	 

}
