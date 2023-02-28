		
package TricentisPages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomobileInsurance {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.navigate().to("http://sampleapp.tricentis.com/101/index.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("nav_automobile")).click();
		if(driver.findElement(By.id("selectedinsurance")).isDisplayed()) {
			
			System.out.println("Automobile Insurance page is displayed - TC is passed");
		} else {
			System.out.println("Automobile Insurance page is  not displayed - TC is failed");
			
		}
		
		// Make
		
		Select make =  new Select(driver.findElement(By.id("make")));
		make.selectByVisibleText("BMW");
		
		System.out.println(counter());
		if(counter().contains("6")) {
			System.out.println("The counter is correct 6 - TC is passed ");
		} else {
			
			System.out.println("The counter is incorrect 6 - TC is failed ");
		}
		
		// Engine performance
		
		driver.findElement(By.id("engineperformance")).sendKeys("1000");
		System.out.println(counter());
		if(counter().contains("5")) {
			System.out.println("The counter is correct 5 - TC is passed ");
		} else {
			
			System.out.println("The counter is incorrect 5 - TC is failed ");
		}
		
		
		// Date of Manufacture
		
		driver.findElement(By.id("opendateofmanufacturecalender")).click();
		 calenderHandling("2000","February","20");
		 
		 if(counter().contains("4")) {
				System.out.println("The counter is correct 4 - TC is passed ");
			} else {
				
				System.out.println("The counter is incorrect 4 - TC is failed ");
			}
		 
		// Number of Seats
		 
		 Select nOS= new Select(driver.findElement(By.id("numberofseats")));
		 nOS.selectByValue("5");
		 if(counter().contains("3")) {
				System.out.println("The counter is correct 3 - TC is passed ");
			} else {
				
				System.out.println("The counter is incorrect 3 - TC is failed ");
			}
		 
		// Fuel Type
		 
		 Select fuel= new Select(driver.findElement(By.id("fuel")));
		 fuel.selectByValue("Petrol");
		 if(counter().contains("2")) {
				System.out.println("The counter is correct 2 - TC is passed ");
			} else {
				
				System.out.println("The counter is incorrect 2 - TC is failed ");
			}
		 
		 //List Price [$]
		 
		 String price = "5000";
		 driver.findElement(By.id("listprice")).sendKeys(price);
		
		try {	 
			
		    System.out.println("The value " +driver.findElement(By.xpath("(//div[@class='field idealforms-field idealforms-field-text invalid'])[2]/span")).getText()+ "- TC failed");
		 
		  } catch(Exception e) {
			
			  System.out.println("The Price value is within limit - TC is passed");
			  
			  if(counter().contains("1")) {
					System.out.println("The counter is correct 1 - TC is passed ");
				} else {
					
					System.out.println("The counter is incorrect 1 - TC is failed ");
				}
			
		}
		
		
		// License Plate Number
		
		driver.findElement(By.id("licenseplatenumber")).sendKeys("PUNE");
		
		
		
		
		// Annual Mileage [mi]
		
		driver.findElement(By.id("annualmileage")).sendKeys("1000");
		Thread.sleep(2000);
		
		/*
		 * if(counter().contains("0")) {
		 * 
		 * System.out.println("The counter is correct 0 - TC is passed "); } else {
		 * 
		 * System.out.println("The counter is incorrect 0 - TC is failed "); }
		 */
		
		
		
		 // Enter Insurance Data
	
		
		driver.findElement(By.id("nextenterinsurantdata")).click();
		
			if(driver.findElement(By.id("enterinsurantdata")).isDisplayed()) {
				
				System.out.println("Enter Insurance Data page is opened - TC is passed");
				
			} else {
				
				System.out.println("Enter Insurance Data page is  not opened - TC is failed");
			}
			
			// First Name
			
			driver.findElement(By.id("firstname")).sendKeys("ABC");
			if(counter_E().contains("6")) {
				System.out.println("Insurance Data counter is correct 6 - TC is passed ");
			} else {
				
				System.out.println("Insurance Data counter is incorrect 6 - TC is failed ");
			}
			
			// Last Name
			
			driver.findElement(By.id("lastname")).sendKeys("XYZ");
			
			if(counter_E().contains("5")) {
				System.out.println("Insurance Data counter is correct 5 - TC is passed ");
			} else {
				
				System.out.println("Insurance Data counter is incorrect 5 - TC is failed ");
			}
			
			
			// Date of Birth
			
			/*
			 * driver.findElement(By.id("opendateofbirthcalender")).click();
			 * calenderHandling("1984","Feb","26");
			 */
			
			driver.findElement(By.id("birthdate")).sendKeys("06/02/2000");
			if(counter_E().contains("4")) {
				System.out.println("Insurance Data counter is correct 4 - TC is passed ");
			} else {
				
				System.out.println("Insurance Data counter is incorrect 4 - TC is failed ");
			}
			
			
			// Gender
			gender("female");
			
			
			
			//Street Address	
			driver.findElement(By.id("streetaddress")).sendKeys("Pune");
			
			//Country		
			Select c = new Select(driver.findElement(By.id("country"))); 
				
			String country = driver.findElement(By.id("country")).getText();
		//	System.out.println(country);
			if(country.contains("India")) {
				c.selectByValue("India");
				System.out.println("Country is properly selected - TC is passed");
			} else {
				
				System.out.println("Country name is wrong - TC is failed");
			}
			
			
			if(counter_E().contains("3")) {
				System.out.println("Insurance Data counter is correct 3 - TC is passed ");
			} else {
				
				System.out.println("Insurance Data counter is incorrect 3 - TC is failed ");
			}
			
			
			
			// Zip Code and city
			
			driver.findElement(By.id("zipcode")).sendKeys("411015");
			driver.findElement(By.id("city")).sendKeys("pune");
			
			if(counter_E().contains("2")) {
				System.out.println("Insurance Data counter is correct 2 - TC is passed ");
			} else {
				
				System.out.println("Insurance Data counter is incorrect 2 - TC is failed ");
			}
			
			
			
            
			// Occupation
			
			Select o = new Select(driver.findElement(By.id("occupation")));       
			o.selectByValue("Employee");
			
			if(counter_E().contains("1")) {
				System.out.println("Insurance Data counter is correct 1 - TC is passed ");
			} else {
				
				System.out.println("Insurance Data counter is incorrect 1 - TC is failed ");
			}
			
			// Hobbies			
			hobbies("Skydiving");
			
			
			
			
			// Website
			
			driver.findElement(By.id("website")).sendKeys("www.xyz.com");
			driver.findElement(By.id("picturecontainer")).sendKeys("D:\\Automation\\DSC_1082.JPG");
			
			// Next
			
			driver.findElement(By.id("nextenterproductdata")).click();
			
			
			
	// ENTER PRODUCT DATA
			 //Start Date
			
	/*
	 * driver.findElement(By.id("openstartdatecalender")).click();
	 * calenderHandling("2023","February","22");
	 */
			
			driver.findElement(By.id("startdate")).sendKeys("03/03/2024");
			
			//Insurance Sum [$]
			Select sc = new Select(driver.findElement(By.id("insurancesum")));
			sc.selectByValue("10000000");
			
			
			// Merit Rating
			Select sc2 = new Select(driver.findElement(By.id("meritrating")));
			sc2.selectByValue("Bonus 2");
			
			Select sc1 = new Select(driver.findElement(By.id("damageinsurance")));
			sc1.selectByValue("Full Coverage");
			
			// Optional Products
			driver.findElement(By.xpath("//input[@id='LegalDefenseInsurance']/../span")).click();
			
			// Courtesy Car
			Select sc3 = new Select(driver.findElement(By.id("courtesycar")));
			sc3.selectByValue("Yes");
			
			
		driver.findElement(By.id("nextselectpriceoption")).click();
		
		
	
		// Select Action Plan
		SelectPriceAction("Platinum");
		
		
		WebElement next = driver.findElement(By.id("nextsendquote"));   
		JavascriptExecutor jse = (JavascriptExecutor) driver;    //  We used it when issue with " Element not clickable issue"
		jse.executeScript("arguments[0].click();",next);
		
		
		// Send Quote
		
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("9999999999");
		driver.findElement(By.id("username")).sendKeys("Sandesh");
		driver.findElement(By.id("password")).sendKeys("Xxxxxxx123");
		driver.findElement(By.id("confirmpassword")).sendKeys("Xxxxxxx123");
		driver.findElement(By.id("Comments")).sendKeys("ABCDEFGHJKLMNOPQRSTUVWXY");
		
		driver.findElement(By.id("sendemail")).click();
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		
		
	}	
			
	static String counter() {
		
		
		String counter = driver.findElement(By.xpath("//span[@class='counter']")).getText();
		return counter;
		
	}
	
	static String counter_E() {
	//	String counter1 = driver.findElement(By.xpath("(//span[@class='counter'])[2]")).getText();
		String counter1 = driver.findElement(By.xpath("//a[@id='enterinsurantdata']/span")).getText();
		return counter1;
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
	
	
	static void hobbies(String hobbie) {
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
	
	
	static void SelectPriceAction(String plan) {
        switch(plan) {
		
		case "Silver" :
			
			driver.findElement(By.xpath("//input[@id='selectsilver']/../span")).click();
			break;
			
		case "Gold" :
			
			driver.findElement(By.xpath("//input[@id='selectgold']/../span")).click();
			break;
			
        case "Platinum" :
			
			driver.findElement(By.xpath("//input[@id='selectplatinum']/../span")).click();
			break;
			
        case "Ultimate" :
			
			driver.findElement(By.xpath("//input[@id='selectultimate']/../span")).click();
			break;	
	 				
       default: 
			driver.findElement(By.xpath("//input[@id='selectsilver']/../span")).click();
		}
		
		
	}
		
		
		
	
	
        public static void calenderHandling(String year, String month, String date) {
		
		String monthYear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		String month1 = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']/span[1]")).getText();
		String year1 =driver.findElement(By.xpath("//div[@class='ui-datepicker-title']/span[2]")).getText();
		System.out.println("Year -" +year1);
		System.out.println("month - " +month1);
		WebElement arrowPrev = driver.findElement(By.xpath("//span[text()='Prev']/.."));

		WebElement arrowNext = driver.findElement(By.xpath("//a[@title='Next']"));

		/*
		 * while (!monthYear.contains(month) && !monthYear.contains(year)) {
		 * arrowNext.click(); break; }
		 */
		  
		  
		  while(!month1.contains("February") && !year1.contains("2023")) {
			  arrowNext.click();
		  break; }
		  
		 
		
		List<WebElement> d = driver.findElements(By.xpath("(//table)[2]/tbody/tr/td"));
		
		 for (int i = 0; i<d.size(); i++) {
	         //check expected data
	         String s = d.get(i).getText();
	         if (s.equals(date)) {
	            d.get(i).click();
	            break;
	         }
	       }
         }

}
