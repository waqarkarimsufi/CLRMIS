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

public class andrajEDastavezaat {
	
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
     	public void andrajEDastavezaat() {
        	 try {
 	  			Thread.sleep(5000);
 	  		} catch (InterruptedException e) {
 	  		
 	  			e.printStackTrace();
 	  		}
 	    	
 	    	 WebElement language= driver.findElement(By.xpath("//label[@for='languageToggle'] "));
 	    	language.click();
 	    	
 	    	WebDriverWait dastavezaat=new WebDriverWait(driver,Duration.ofSeconds(20));
 	    	dastavezaat.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[name()='svg'][@class='custom-svg'])[11]"))).click();
 	    	
 	    	WebDriverWait andrajEDastavezaat=new WebDriverWait(driver,Duration.ofSeconds(20));
     		andrajEDastavezaat.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[contains(text(),'اندراج دستاویزات')])[1]"))).click();
 	    	 
     		WebDriverWait moza=new WebDriverWait(driver,Duration.ofSeconds(20));
     		moza.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@id='MouzaSelect'])[1]"))).click();
     		
     		WebDriverWait mozaSelect=new WebDriverWait(driver,Duration.ofSeconds(20));
     		mozaSelect.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(@type,'button')])[8]"))).click();
     		
     		WebDriverWait type=new WebDriverWait(driver,Duration.ofSeconds(20));
     		type.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@id='descriptionDocument_DocumentType'])[1]"))).click();
     		
     		WebDriverWait typeSelection=new WebDriverWait(driver,Duration.ofSeconds(20));
     		typeSelection.until(ExpectedConditions.elementToBeClickable(By.xpath("(//small[contains(text(),'Fard-e-Badar')])[1] "))).click();
     		    
     		WebDriverWait number=new WebDriverWait(driver,Duration.ofSeconds(20));
     		number.until(ExpectedConditions.elementToBeClickable(By.id("descriptionDocument_DocumentNumber"))).sendKeys("127");
     		
     		WebDriverWait count=new WebDriverWait(driver,Duration.ofSeconds(20));
     		count.until(ExpectedConditions.elementToBeClickable(By.id("descriptionDocument_PageCount"))).sendKeys("2");
     		
     		WebDriverWait topic=new WebDriverWait(driver,Duration.ofSeconds(20));
     		topic.until(ExpectedConditions.elementToBeClickable(By.id("descriptionDocument_Title"))).sendKeys("عنوان");
     		
     		WebDriverWait detail=new WebDriverWait(driver,Duration.ofSeconds(20));
     		detail.until(ExpectedConditions.elementToBeClickable(By.id("descriptionDocument_Description"))).sendKeys("تفصیل");
     		
     		
     		WebDriverWait save=new WebDriverWait(driver,Duration.ofSeconds(20));
     		save.until(ExpectedConditions.elementToBeClickable(By.id("intiqalatbtn"))).click();
     		
     		WebDriverWait success=new WebDriverWait(driver,Duration.ofSeconds(20));
     		WebElement element=success.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='toast-body'][normalize-space()='Record Added Successfully'])[2]")));
     	     String expectedMessage=element.getText();
     		
     	    Assert.assertEquals(expectedMessage,"Record Added Successfully","Test case failed" );
     		
     		
     		
     		
     		
     		
     		
     	}
             @Test(priority=2)
         public void talashTabdeliDocument() {
        	 
        	 WebDriverWait talashtabdeliTab=new WebDriverWait(driver,Duration.ofSeconds(20));
        	 talashtabdeliTab.until(ExpectedConditions.elementToBeClickable(By.id("pills-profile-tab-1"))).click();
        	 
        	 WebDriverWait number=new WebDriverWait(driver,Duration.ofSeconds(20));
        	 number.until(ExpectedConditions.elementToBeClickable(By.id("searchAndEditDocumentStatus_DocumentNumber"))).sendKeys("127");
        	 
        	 WebDriverWait search=new WebDriverWait(driver,Duration.ofSeconds(20));
        	 search.until(ExpectedConditions.elementToBeClickable(By.id("searchbtn"))).click();
        	 
        	 WebDriverWait selection=new WebDriverWait(driver,Duration.ofSeconds(20));
        	 selection.until(ExpectedConditions.elementToBeClickable(By.xpath("(//td[@data-label='قسم دستاویز'])[1]"))).click();
        	 
        	 WebDriverWait updatePage=new WebDriverWait(driver,Duration.ofSeconds(20));
        	 WebElement element=updatePage.until(ExpectedConditions.elementToBeClickable(By.id("PageCountUpdate")));
        	 element.clear();
        	 element.sendKeys("3");
        	 
        	 WebDriverWait completed=new WebDriverWait(driver,Duration.ofSeconds(20));
        	 completed.until(ExpectedConditions.elementToBeClickable(By.id("KhataJaat"))).click();
        	 
        	 WebDriverWait submit=new WebDriverWait(driver,Duration.ofSeconds(20));
        	 submit.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div)[109]"))).click();
        	 
        	 WebDriverWait message=new WebDriverWait(driver,Duration.ofSeconds(20));
        	String text=message.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='toast-body'][normalize-space()='Record(s) found!'])[2] "))).getText();
        	 
        	 Assert.assertEquals(text, "Record(s) found!","Test Case Failed");
        	 
        	 
         }
         
         @Test(priority=3)
         public void registryAndraj() {
        	 
        	Actions action=new Actions(driver); 
        WebDriverWait registryTab=new WebDriverWait(driver,Duration.ofSeconds(20));
        WebElement element= registryTab.until(ExpectedConditions.elementToBeClickable(By.id("pills-profile-tab-3")));
        action.moveToElement(element).click().perform();
        	 
        WebDriverWait moza=new WebDriverWait(driver,Duration.ofSeconds(20));
        moza.until(ExpectedConditions.elementToBeClickable(By.id("registrarMouzaSelect"))).click();
        	 
        WebDriverWait mozaSelect=new WebDriverWait(driver,Duration.ofSeconds(20));
        mozaSelect.until(ExpectedConditions.elementToBeClickable(By.xpath("(//small[contains(text(),'پاوکہ')])[4]"))).click();
        
        WebDriverWait number=new WebDriverWait(driver,Duration.ofSeconds(20));
        number.until(ExpectedConditions.elementToBeClickable(By.id("registryEntry_RegistryNumber"))).sendKeys("22");
        
        WebDriverWait number2=new WebDriverWait(driver,Duration.ofSeconds(20));
        number2.until(ExpectedConditions.elementToBeClickable(By.id("registryEntry_VolumeNumber"))).sendKeys("23");
        
        WebDriverWait subRegistrar=new WebDriverWait(driver,Duration.ofSeconds(20));
        subRegistrar.until(ExpectedConditions.elementToBeClickable(By.id("registryEntry_SubRegistry"))).click();
        
        WebDriverWait subRegistrarSelection=new WebDriverWait(driver,Duration.ofSeconds(20));
        subRegistrarSelection.until(ExpectedConditions.elementToBeClickable(By.xpath("(//small[contains(text(),'رستم')])[1]"))).click();
        
        WebDriverWait baya=new WebDriverWait(driver,Duration.ofSeconds(20));
        baya.until(ExpectedConditions.elementToBeClickable(By.id("registryEntry_Seller"))).sendKeys("وقار");
        
        WebDriverWait mushtiri=new WebDriverWait(driver,Duration.ofSeconds(20));
        mushtiri.until(ExpectedConditions.elementToBeClickable(By.id("registryEntry_Buyer"))).sendKeys("یاسر");
        
        WebDriverWait kafiyat=new WebDriverWait(driver,Duration.ofSeconds(20));
        kafiyat.until(ExpectedConditions.elementToBeClickable(By.id("registryEntry_Quality"))).sendKeys("کیفیت");
        
        
        WebDriverWait save=new WebDriverWait(driver,Duration.ofSeconds(20));
        save.until(ExpectedConditions.elementToBeClickable(By.xpath("(//img[@alt='save'])[4]"))).click();
        
        WebDriverWait message=new WebDriverWait(driver,Duration.ofSeconds(20));
     String text=message.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='toast-body'][normalize-space()='Record Added Successfully'])[2]"))).getText();
        
     Assert.assertEquals(text,"Record Added Successfully","Test Case Failed");
        
        
         }
         
         @Test(priority=4)
        public void tabdeliRegistry() {
        	
        	
        	 WebDriverWait tab=new WebDriverWait(driver,Duration.ofSeconds(20));
             tab.until(ExpectedConditions.elementToBeClickable(By.id("pills-profile-tab-4"))).click();
        	
             WebDriverWait search=new WebDriverWait(driver,Duration.ofSeconds(20));
             search.until(ExpectedConditions.elementToBeClickable(By.id("searchSubRegistryNumber"))).sendKeys("123");
        	
             WebDriverWait searchbutton=new WebDriverWait(driver,Duration.ofSeconds(20));
             searchbutton.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@id='searchbtn'])[2]"))).click();
             
             WebDriverWait registrySelection=new WebDriverWait(driver,Duration.ofSeconds(20));
             registrySelection.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/article[1]/div[2]/div[2]/div[5]/div[3]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]"))).click();
             
             
             WebDriverWait complete=new WebDriverWait(driver,Duration.ofSeconds(20));
             complete.until(ExpectedConditions.elementToBeClickable(By.id("subRegistryComplete"))).click();
             
             WebDriverWait save=new WebDriverWait(driver,Duration.ofSeconds(20));
             save.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@id='intiqalatbtn'])[5]"))).click();
             
             WebDriverWait message=new WebDriverWait(driver,Duration.ofSeconds(20));
             String text=message.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='toast-body'][normalize-space()='Record(s) found!'])[2]"))).getText();
                
             Assert.assertEquals(text,"Record(s) found!","Test Case Failed");
        	
        }
         
         
         @AfterClass
         public void tearDown() {
             
             if (driver != null) {
                 driver.quit();
             } 
	      
	      } 



}
