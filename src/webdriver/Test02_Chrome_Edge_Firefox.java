package webdriver;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test02_Chrome_Edge_Firefox {
	WebDriver driver;
	
	@Test
	public void TC_Firefox() {
		driver= new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.quit();
	}
	
	@Test
	public void TC_Chrome() {
		System.setProperty("webdriver.chrome.driver", ".\\Brower-driver\\chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.quit();
	}
	
	@Test
	public void TC_Edge() {
		System.setProperty("webdriver.chrome.driver", ".\\Brower-driver\\msedgedriver.exe");
		driver= new EdgeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.quit();
	}
	
}

