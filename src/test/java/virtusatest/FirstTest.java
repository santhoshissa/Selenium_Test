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

	// @Test
	// public void firstTestCase() {
		
	// 	ChromeOptions options = new ChromeOptions();
	// 	WebDriverManager.chromedriver().setup();
	// 	options.addArguments("--remote-allow-orgins=*");
	// 	options.addArguments("--headless");
	// 	options.addArguments("--disable-dev-shm-usage");
	// 	options.addArguments("--ignore-ssl-errors=yes");
	// 	options.addArguments("--ignore-certificate-errors");
	// 	// options.setExperimentalOption("prefs", chromePrefs);
	// 	options.addArguments("--no-sandbox");
	// 	options.addArguments("--disable-extensions");
	// 	options.addArguments("--disable-gpu");
	// 	WebDriver driver = new ChromeDriver(options);
		
	// 	System.out.println("Launch Google");
		
	// 	driver.get("https://www.google.com/");
	// 	Assert.assertEquals("Google", driver.getTitle());
		
	// 	WebElement element=driver.findElement(By.name("q"));
		
	// 	element.sendKeys("Selenium Java");
		
	// 	element.submit();
	// 	Assert.assertEquals("Selenium Java - Google Search", driver.getTitle());
	// 	driver.close();
	// }
	

	// @Test
	// public void secondTestCase() {
		
	// 	ChromeOptions options = new ChromeOptions();
	// 	WebDriverManager.chromedriver().setup();
	// 	options.addArguments("--remote-allow-orgins=*");
	// 	options.addArguments("--headless");
	// 	options.addArguments("--disable-dev-shm-usage");
	// 	options.addArguments("--ignore-ssl-errors=yes");
	// 	options.addArguments("--ignore-certificate-errors");
	// 	// options.setExperimentalOption("prefs", chromePrefs);
	// 	options.addArguments("--no-sandbox");
	// 	options.addArguments("--disable-extensions");
	// 	options.addArguments("--disable-gpu");
	// 	WebDriver driver = new ChromeDriver(options);
		
	// 	System.out.println("Launch Google");
		
	// 	driver.get("https://www.google.com/");
	// 	Assert.assertEquals("Google", driver.getTitle());
		
		
	// 	WebElement element=driver.findElement(By.name("q"));
		
	// 	element.sendKeys("Selenium Java");
		
	// 	element.submit();
	// 	Assert.assertEquals("Selenium Java - Google Search", driver.getTitle());
	// 	driver.close();
	// }

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
		options.addArguments("--remote-debugging-port=8777");

		System.setProperty("webdriver.chrome.whitelistedIps", "");
		
		options.addArguments("--window-size=1920,1080");
		options.addArguments("--disable-software-rasterizer");
		WebDriver driver = new ChromeDriver(options);
		// WebDriver driver = new ChromeDriver(options);

		
		
		System.out.println("Launching Connect Google");
		driver.get("https://stg.sso.dnb.com/app/dnb-stg_dnbconnectqagcve_1/exke2qihwzs6GPER21d7/sso/saml?SAMLRequest=nVNNj9owEP0rke%2BJExbxYQEShe0WiUIEbA%2B9IGMPYG1iB3sCdH99nQBdDl1U9WRr5s3Me8%2FjnuN5VrBhiXu9gEMJDoNznmnH6kSflFYzw51yTPMcHEPBlsPvU9aIYlZYg0aYjNyVPK7gzoFFZTQJJuM%2Bmc%2Bep%2FOXyWydbDtJJ97KsCniVtiEVjvsNjYQxu1EyO4mljyRJPgB1vnaPvGtfAPnSphoh1yjD8WNZhh3wqd4lTyxJGZJ9ycJxl6P0hzrqj1i4RilDneRcyaSehMJk1NeFNTfQx9f%2B1MYrUHgge%2FEEdYJhfMbNA5qf3p3rZf0edFIZJv6elrJJUF6NeGL0lLp3WP9mwvIsW%2BrVRqm8%2BWKBMObJyOjXZmDXYI9KgGvi%2BkHZwnH6Eos0kZ752W0E0UlQQPSInMUNIItrHJQkePCUQ9Yo3dgLf3FvCEng15FmtXW2cF%2FN88BueTIe%2FS%2BXe%2BySzOvejJOTabEr%2BCrsTnHz01JoqSOKBluayiDnKtsKKX1k7w5WWZOIwscoU%2FQlkACeht03VeQ9fZ69xDOGIxMXnBPtHpxOHOBN9H3qFHmN3EB28HDZRVMVDgf%2FkdY6o%2BTsfLqy18nXnKfsP%2BTvf%2BQg98%3D&RelayState=https%3A%2F%2Fdev.connect.nonprod.gcpdnb.net%2F");
	    // driver.manage().window().setSize(new Dimension(1226, 741));
	    driver.findElement(By.id("input28")).sendKeys("dcpqa_auto_ba01@dnb.mailinator.com");
	    driver.findElement(By.cssSelector(".button")).click();
		
		// driver.get("https://dev.connect.nonprod.gcpdnb.net/");
		// Assert.assertEquals("dnb-stg - Sign In", driver.getTitle());
		
		
		// WebElement element=driver.findElement(By.name("identifier"));
		
		// element.sendKeys("dcpqa_auto_ba01@dnb.mailinator.com");

		// WebElement button = driver.findElement(By.xpath("//*[@id='form20']/div[2]/input")).click();
		
		// button.click();

		// driver.get("https://dev.connect.nonprod.gcpdnb.net/");
		// Assert.assertEquals("dnb-stg - Sign In", driver.getTitle());
		
		
		// WebElement element=driver.findElement(By.id("input28"));
		
		// element.sendKeys("dcpqa_auto_ba01@dnb.mailinator.com");
		
		// WebElement button = driver.findElement(By.xpath("//*[@id='form20']/div[2]/input"));
		
		// button.click();
		

		// WebElement element=driver.findElement(By.name("credentials.passcode"));
		
		// element.sendKeys("dcpqa_auto_ba01@dnb.mailinator.com");

		// WebElement buttons = driver.findElement(By.xpath('//*[@id="form51"]/div[2]/input')).click();
		
		// buttons.click();
		
		// WebElement buttonss = driver.findElement(By.xpath('//*[@id="root"]/div/div[2]/div/div/div/div[2]/div[3]/a/span')).click();
		
		// buttonss.click();
		
		// element.submit();
		// Assert.assertEquals("Selenium Java - Google Search", driver.getTitle());
		driver.close();
	}

}
