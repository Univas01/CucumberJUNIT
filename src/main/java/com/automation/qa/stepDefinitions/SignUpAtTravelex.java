package com.automation.qa.stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignUpAtTravelex {

	static WebDriver driver;
	WebElement firstName,middleName,lastName,email;
	
	@Given("^User is on Sign Up page$")
	public void user_is_on_Sign_Up_page()  {
		System.setProperty("webdriver.chrome.driver", "/Users/Olasunkanmi/Documents/workspace/CucumberJUNIT/browsers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://wire.travelex.co.uk/register");
		
	}

	@When("^the user fills all the required information correctly$")
	public void the_user_fills_all_the_required_information_correctly() {
		 firstName = driver.findElement(By.id("firstName"));
		 middleName = driver.findElement(By.name("middleName"));
		 lastName = driver.findElement(By.id("lastName"));
		 email = driver.findElement(By.id("email"));
		
		
	}

	@When("^the form is submitted$")
	public void the_form_is_submitted() {
		
	}

	@Then("^user should be re-directed to welcome page$")
	public void user_should_be_re_directed_to_welcome_page() {
		
		
	}

}
