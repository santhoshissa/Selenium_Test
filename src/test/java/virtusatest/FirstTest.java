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
        //y
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
		driver.get("https://dev.connect.nonprod.gcpdnb.net/idaas-login");
	    // driver.manage().window().setSize(new Dimension(1226, 741));
		    driver.findElement(By.id("username")).sendKeys("fulailm@dnb.com");
		    driver.findElement(By.id("password")).sendKeys("!QAZ2wsx34");
		    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[2]/button")).click();
		    // driver.findElement(By.cssSelector("_button_1r013_215")).click();
		// element = driver.find_element_by_class_name('_button_1r013_215');
		// driver.execute_script("arguments[0].scrollIntoView()", element);
		// driver.execute_script("arguments[0].click()", element);
		
		
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
