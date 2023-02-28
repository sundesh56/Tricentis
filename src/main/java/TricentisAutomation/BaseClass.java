package TricentisAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {
	
public static WebDriver driver;
	
	public static void launchBrowser(String browser) {
		switch(browser) {
		case "chrome" :
		 
		      driver = new ChromeDriver();
		      driver.navigate().to("http://sampleapp.tricentis.com/101/index.php");
				driver.manage().window().maximize();
		        break;
		case "edge" :
		       
			driver=new EdgeDriver();
			driver.navigate().to("http://sampleapp.tricentis.com/101/index.php");
			driver.manage().window().maximize();
		        break;
		default:
			
			driver = new ChromeDriver();
			driver.navigate().to("http://sampleapp.tricentis.com/101/index.php");
			driver.manage().window().maximize();
				        
		}  
	}
	
	public static void gender(String gender) {
		
		
		switch(gender) {
		
		case "male" :	
			
			WebElement male = driver.findElement(By.xpath("//input[@id='gendermale']/../span"));
		
			if(male.isDisplayed()) {
				male.click();
				System.out.println("Gender checkbox is displayed - TC is passed");
				
			} else {
				
				System.out.println("Gender checkbox is not displayed - TC is failed");
				
			}
			
			if(male.isEnabled()) {
               System.out.println("Gender male checkbox is enabled - TC is passed");
				
			} else {
				
				System.out.println("Gender male checkbox is not enabled - TC is failed");
				
			}
			break;
			
		case "female" :
			
			WebElement female = driver.findElement(By.xpath("//input[@id='genderfemale']/../span"));
			female.click();
			
			if(female.isDisplayed()) {
				female.click();
				System.out.println("Gender checkbox is displayed - TC is passed");
				
			} else {
				
				System.out.println("Gender checkbox is not displayed - TC is failed");
				
			}
			
			if(female.isEnabled()) {
               System.out.println("Gender female checkbox is enabled - TC is passed");
				
			} else {
				
				System.out.println("Gender female checkbox is not enabled - TC is failed");
				
			}
			break;
			
		default: 
			driver.findElement(By.xpath("//input[@id='gendermale']/../span")).click();
		}
		
	}
	
	public static void hobbies(String hobbie) {
        switch(hobbie) {
		
		case "Speeding" :
			
			driver.findElement(By.xpath("//input[@id='speeding']/../span")).click();
			break;
			
		case "Bungee Jumping" :
			
			driver.findElement(By.xpath("//input[@id='bungeejumping']/../span")).click();
			break;
			
        case "Cliff Diving" :
			
			driver.findElement(By.xpath("//input[@id='cliffdiving']/../span")).click();
			break;
			
        case "Skydiving" :
			
			driver.findElement(By.xpath("//input[@id='skydiving']/../span")).click();
			break;	
	 		
       case "Other" :
			
			driver.findElement(By.xpath("//input[@id='other']/../span")).click();
			break;		
			
			
       default: 
			driver.findElement(By.xpath("//input[@id='other']/../span")).click();
		}
		
		
	}
	

}
