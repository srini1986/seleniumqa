package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//@CucumberOptions(features="Feature",glue="stepDef")
@CucumberOptions(features="src/test/resources/Feature/Login.feature",glue={"stepDef"})
public class runner {

}
