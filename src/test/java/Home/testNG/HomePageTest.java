package Home.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

import TricentisAutomation.BaseClass;


public class HomePageTest extends BaseClass {
	
	@Test
	public void homePage() {
	launchBrowser("Chrome");
	driver.manage().window().maximize();
	driver.get("http://sampleapp.tricentis.com/101/index.php");
	
	String originalTitle = driver.getTitle();
	String testTitle = "Tricentis Vehicle Insurance";
	
	Assert.assertEquals(originalTitle, testTitle);
	
	driver.close();
	
	}
	

}
