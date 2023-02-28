package TricentisAutomation;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutomobileInsuranceTest extends BaseClass{
	
	@BeforeTest
	public void setBaseUrl() {
		
	launchBrowser("Chrome");
	driver.manage().window().maximize();
	driver.get("http://sampleapp.tricentis.com/101/index.php");
	
	
	}
	
	@Test(priority = 1, groups="FirstClass")
	public void homePage() {
	
	String originalTitle = driver.getTitle();
	String testTitle = "Tricentis Vehicle Insurance";
	
	Assert.assertEquals(originalTitle, testTitle);
	
	
	}
	@Test(dependsOnGroups = "FirstClass")
	public void automobile() {
		
		driver.findElement(By.id("nav_automobile")).click();
		
		String automobilePage = driver.findElement(By.id("selectedinsurance")).getText();
		String testTitle = "Automobile Insurance";
		
		Assert.assertEquals(automobilePage, testTitle);	
	}
	
	
	
	public void enterVehicleData () {
		
		
	}
	
	
	
	
	
	
	

}
