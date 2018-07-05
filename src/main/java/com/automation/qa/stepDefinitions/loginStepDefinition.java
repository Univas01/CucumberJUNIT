package com.automation.qa.stepDefinitions;

import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.automation.qa.utility.WaitMethods;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginStepDefinition {
	
	static WebDriver driver;
	
	@Given("^I'm on CRM login page$")
	public void i_m_on_CRM_login_page() {
		System.setProperty("webdriver.chrome.driver", "/Users/Olasunkanmi/Documents/workspace/CucumberJUNIT/browsers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.freecrm.com/index.html");
	}

	@When("^I login with valid username and password$")
	public static void i_login_with_valid_username_and_password(){
		WebElement userName = driver.findElement(By.name("username"));
		userName.clear();
		WaitMethods.sendKeys(driver, userName, 3, "univas01");
		
		WebElement password = driver.findElement(By.name("password"));
		password.clear();
		WaitMethods.sendKeys(driver, password, 3, "Computer1!");
		
		WebElement submitBtn = driver.findElement(By.xpath("//input[@value='Login']"));
		JavascriptExecutor jse =  (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", submitBtn);
	}

	@Then("^I should login successfully with page title displayed as \"([^\"]*)\"$")
	public void i_should_login_successfully_with_page_title_displayed_as(String CRMPRO) {
		String pageTitle = driver.getTitle();
		Assert.assertEquals(CRMPRO, pageTitle);
		WaitMethods.quitMethod(driver);
	}
}
