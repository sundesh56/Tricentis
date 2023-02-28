package TricentisPages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class MotorcycleInsurance extends TricentisAutomation.BaseClass{

	public static void main(String[] args) {
		launchBrowser("chrome");
		driver.navigate().to("http://sampleapp.tricentis.com/101/index.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("nav_motorcycle")).click();
		
		// Enter Vehicle data
		// Make	
		Select make = new Select(driver.findElement(By.id("make")));
		make.selectByValue("BMW");
		
		// Model
		Select model = new Select(driver.findElement(By.id("model")));
		model.selectByValue("Scooter");
		
		// Cylinder Capacity [ccm]
		driver.findElement(By.id("cylindercapacity")).sendKeys("1000");
		
		// Engine Performance [kW]
		driver.findElement(By.id("engineperformance")).sendKeys("1000");
		
		// Date of Manufacture
		driver.findElement(By.id("dateofmanufacture")).sendKeys("1/1/2000");
		
		// Number of Seats
		Select seat = new Select(driver.findElement(By.id("numberofseatsmotorcycle")));
		seat.selectByValue("1");
		
		// List Price [$]
		driver.findElement(By.id("listprice")).sendKeys("50000");
		
		// Annual Mileage [mi]
		driver.findElement(By.id("annualmileage")).sendKeys("10000");
		
		// Next	
		driver.findElement(By.id("nextenterinsurantdata")).click();
		
		// Enter Insurance data
		// F Name
		driver.findElement(By.id("firstname")).sendKeys("Sandy");
		
		// L Name
		driver.findElement(By.id("lastname")).sendKeys("Khan");
		
		// DOB
		driver.findElement(By.id("birthdate")).sendKeys("1/1/2000");
		
		// Gender
		gender("male");
		
		// Street Address
		driver.findElement(By.id("streetaddress")).sendKeys("Pune");
		
		// Country
		Select cn = new Select(driver.findElement(By.id("country")));
		cn.selectByValue("India");
		
		// Zip Code
		driver.findElement(By.id("zipcode")).sendKeys("411141");
		
		// City
		driver.findElement(By.id("city")).sendKeys("Pune");
		
		// Occupation
		Select oc = new Select(driver.findElement(By.id("occupation")));
		oc.selectByValue("Unemployed");
		
		// Hobbies
		hobbies("Skydiving");
		
		// Website
		driver.findElement(By.id("website")).sendKeys("www.xyz.com");
		
		// Picture
		driver.findElement(By.id("picturecontainer")).sendKeys("D:\\Automation\\DSC_1082.JPG");
		
		// Next
		driver.findElement(By.id("nextenterproductdata")).click();
	}

}
