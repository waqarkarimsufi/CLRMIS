package SyntecX.CLRMIS;

import java.time.Duration;
import java.util.NoSuchElementException;

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
import org.testng.annotations.Test;

import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Token {
	
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
	  			Thread.sleep(5000);
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
	    	waitfard.until(ExpectedConditions.elementToBeClickable(By.xpath("(//small[contains(text(),'فرد برائے ذاتی معلومات')])[1]"))).click();
	    	driver.findElement(By.xpath("(//button[contains(text(),'محفوظ کریں')])[1]")).click(); 
	    	
	    	WebDriverWait wait2=new WebDriverWait(driver,Duration.ofSeconds(20));
	    	wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[contains(text(),'مسترد کریں')])[1]"))).click();
             
	    }
	      
	     
	       
	       @Test(priority=2)
	       public void serchToken() {
	    	   
	    	   driver.findElement(By.xpath("(//button[contains(text(),'تلاش ٹوکن')])[1]")).click();
	    	   
	    	   WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	    	   
	    	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//td[@data-label='انتخاب کریں'])[1]"))).click();
	    	   driver.findElement(By.xpath("(//span[@class='mx-1'])[1]")).click();
	    	   
	    	    }
	      
	       @AfterClass
           public void tearDown() {
               
               if (driver != null) {
                   driver.quit();
               } 
	      
	      } 
	       }
