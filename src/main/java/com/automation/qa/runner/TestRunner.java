package com.automation.qa.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/Users/Olasunkanmi/Documents/workspace/CucumberJUNIT",
		glue = {"com.automation.qa.stepDefinitions"},
		plugin = {"pretty","html:test-output"},
		dryRun=true,
		monochrome = true
		)

public class TestRunner {

}
