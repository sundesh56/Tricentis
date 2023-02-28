package Home.testNG;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import TricentisAutomation.BaseClass;

public class EnterVehicleDataAutomobile extends BaseClass {

	@BeforeTest
	public void setBaseUrl() {

		launchBrowser("Chrome");
		driver.manage().window().maximize();
		driver.get("http://sampleapp.tricentis.com/101/index.php");
		driver.findElement(By.id("nav_automobile")).click();

	}

	@Test
	public void make() {

		Select make = new Select(driver.findElement(By.id("make")));

		List actualDropdownValues = new ArrayList();

		for (WebElement element : make.getOptions()) {
			actualDropdownValues.add(element.getText());

			// System.out.println(element.getText());
		}

		List expectedDropdownValues = new ArrayList();
		expectedDropdownValues.add("– please select –");
		expectedDropdownValues.add("Audi");
		expectedDropdownValues.add("BMW");
		expectedDropdownValues.add("Ford");
		expectedDropdownValues.add("Honda");
		expectedDropdownValues.add("Mazda");
		expectedDropdownValues.add("Mercedes Benz");
		expectedDropdownValues.add("Nissan");
		expectedDropdownValues.add("Opel");
		expectedDropdownValues.add("Porsche");
		expectedDropdownValues.add("Renault");
		expectedDropdownValues.add("Skoda");
		expectedDropdownValues.add("Suzuki");
		expectedDropdownValues.add("Toyota");
		expectedDropdownValues.add("Volkswagen");
		expectedDropdownValues.add("Volvo");

		for (int i = 0; i < actualDropdownValues.size(); i++) {

			// System.out.println("Actual : " +actualDropdownValues.get(i)+ "& expected : "
			// +expectedDropdownValues.get(i));
			Assert.assertTrue(actualDropdownValues.get(i).equals(expectedDropdownValues.get(i)));

		}
		
		make.selectByValue("BMW");
	}

	@Test
	public void EnginePerformance() {
		
		WebElement element = driver.findElement(By.id("engineperformance"));

		  
		  List list = new ArrayList(); 
		  list.add("1"); 
		  list.add("2");
		  list.add("50");
		  list.add("100"); 
		  list.add("1000"); 
		  list.add("1999"); 
		  list.add("2000"); 
		  list.add("50"); 
		  
		  Actions actions = new Actions(driver);
		  actions.moveToElement(element).perform();
		  
		  // for valid inputs
		  
		  for (int i = 0; i <= 6; i++) {
		  
		  System.out.println(list.get(i));
		  
		  element.sendKeys(list.get(i));
		  
		  
		  
	
		//  driver.findElement(By.xpath("(//div[contains(@class,'invalid')]/span)[2]"));
		  
		  
		
		  
		  
		 

/*		File excel = new File("C:\\LocalDisk\\Moxiedeck\\Tricentis.xlsx");

		try {
			FileInputStream inputStram = new FileInputStream(excel);
			XSSFWorkbook wb = new XSSFWorkbook(inputStram);
			XSSFSheet sheet1 = wb.getSheet("EnginePerformance");

			int rowCount = sheet1.getLastRowNum() - sheet1.getFirstRowNum();

			for (int i = 0; i < rowCount + 1; i++) {
				int cellCount = sheet1.getRow(i).getLastCellNum();

				System.out.println("Row Num " + i);

				for (int j = 0; j < cellCount; j++) {

					System.out.println(sheet1.getRow(i).getCell(j).getStringCellValue() + ",");
					element.sendKeys(sheet1.getRow(i).getCell(j).getStringCellValue());
				
					
					try {
						WebElement tooltip =driver.findElement(By.xpath("(//div[contains(@class,'invalid')]/span)[2]"));
					} catch (Exception e) {
						
						System.out.println("TC passed");
					}

				}
				System.out.println();
				element.clear();

			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

	}
		  
		  driver.findElement(By.id("engineperformance")).sendKeys("1");	  
}
	
	@Test
	public void NumberOfSeats() {
		
		Select nOS = new Select(driver.findElement(By.id("numberofseats")));
		
		List actualDropdownValuesNOS = new ArrayList();
		
		for (WebElement element : nOS.getOptions()) {
			actualDropdownValuesNOS.add(element.getText());
			
			System.out.println(element.getText());
	}
		
		List expectedDropdownValuesNOS = new ArrayList();
		expectedDropdownValuesNOS.add("– please select –");
		expectedDropdownValuesNOS.add("1");
		expectedDropdownValuesNOS.add("2");
		expectedDropdownValuesNOS.add("3");
		expectedDropdownValuesNOS.add("4");
		expectedDropdownValuesNOS.add("5");
		expectedDropdownValuesNOS.add("6");
		expectedDropdownValuesNOS.add("7");
		expectedDropdownValuesNOS.add("8");
		expectedDropdownValuesNOS.add("9");
		
		for (int i = 0; i < actualDropdownValuesNOS.size(); i++) {
			Assert.assertTrue(actualDropdownValuesNOS.get(i).equals(expectedDropdownValuesNOS.get(i)));
			
		}
		
		nOS.selectByValue("2");
	}
	
	
	

}
