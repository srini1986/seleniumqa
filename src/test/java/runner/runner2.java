package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//@CucumberOptions(features="Feature",glue="stepDef")
@CucumberOptions(features="C:\\Users\\sdhar\\Downloads\\942019\\NewCode\\src\\test\\resources\\Feature\\CreateIncident.feature",glue={"C:\\Users\\sdhar\\Downloads\\942019\\NewCode\\src\\test\\java\\stepDef\\CreateIncidentDefinitions.java"})
public class runner2 {

}
