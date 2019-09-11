package runner;

import org.junit.runner.RunWith;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.PickleEventWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

//@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src/test/resources/Feature/loginpixeel.feature",
		glue = {"stepDef"},
		tags = {"@Run"}
		//plugin = {"pretty", "html:target/cucumber-reports/cucumber-pretty",
		  //      "json:target/cucumber-reports/CucumberTestReport.json", "rerun:target/cucumber-reports/rerun.txt" }
				)

public class LaunchURLRunner extends AbstractTestNGCucumberTests {

	
	
}
