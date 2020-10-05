package stepDefinations;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.*;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinations {

	WebDriver driver;

	public String appURL = "https://sit.msweb.vcm.com/sign-in";

	@Given("^I am on the login page$")
	public void i_am_on_the_login_page() throws Throwable {

		try {
			//System.setProperty("webdriver.chrome.driver", "com/resources/drivers/chromedriver.exe");
			//driver = new ChromeDriver();
			ChromeOptions chromeOptions = new ChromeOptions();
			driver = new RemoteWebDriver(new URL("http://13.232.47.152:4444/wd/hub"),chromeOptions);
			driver.navigate().to(appURL);
		} catch (Exception e) {
			System.out.println("catch " + e);
		}

	}

	@When("^I enter login credentials$")
	public void i_enter_login_credentials() throws Throwable {

		try {
			driver.findElement(By.xpath("//button[@aria-label='Close status message']")).click();

		} catch (Exception e) {
		}
		driver.findElement(By.id("onlineId")).sendKeys("merrilluser8");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("Pass@123");
		Thread.sleep(3000);
		try {
			driver.findElement(By.xpath("//img[@alt='close icon']")).click();

		} catch (Exception e) {
		}
		Thread.sleep(2000);

	}

	@Then("^I am on the homepage$")
	public void i_am_on_the_homepage() throws Throwable {

		try {

			driver.findElement(By.xpath("//button[@aria-label='More Options']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//span[contains(text(),'Sign Out')]")).click();
			Thread.sleep(1000);

		} catch (Exception ex) {
		}

	}

	@And("^I click on sign in button$")
	public void i_click_on_sign_in_button() throws Throwable {
		driver.findElement(By.xpath("//button[@buttontext='Sign In']")).click();
		Thread.sleep(10000);
		driver.quit();

	}

}
