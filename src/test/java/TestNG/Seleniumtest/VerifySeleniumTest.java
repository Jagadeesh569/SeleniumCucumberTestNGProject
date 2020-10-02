package TestNG.Seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class VerifySeleniumTest {

	
	
	WebDriver driver;
	
	public String appURL = "https://sit.msweb.vcm.com/sign-in";
	
	@BeforeClass
	public void testSetUp() {
		try {
		System.out.println("LOG ::: Inside testsetup");
		System.setProperty("webdriver.chrome.driver", "com/resources/drivers/chromedriver.exe");		
		driver=new ChromeDriver();
		System.out.println("Launching application URL 2nd test");
		Thread.sleep(3000);
		driver.navigate().to(appURL);
		}catch(Exception e) {System.out.println("catch "+e);}
		
	}
	
	@Test
	public void verifyGooglePageTittle() throws InterruptedException {
		
		System.out.println("Launching application URL 1st test >>>>");
		Thread.sleep(3000);
		String getTitle = driver.getTitle();
		try {
	    	driver.findElement(By.xpath("//button[@aria-label='Close status message']")).click();
	    	
	    }catch(Exception e) {}
		driver.findElement(By.id("onlineId")).sendKeys("merrilluser8");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("Pass@123");
	    Thread.sleep(3000);
	    try {
	    	driver.findElement(By.xpath("//img[@alt='close icon']")).click();
	    	
	    }catch(Exception e) {}
	    Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@buttontext='Sign In']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[@aria-label='More Options']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Sign Out')]")).click();
		Thread.sleep(1000); 
		
	}
	
	@Test
	public void verifyGooglePageSearche() throws InterruptedException {
		
		
		driver.manage().window().maximize();
		String getTitle = driver.getTitle();
		System.out.println("First  is =>"+getTitle);
		try {
	    	driver.findElement(By.xpath("//button[@aria-label='Close status message']")).click();
	    	
	    }catch(Exception e) {}
		driver.findElement(By.id("onlineId")).sendKeys("merrilluser8");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("Pass@123");
		Thread.sleep(3000);
	    try {
	    	driver.findElement(By.xpath("//img[@alt='close icon']")).click();
	    	
	    }catch(Exception e) {}
	    Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@buttontext='Sign In']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[@aria-label='More Options']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Sign Out')]")).click();
		Thread.sleep(1000); 
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	
}
