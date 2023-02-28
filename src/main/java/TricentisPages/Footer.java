package TricentisPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Footer {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://sampleapp.tricentis.com/101/index.php");
		driver.manage().window().maximize();
		
		
		// About 
		driver.findElement(By.id("tricentis_about")).click();
		
	   String actualTitle = driver.getTitle();
	   String expectedTitle = "Tricentis - 404";
	   if(actualTitle.contains(expectedTitle)) {
		   
		   System.out.println("About page is opened - TC is passed");
	   } else {
		   
		   System.out.println("About page is not opened - TC is failed");
	   }
	   
	   driver.navigate().back();
	   
	   
	   // Product
	   driver.findElement(By.id("tricentis_products")).click();
	   String actualTitle1 = driver.getTitle();
	   System.out.println(actualTitle1);
	   String expectedTitle1 = "Tricentis Tosca – Accelerate & Automate Continuous Testing | Tricentis";
       if(actualTitle1.contains(expectedTitle1)) {
		   
		   System.out.println("Product page is opened - TC is passed");
	   } else {
		   
		   System.out.println("Product page is not opened - TC is failed");
	   }
       
       driver.navigate().back();
       
       // Events and Webinars
       
       driver.findElement(By.id("tricentis_events")).click();
       String actualTitle2 = driver.getTitle();
	   System.out.println(actualTitle2);
	   String expectedTitle2 = "Upcoming Events - Tricentis";
       if(actualTitle2.contains(expectedTitle2)) {
		   
		   System.out.println("Events page is opened - TC is passed");
	   } else {
		   
		   System.out.println("Events page is not opened - TC is failed");
	   }
       
       driver.navigate().back();
       
       // Resorces
       
       driver.findElement(By.id("tricentis_resources")).click();
       String actualTitle3 = driver.getTitle();
	   System.out.println(actualTitle3);
	   String expectedTitle3 = "DevOps & Test Automation Resources | Tricentis";
       if(actualTitle3.contains(expectedTitle3)) {
		   
		   System.out.println("Resources page is opened - TC is passed");
	   } else {
		   
		   System.out.println("Resources page is not opened - TC is failed");
	   }
       
       driver.navigate().back();
       
      // Services
       
       driver.findElement(By.id("tricentis_services")).click();
       Thread.sleep(2000);
       String actualTitle4 = driver.getTitle();
	   System.out.println(actualTitle4);
	   String expectedTitle4 = "Tricentis Customer Experience";
       if(actualTitle4.contains(expectedTitle4)) {
		   
		   System.out.println("Services page is opened - TC is passed");
	   } else {
		   
		   System.out.println("Services page is not opened - TC is failed");
	   }
       
       driver.navigate().back();
       
       // Facebook
       
       String parentHandle = driver.getWindowHandle(); 
       driver.findElement(By.id("nav_facebook")).click();
       
       for (String winHandle : driver.getWindowHandles()) {
    	    driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
    	    
    	    String facebook = driver.getTitle();
    	    String expectedFacebook = "Tricentis | Austin TX";
    	    System.out.println(facebook);
    	    if(!parentHandle.equals(winHandle)) {
    	    	
    	        if(facebook.contains(expectedFacebook)) {
    	    	   System.out.println("facebook page is opened - TC is passed");
    	    	
    	        } else {
    	    	System.out.println("facebook page is not opened - TC is failed");
    	    	
    	    }
    	}
       }
       
       driver.close(); // close newly opened window when done with it
       driver.switchTo().window(parentHandle); // switch back to the original window
      
     
	  driver.findElement(By.id("nav_twitter")).click();
	  
	  for (String winHandle : driver.getWindowHandles()) {
	  driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
	  
	  String twitter = driver.getTitle(); 
	  String expectedtwitter ="Tricentis (@Tricentis) / Twitter"; 
	  System.out.println(twitter);
	  
	  if(!parentHandle.equals(winHandle)) {
	      if(twitter.contains(expectedtwitter)) {
		  
        	  System.out.println("twitter page is opened - TC is passed");
	  
	     } else {
	 	  System.out.println("twitter page is not opened - TC is failed");
	  
	            } 
         }
       }
	  
	  driver.close(); // close newly opened window when done with it
	  driver.switchTo().window(parentHandle); // switch back to the original window
	  
	  
	  driver.findElement(By.id("nav_google")).click();
	  for (String winHandle : driver.getWindowHandles()) {
		  driver.switchTo().window(winHandle);
		  
		  String google = driver.getTitle(); 
		  String expectedgoogle ="Sign in - Google Accounts"; 
		  System.out.println(google);
		  
		  if(!parentHandle.equals(winHandle)) {
		      if(google.contains(expectedgoogle)) {
			  
	        	  System.out.println("google page is opened - TC is passed");
		  
		     } else {
		 	  System.out.println("google page is not opened - TC is failed");
		  
		  } 
	  }
		  
	  }
	  driver.close(); 
	  driver.switchTo().window(parentHandle);
	  
	}

}
