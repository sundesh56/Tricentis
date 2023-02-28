package TricentisPages;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://sampleapp.tricentis.com/101/index.php");
		driver.manage().window().maximize();

		if (driver.findElement(By.id("tricentis_logo")).isDisplayed()) {

			System.out.println("You navigated to correct Website - TC1 passed");
		} else {

			System.out.println("You navigated to wrong Website - TC1 failed");
		}

		String title1 = driver.getTitle();
		driver.findElement(By.id("app_sub_title")).click();
		String title2 = driver.getTitle();

		if (title1.contentEquals(title2)) {

			System.out.println("Website navigate to main page - TC2 is passed");
		} else {

			System.out.println("Website not navigate to main page - TC2 is failed");
		}

		driver.findElement(By.id("visitsupport")).click();

		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		String title3 = driver.getTitle();
		System.out.println(title3);

		if (title3.contains("Support")) {

			System.out.println("Website navigated to the support page - TC3 is passed");
		} else {

			System.out.println("Website not navigated to the support page - TC3 is failed");
		}

	}
}
