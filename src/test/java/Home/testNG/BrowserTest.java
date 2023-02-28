package Home.testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BrowserTest {
	

		
		WebDriver driver;
		
		@Parameters({"browser"})
		@Test
		public void launch(String browserName) {
			if(browserName.equals("Chrome")) {
				driver= new ChromeDriver();
			}else if(browserName.equals("Edge")){
				//Need to setup the system property for driuver.firefox.
				driver= new EdgeDriver();
			}
			
			System.out.println("Browser opened");
			
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			driver.close();
		}
		
	}


