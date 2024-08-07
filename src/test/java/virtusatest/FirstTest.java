package virtusatest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {

	@Test
	public void firstTestCase() {
		
		ChromeOptions options = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		options.addArguments("--remote-allow-orgins=*");
		options.addArguments("--headless");
		options.addArguments("--disable-dev-shm-usage");
		options.addArguments("--ignore-ssl-errors=yes");
		options.addArguments("--ignore-certificate-errors");
		// options.setExperimentalOption("prefs", chromePrefs);
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-extensions");
		options.addArguments("--disable-gpu");
		WebDriver driver = new ChromeDriver(options);
		
		System.out.println("Launch Google");
		
		driver.get("https://www.google.com/");
		Assert.assertEquals("Google", driver.getTitle());
		
		WebElement element=driver.findElement(By.name("q"));
		
		element.sendKeys("Selenium Java");
		
		element.submit();
		Assert.assertEquals("Selenium Java - Google Search", driver.getTitle());
		driver.close();
	}
	

	@Test
	public void secondTestCase() {
		
		ChromeOptions options = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		options.addArguments("--remote-allow-orgins=*");
		options.addArguments("--headless");
		options.addArguments("--disable-dev-shm-usage");
		options.addArguments("--ignore-ssl-errors=yes");
		options.addArguments("--ignore-certificate-errors");
		// options.setExperimentalOption("prefs", chromePrefs);
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-extensions");
		options.addArguments("--disable-gpu");
		WebDriver driver = new ChromeDriver(options);
		
		System.out.println("Launch Google");
		
		driver.get("https://www.google.com/");
		Assert.assertEquals("Google", driver.getTitle());
		
		
		WebElement element=driver.findElement(By.name("q"));
		
		element.sendKeys("Selenium Java");
		
		element.submit();
		Assert.assertEquals("Selenium Java - Google Search", driver.getTitle());
		driver.close();
	}

	@Test
	public void thirdTestCase() {
		
		ChromeOptions options = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		options.addArguments("--remote-allow-orgins=*");
		options.addArguments("--headless");
		options.addArguments("--disable-dev-shm-usage");
		options.addArguments("--ignore-ssl-errors=yes");
		options.addArguments("--ignore-certificate-errors");
		// options.setExperimentalOption("prefs", chromePrefs);
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-extensions");
		options.addArguments("--disable-gpu");
		WebDriver driver = new ChromeDriver(options);
		
		System.out.println("Launching Connect Google");
		
		driver.get("https://dev.connect.nonprod.gcpdnb.net/idaas-login");
		Assert.assertEquals("D&B Connect", driver.getTitle());
		
		
		// WebElement element=driver.findElement(By.name("q"));
		
		// element.sendKeys("Selenium Java");
		
		// element.submit();
		// Assert.assertEquals("Selenium Java - Google Search", driver.getTitle());
		driver.close();
	}

}
