package options;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty"},
		glue = {"C:\\Users\\sdhar\\Downloads\\942019\\NewCode\\src\\test\\java\\stepDef\\CreateIncidentDefinitions.java"},
		features = {"C:\\Users\\sdhar\\Downloads\\942019\\NewCode\\src\\test\\resources\\Feature\\CreateIncident.feature"})
public class IncidentTest {}
