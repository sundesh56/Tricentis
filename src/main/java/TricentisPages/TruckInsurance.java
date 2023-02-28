package TricentisPages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TruckInsurance extends TricentisAutomation.BaseClass {
//	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		launchBrowser("chrome");
	//	driver = new ChromeDriver();
		driver.navigate().to("http://sampleapp.tricentis.com/101/index.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("nav_truck")).click();
		
		// Enter Vehicle Data
		// Make
		
		Select sc = new Select(driver.findElement(By.id("make")));
		sc.selectByValue("Volvo");
		
		// Engine Performance [kW]
		driver.findElement(By.id("engineperformance")).sendKeys("1000");
		
		// Date of Manufacture 
		driver.findElement(By.id("dateofmanufacture")).sendKeys("12/12/2012");
		
		// Number of Seats
		Select sc1 = new Select(driver.findElement(By.id("numberofseats")));
		sc1.selectByValue("5");
		
		// Fuel Type
		Select sc2 = new Select(driver.findElement(By.id("fuel")));
		sc2.selectByValue("Diesel");
		
		// Payload [kg]
		driver.findElement(By.id("payload")).sendKeys("500");
		
		// Total Weight [kg]
		driver.findElement(By.id("totalweight")).sendKeys("10000");
		
		// List Price [$]
		driver.findElement(By.id("listprice")).sendKeys("1111");
		
		// License Plate Number
		driver.findElement(By.id("licenseplatenumber")).sendKeys("Pune");
		
		// Annual Mileage [mi]
		driver.findElement(By.id("annualmileage")).sendKeys("5000");
		
		
		driver.findElement(By.id("nextenterinsurantdata")).click();
		
		// First name
		driver.findElement(By.id("firstname")).sendKeys("Tony");
		
		// Last name
		driver.findElement(By.id("lastname")).sendKeys("Stark");
		
		//DOB
		driver.findElement(By.id("birthdate")).sendKeys("04/04/2000");
		
		//Gender
		gender("male");
		
		// Street Address
		driver.findElement(By.id("streetaddress")).sendKeys("Pune");
		
		// Country
		Select country = new Select(driver.findElement(By.id("country")));		
		country.selectByValue("Canada");
		
		// Zip Code
		driver.findElement(By.id("zipcode")).sendKeys("111111");
		
		// City
		driver.findElement(By.id("city")).sendKeys("Pune");
		
		// Occupation
		Select occupation = new Select(driver.findElement(By.id("occupation")));	
		occupation.selectByValue("Employee");
		
		// Hobbies
		hobbies("Skydiving");
		
		// Website
		driver.findElement(By.id("website")).sendKeys("www.xyz.com");
		
		// Picture
		driver.findElement(By.id("picturecontainer")).sendKeys("D:\\Automation\\DSC_1082.JPG");
		
		// Next
		driver.findElement(By.id("nextenterproductdata")).click();		
		
		// Start Date
		driver.findElement(By.id("startdate")).sendKeys("12/12/2023");
		
		// Insurance Sum [$]
		Select ins =  new Select(driver.findElement(By.id("insurancesum")));
		ins.selectByValue("5000000");
		
		// Damage Insurance
		Select dins =  new Select(driver.findElement(By.id("damageinsurance")));
		dins.selectByValue("Full Coverage");
		
		// Optional Products		
		driver.findElement(By.xpath("//input[@id = 'EuroProtection']/..//span")).click();
		
		// Next
		driver.findElement(By.id("nextselectpriceoption")).click();		
		
		
		// Select Price Option
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='selectultimate']/../span")).click();
		
		// VIEW QUOTE
		/*
		 * Thread.sleep(2000);
		 * driver.findElement(By.xpath("(//i[@class='fa fa-file-pdf-o'])[1]")).click();
		 * 
		 * 
		 * Thread.sleep(10000); String parentWindow = driver.getWindowHandle();
		 * driver.switchTo().window(parentWindow);
		 */
		
		 
		// Send Quote
		driver.findElement(By.id("nextsendquote")).click();
		
		// E-mail
		driver.findElement(By.id("email")).sendKeys("xyz@gmail.com");
		
		// Phone
		driver.findElement(By.id("phone")).sendKeys("9999999999");
		
		// Username
		driver.findElement(By.id("username")).sendKeys("ABCD");
		
		// Password
		driver.findElement(By.id("password")).sendKeys("Abcdef@123");
		
		// Confirm Password
		driver.findElement(By.id("confirmpassword")).sendKeys("Abcdef@123");
		
		
		driver.findElement(By.id("Comments")).sendKeys("NA");
		
		driver.findElement(By.id("sendemail")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[@class = 'confirm']")).click();
		
		
		// Main page return
		
		
		
		driver.findElement(By.id("backmain")).click();
		String homePage = driver.getTitle();
		
		if(homePage.equals("Tricentis Vehicle Insurance")) {
			
			System.out.println("Page Navigated to Home Page");
		} else {
			
			System.out.println("Page not Navigated to Home Page");
			
		}
		
		driver.navigate().back();
		
		Thread.sleep(5000);
		
		// New Truck Insurance
		
		Robot rb = new Robot();
	    Actions ac = new Actions(driver);
		ac.contextClick(driver.findElement(By.id("newtruckinsurance"))).build().perform();
		
	//	ac.contextClick(driver.findElement(By.xpath("//a[@id='newtruckinsurance']/span")));
		
		   rb.keyPress(KeyEvent.VK_DOWN);
		   rb.keyPress(KeyEvent.VK_ENTER);
		  
		  
		  if(driver.findElement(By.id("selectedinsurance")).isDisplayed()) {
		  
		  System.out.println("Page Navigated to Truck Insurance Page"); } else {
		  
		  System.out.println("Page not Navigated to Truck Insurance Page");
		  
		  }
		  
		  String parentwindow = driver.getWindowHandle();
		  driver.switchTo().window(parentwindow);
		  
		  // New Camper Insurance
		  
		  
		  ac.contextClick(driver.findElement(By.id("newcamperinsurance"))).build().perform();
		  
		  rb.keyPress(KeyEvent.VK_DOWN);
		  rb.keyPress(KeyEvent.VK_ENTER);
		 
		
	}

}
