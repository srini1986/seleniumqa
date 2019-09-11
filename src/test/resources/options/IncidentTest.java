package options;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty"},
		glue = {"src/test/java/stepDef/CreateIncidentDefinitions.java"},
		features = {"src/test/resources/Feature/CreateIncident.feature"})
public class IncidentTest {}
